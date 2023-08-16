package strings;

public class palidromeStringOrNot {
public static void main(String[] args) {
	String s="noon";
	System.out.println(s);
	String s1="";
	char[] ch=s.toCharArray();
	for(int i=0;i<ch.length;i++) {
		s1=s1+ch[i];
	}
	//String s2=ch.toString();
	System.out.println(s1);
	if(s==s1) {
		System.out.println("String is palindrome");
	}else {
		System.out.println("String is not palindrome");
	}
}
}
