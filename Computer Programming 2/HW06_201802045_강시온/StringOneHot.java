import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;

public class StringOneHot {
	String str;
	HashSet<String> s = new HashSet<String>();
	HashMap<Integer, String> m = new HashMap<Integer, String>();
	HashMap<String, Vector<Integer>> hot = new HashMap<String, Vector<Integer>>();
	
	public StringOneHot(String str) {
		this.str = str;
		for (int i = 0; i < str.length(); i++) {
			s.add(str.charAt(i) + "");
		}
		Iterator<String> e = s.iterator();
		Iterator<String> e2 = s.iterator();
		
		for(int i=0; e.hasNext()!=false;i++) {
			m.put(i, e.next());
		}
		
		for(int i=0; e2.hasNext()!=false;i++) {
			Vector<Integer> v = new Vector<Integer>();
			for(int j=0;j<s.size();j++)
			{
				if(i == j)v.add(1);
				else v.add(0);
			}
			hot.put(e2.next(), v);
		}
	}

	public String getString() {
		return str;
	}

	public HashSet<String> getStrSet() {
		return s;
	}

	public HashMap<Integer, String> getStrMap() {
		return m;
	}
	
	public HashMap<String, Vector<Integer>> getStrOneHotVec() {
		return hot;
	}

	public static void main(String[] args) {
		String str = "Hello";
		StringOneHot soh = new StringOneHot(str);
		System.out.println("문자열 :" + soh.getString());
		System.out.println("문자열 Set: " + soh.getStrSet());
		System.out.println("문자열 Map: " + soh.getStrMap());
		System.out.println("문자열 One-hot Vector :" + soh.getStrOneHotVec());
		System.out.println("One-hot Vector로 나타낸 " + soh.getString());
		for (int i = 0;i < str.length(); i++) {
			System.out.println(soh.getStrOneHotVec().get(str.substring(i, i + 1)));
		}
	}
}
