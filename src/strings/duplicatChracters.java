package strings;

public class duplicatChracters {

	public static void main(String[] args) {
		
	
	String s="aardkk";
	char[] ch = s.toCharArray();
	
//	System.out.println(ch[1]);
	
	for(int i=0;i<ch.length;i++) {
		for(int j=i+1;j<ch.length;j++) {
			if(ch[i]==ch[j]) {
			System.out.println(ch[i]);
			break;
			}
		}
		
	}
	}
	
}
