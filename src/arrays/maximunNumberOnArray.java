package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class maximunNumberOnArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of an array");
	int size =sc.nextInt();
	int[] a=new int[size];
	System.out.println("enter the elements of array");
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	Arrays.sort(a);
	System.out.println("maximum number of an array is");
	System.out.println(a[a.length-1]);
	System.out.println("smallest number of an array is");
	System.out.println(a[0]);
	System.out.println("second smallest element of an array");
	System.out.println(a[1]);
	System.out.println("second largest element of an array");
	System.out.println(a[a.length-2]);
}
}
