import java.util.Arrays;

public class Matrix {
	int row;
	int countrow = 0;
	int col;
	int countcol = 0;
	double[][] matrix;

	public void setMatrix(double... d) {
		for (double a : d) {
			matrix[countrow][countcol] = a;
			countcol++;
		}
		countrow++;
		countcol = 0;
	}

	public Matrix multiMatrix(Matrix otherMatrix) {
		Matrix S = new Matrix(row, otherMatrix.col);
		double sum = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < otherMatrix.col; j++) {
				sum = 0;
				for (int k = 0; k < this.col; k++) {
					sum += matrix[i][k] * otherMatrix.matrix[k][j];
				}
				S.matrix[i][j] = sum;
			}
		}
		return S;
	}

	public Matrix addMatrix(Matrix otherMatrix) {
		Matrix S = new Matrix(row, otherMatrix.col);
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				S.matrix[i][j] = matrix[i][j] + otherMatrix.matrix[i][j];
			}
		}
		return S;
	}

	public Matrix transposed() {
		Matrix S = new Matrix(col, row);
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				S.matrix[i][j] = matrix[j][i];
			}
		}
		return S;
	}
	public void print() {
		System.out.print("[");
		for (int i = 0; i < row - 1; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
		System.out.print(Arrays.toString(matrix[row - 1]));
		System.out.println("]");
	}

	public Matrix(int row, int col) {
		this.row = row;
		this.col = col;
		matrix = new double[row][col];
	}
}
