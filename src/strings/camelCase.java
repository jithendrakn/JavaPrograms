package strings;

public class camelCase {
public static void main(String[] args) {
	String s="Happy Independence Day";
	char[] ch=s.toCharArray();
	System.out.println(ch);
	for(int i=0;i<ch.length;i++) {
		for(int j =i+1;j<ch.length;j++) {
			if(ch[i]==ch[j]) {
				System.out.println(ch[i]);
				break;
			}
		}
	}
}
}
