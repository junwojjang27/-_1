import java.util.Comparator;

public class Insertion {
	private Insertion() {}
	
		public static void sort(Object[] a, Comparator comparator) {
		int n = a.length;
		int i, j;
		Object key;
		
		for(i=1; i<n; i++) {
			key = a[i];
			j = i-1;
			while(j >= 0 && comparator.compare(a[j], key) > 0) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = key;
		}
	}	
}
