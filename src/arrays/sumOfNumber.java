package arrays;

import java.util.Arrays;

public class sumOfNumber {
public static void main(String[] args) {
	int[] a= {10,5,13,9,8,15};
	Arrays.sort(a);
	int sum=0;
	for(int i=a.length-1;i>=a.length-3;i--) {
		sum=sum+a[i];
	}
	System.out.println("sum of first 3 number: " + sum);
}
}
