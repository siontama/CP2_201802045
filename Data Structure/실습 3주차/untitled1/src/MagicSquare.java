import java.util.Scanner;

public class MagicSquare {
    int matrix[][];
    int row;
    int column;
    int number;
    int size;

	public MagicSquare(int size) {
	    this.size = size;
	    matrix = new int[size][size];
        row = size-1;
        column = size/2;
        number=1;
	}

	public void make() {
        for(int i=0;i<size*size;i++){
            matrix[row++][column++]=number++;
            if(row>=size)row-=size;
            if(column>=size)column-=size;
            if(matrix[row][column]!=0){
                row-=2;
                column-=1;
            }
            if(row<0)row+=size;
            if(column<0)column+=size;
        }
    }

    public void print() {
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public int sumColumn(int column) {
	    int sum=0;
        for(int i=0;i<size;i++){
            sum+=matrix[i][column];
        }
        return sum;
    }

    public int sumRow(int row) {
        int sum=0;
        for(int i=0;i<size;i++){
            sum+=matrix[row][i];
        }
        return sum;
    }

    public int sumDiagonal() {
        int sum=0;
        for(int i=0;i<size;i++){
            sum+=matrix[i][i];
        }
        return sum;
    }

    public static void main(String[] args) {
	    int size;
	    Scanner input = new Scanner(System.in);
        System.out.print("마방진의 크기 : ");
        size = input.nextInt();
        MagicSquare m1 = new MagicSquare(size);
        m1.make();
        m1.print();
    }
}
