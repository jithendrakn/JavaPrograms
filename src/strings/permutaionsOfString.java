package strings;

public class permutaionsOfString {
public static void main(String[] args) {
	String s="ABC";
	char[] ch=s.toCharArray();
	String s1="";
	for(int i=0;i<ch.length;i++) {
		for(int j=0;j<ch.length;j++) {
			s1=s1+ch[i];
		}
	}
	System.out.println(s1);
}
}
