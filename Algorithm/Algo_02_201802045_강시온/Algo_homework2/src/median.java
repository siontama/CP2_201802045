import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class median {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("hw2_test_case1.txt"));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, ",");
		int a1[] = new int[100];
		int i = 0;
		while (st.hasMoreTokens()) {
			a1[i] = Integer.parseInt(st.nextToken());
			i++;
		}
		str = br.readLine();
		st = new StringTokenizer(str, ",");
		int a2[] = new int[100];
		i = 0;
		while (st.hasMoreTokens()) {
			a2[i] = Integer.parseInt(st.nextToken());
			i++;
		}
		
		System.out.println(mediannum(a1,a2,0,4,0,4));
		
		
		br = new BufferedReader(new FileReader("hw2_test_case2.txt"));
		str = br.readLine();
		st = new StringTokenizer(str, ",");
		int a3[] = new int[100];
		i = 0;
		while (st.hasMoreTokens()) {
			a3[i] = Integer.parseInt(st.nextToken());
			i++;
		}
		str = br.readLine();
		st = new StringTokenizer(str, ",");
		;
		int a4[] = new int[100];
		i = 0;
		while (st.hasMoreTokens()) {
			a4[i] = Integer.parseInt(st.nextToken());
			i++;
		}
		
		System.out.println(mediannum(a3,a4,0,3,0,3));
	}

	public static int mediannum(int[] a, int[] b, int lefta, int righta, int leftb, int rightb) {
		if(lefta==righta && leftb==rightb) {
			return a[lefta]<b[leftb]?a[lefta]:b[leftb];
		}
		int mida = (lefta + righta) / 2;
		int midb = (leftb + rightb) / 2;
		if (a[mida] < b[midb]) {
			if((righta-lefta)%2==0)mida-=1;
			return mediannum(a, b, mida + 1, righta, leftb, midb);
		} else {
			if((rightb-leftb)%2==0)midb-=1;
			return mediannum(a, b, lefta, mida, midb + 1, rightb);
		}
	}
}
