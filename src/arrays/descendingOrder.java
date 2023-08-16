package arrays;

import java.util.Arrays;

public class descendingOrder {
public static void main(String[] args) {
	int[] a= {10,30,85,45,5};
	Arrays.sort(a);
	for(int i=a.length-1;i>=0;i--) {
		System.out.println(a[i]);
	}
}
}
