import java.util.HashSet;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {
		String A[]={"a", "b","c", "a","z","d"}; 
		Set<String> set= new HashSet<String>();
		int len = A.length;
		for (int i=0; i<len ; i++) {
			for (int j=i+1; j<len; j++) {
				if (!A[i].equals(A[j])) {
				set.add(A[j]);
				}
			}
		}
		System.out.println(set);
	}

}
