package collectoninterface;

import java.util.LinkedList;

public class linkedList {

	public static void main(String[] args) {
		LinkedList<Comparable> l1 = new LinkedList<Comparable>();
		l1.add(10);
		l1.add("kohli");
		l1.add('J');
		l1.add(10.8);
		l1.add(true);
		
		System.out.println(l1);
		System.out.println(l1.size());
		
		//remove
		l1.remove(2);
		
		System.out.println(l1);
		
		//contains
		System.out.println(l1.contains(true));
		System.out.println(l1.contains("russel"));
		
		//search element
		System.out.println(l1.get(1));
	}

}
