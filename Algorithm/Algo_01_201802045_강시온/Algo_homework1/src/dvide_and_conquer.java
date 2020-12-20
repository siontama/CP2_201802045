import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class dvide_and_conquer {
	public static void main(String[] args)  throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("hw1_test_case1.txt"));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, ",");;
		int a[] = new int[100];
		int i=0;
		while(st.hasMoreTokens()) {
			a[i] = Integer.parseInt(st.nextToken());
			i++;
		}
		System.out.println("purchase data : " + maxmin(a,0,16).leftindex);
		System.out.println("sell data : " + maxmin(a,0,16).rightindex);
		System.out.println("profit : " + maxmin(a,0,16).result);
		System.out.println();
		
		BufferedReader br2 = new BufferedReader(new FileReader("hw1_test_case2.txt"));
		String str2 = br2.readLine();
		StringTokenizer st2 = new StringTokenizer(str2, ",");;
		int a2[] = new int[100];
		int i2=0;
		while(st2.hasMoreTokens()) {
			a2[i2] = Integer.parseInt(st2.nextToken());
			i2++;
		}
		System.out.println("purchase data : " + maxmin(a2,0,4).leftindex);
		System.out.println("sell data : " + maxmin(a2,0,4).rightindex);
		System.out.println("profit : " + maxmin(a2,0,4).result);
		
	}
	
	public static node maxmin(int[] arr, int low, int high) {
		int m;
		node result, left, right;
		m = (low + high) / 2;
		if(low == high) return new node(low, high, 0, low, high);
		
		left = maxmin(arr, low, m);
		right = maxmin(arr, m+1, high);
		int crossresult = arr[right.max] - arr[left.min];
		result = new node();
		result.min = arr[left.min]<arr[right.min]?left.min:right.min;
		result.max = arr[left.max]>arr[right.max]?left.max:right.max;
		result.result = left.result > right.result ? left.result:right.result;
		result.leftindex = left.result > right.result ? left.leftindex:right.leftindex;
		result.rightindex = left.result > right.result ? left.rightindex:right.rightindex;
		if(result.result > crossresult) {
			result.result = result.result;
		} else {
			result.result = crossresult;
			result.leftindex = left.min;
			result.rightindex = right.max;
		}
		
		return result;
	}
}

class node {
	int max, min;
	int result;
	int leftindex, rightindex;
	node(int max, int min, int result, int leftindex, int rightindex){
		this.max = max;
		this.min = min;
		this.result = result;
		this.leftindex = leftindex;
		this.rightindex = rightindex;
	}
	node(){
	}
}