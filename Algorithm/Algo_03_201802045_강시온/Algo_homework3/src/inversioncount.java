import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class inversioncount {
	static int c = 0;
	public static void merge(int a[], int low, int middle, int high) {
		int[] sorted = new int[100];
		int l = low;
		int h = middle + 1;
		int k = low;
		
		while (l <= middle && h <= high) {
			if (a[l] < a[h]) {
				sorted[k] = a[l];
				l++;
			} else {
				c+=middle+1-l;
				sorted[k] = a[h];
				h++;
			}
			k++;
		}

		if (l > middle) {
			for (int t = h; t <= high; t++) {
				sorted[k++] = a[t];
			}
		} else {
			for (int t = l; t <= middle; t++) {
				sorted[k++] = a[t];
			}
		}

		for (int t = low; t <= high; t++) {
			a[t] = sorted[t];
		}
	}

	public static void mergeSort(int a[], int m, int n) {
		int middle;
		if (m < n) {
			middle = (m + n) / 2;
			mergeSort(a, m, middle);
			mergeSort(a, middle + 1, n);
			merge(a, m, middle, n);
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("hw3_test_case1.txt"));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, ",");
		int a1[] = new int[100];
		int count = 0;
		while (st.hasMoreTokens()) {
			a1[count] = Integer.parseInt(st.nextToken());
			count++;
		}

		mergeSort(a1, 0, count-1);
		for (int i = 0; i < count; i++) {
			System.out.print(a1[i] + " ");
		}
		System.out.println();
		System.out.println(c);
		
		c=0;
		br = new BufferedReader(new FileReader("hw3_test_case2.txt"));
		str = br.readLine();
		st = new StringTokenizer(str, ",");
		int a2[] = new int[100];
		count = 0;
		while (st.hasMoreTokens()) {
			a2[count] = Integer.parseInt(st.nextToken());
			count++;
		}
		
		mergeSort(a2, 0, count-1);
		for (int i = 0; i < count; i++) {
			System.out.print(a1[i] + " ");
		}
		System.out.println();
		System.out.println(c);
	}
}
