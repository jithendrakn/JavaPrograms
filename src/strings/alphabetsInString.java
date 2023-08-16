package strings;

public class alphabetsInString{
	public static void main(String[] args) {
		String s="Hell856";
		int sum=0;
		int count = 0;
		
		for(int i = 0;i<s.length();i++) {
			char[] c=s.toCharArray();
			if(c[i]>='0' && c[i] <='9') {
				count++;
				if(count>0) {
				sum=sum+c[i];
				}
			}
		}
		System.out.println(count);
		System.out.println(sum);
	}
}
