package strings;

public class selectDuplicateValues {
	
public static void main(String[] args) {
	String s="Testing";
	System.out.println(s);
	String s1=s.toLowerCase();
	int count;
    
    char[] ch=s1.toCharArray();
	//System.out.println(ch[2]);
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
