package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class sumOfArrays {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size = sc.nextInt();
		int[] a=new int[size];
		System.out.println("enter the elements of an Array");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		int sum= 0;
		for (int i=a.length-3;i<a.length;i++) {
			sum=sum  +  a[i];
		}
		System.out.println("sum of elements of Array: " + sum);
		

	}

}
