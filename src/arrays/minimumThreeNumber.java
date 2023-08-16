package arrays;

import java.util.Arrays;

public class minimumThreeNumber {
public static void main(String[] args) {
	int[] a= {10,15,4,8,3};
	Arrays.sort(a);
	int sum=0;
	for(int i=0;i<3;i++) {
		sum=sum+a[i];
	}
	System.out.println(sum);
}
}
