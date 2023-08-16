package collectoninterface;

import java.util.ArrayList;

public class addmethod {

	public static void main(String[] args) {
	ArrayList al=new ArrayList();
	
	al.add(100);
	al.add("india");
	al.add(18);
	al.add('d');
	
	System.out.println(al);
	
	for(Object en:al)
	{
		System.out.println(en);
	}

}
}