package collectoninterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class excise1 {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add('a');
		a1.add('x');
		a1.add('d');
		a1.add('m');
		
		System.out.println(a1);
		
		a1.trimToSize();
		
		System.out.println(a1);
		a1.ensureCapacity(5);
		a1.add("s");
		System.out.println(a1.size());
	/*	ArrayList a2 = new ArrayList();
		a2.add("1");
		a2.add("2");
		a2.add("3");
		a2.add("4");
		
		System.out.println(a2);
		
		System.out.println(a1.equals(a2));*/
		
	}

}
