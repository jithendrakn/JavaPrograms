package strings;

import java.util.Scanner;

public class countString {
public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String s1=sc.next();
	int count=0;
	int count1=0;
	for(int i=0;i<s1.length();i++) {
			if(s1.toUpperCase() != null) {
				count++;
			}
			else if(s1.toLowerCase() != null) {
				count1++;
			}
	}
	System.out.println("upper case = " + count);
	System.out.println("lower case = " + count1);
}
}
