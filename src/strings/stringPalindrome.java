package strings;

public class stringPalindrome {
public static void main(String[] args) {
	String s="noon";
	char[] ch=s.toCharArray();
	String rev="";
	for(char c:ch) {
		rev=c+rev;
	}
	System.out.println(rev);
	if(rev.equals(s) ){
		System.out.println("String 's' is an palandrome." );
	}else {
		System.out.println("String 's' is an not a palandrome." );
	}
}
}
