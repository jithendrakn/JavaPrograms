package strings;

public class removeSpaceInString {
public static void main(String[] args) {
	String s="today is dhoni birthday";
	System.out.println(s);
	char[] ch=s.toCharArray();
	for(int i=0;i<ch.length;i++) {
		if((ch[i])!=' ') {
			System.out.print(ch[i]);
		}
	}
 }
}
