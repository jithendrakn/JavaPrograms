package collectoninterface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class useageofmap {

	public static void main(String[] args) {

		HashMap h=new HashMap();
		
		h.put(101, "kohli");
		h.put(102, "maxi");
		h.put(103, "abd");
		h.put(104, "dk");
		h.put(105, "faf");
		
		
		Collection h1 = h.values();
		System.out.println(h1);
		
		

	}

}
