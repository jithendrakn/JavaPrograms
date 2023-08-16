package strings;

import arrays.ascendingOrder;

public class LargestOfToNumbers {

	public static void main(String[] args) {
		
	String s="Testing The APPLication";
	
	char[] ch = s.toCharArray();
	int lowerCaseCount=0;
	int upperCaseCount=0;
	
	for(int i =0; i<ch.length;i++) {
		
		
		if(ch[i]>='A' && ch[i]<='Z') {
			upperCaseCount++;
		}
		else {
			lowerCaseCount++;
		}
	}
	
	System.out.println("Lower case: " + lowerCaseCount);
	System.out.println("Upper case: " + upperCaseCount);
	}

}
