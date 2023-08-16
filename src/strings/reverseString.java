package strings;

public class reverseString {
public static void main(String[] args) {
	String s="HELLO";
	char[] ch=s.toCharArray();
	String s1="";
	for(int i = 0; i<ch.length;i++) {
		s1=ch[i]+s1;
	}
	System.out.println(s1);
}
}
