import java.util.*;
public class Nextpermutation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[] = {1, 2, 3, 4};
		do {
			System.out.println(Arrays.toString(a));
		}while(next_permutation(a));
	}
	static boolean next_permutation(int a[]) {
		if(a.length <= 1) return false;
		int p = a.length - 2, q = a.length - 1;
		while(p >= 0 && a[p] >= a[p+1]) p--;
		if(p < 0) return false; 
		while(a[q] <= a[p]) q--;
		int tmp = a[p]; a[p] = a[q]; a[q] = tmp;
		for(int l=p+1, r= a.length-1; l<r; l++, r--) {
			tmp = a[l]; a[l] = a[r]; a[r] = tmp;
		}
		return true;
	}
}