package strings;

public class toCountNoOfWords {
public static void main(String[] args) {
	String s= "hello world this is jithendra ";
	char[] ch=s.toCharArray();
	int count=0;
	for(char c:ch) {
		if(c==' ') {
			count++;
		}
}
	System.out.println(count);
}
}
