package arrays;

public class ReverseStringArray {
public static void main(String[] args) {
	String s="hello";
	String rev="";
	char[] ch=s.toCharArray();
	for(int i=0; i<s.length();i++) {
		rev=ch[i]+rev;
	}
	System.out.println(rev);
}
}
