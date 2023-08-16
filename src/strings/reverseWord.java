package strings;

public class reverseWord {

	public static void main(String[] args) {

		String str = "Today Is Monday";
		String[] splitStr = str.split(" ");
		String rev = "";
		
		for(int i=splitStr.length-1; i>=0;i--) {
			rev=rev+splitStr[i]+" ";
		}
		
		System.out.println(rev);

	}
}
