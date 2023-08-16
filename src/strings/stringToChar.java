package strings;

public class stringToChar {
public static void main(String[] args) {
	String s="hello";
	char[] ch=s.toCharArray();
	 String s1="";
	for(int i =0;i<ch.length;i++) {
	System.out.println(ch[i]);
		s1=s1+ch[i];
	}
  
  System.out.println(s1);
}
}
