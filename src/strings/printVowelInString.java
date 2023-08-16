package strings;

public class printVowelInString {
public static void main(String[] args) {
	String s="virat kohli";
	char[] ch=s.toCharArray();
	for(char c:ch) {
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			System.out.println(c);
		}
	}
}
}
