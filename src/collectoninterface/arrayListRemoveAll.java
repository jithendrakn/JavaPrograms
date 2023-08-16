package collectoninterface;

import java.util.ArrayList;

public class arrayListRemoveAll {
public static void main(String[] args) {
	ArrayList a=new ArrayList<>();
	a.add(10);
	a.add(20);
	a.add(30);
	a.add(20);
	System.out.println(a);
	ArrayList b=new ArrayList<>();
	b.add(30);
	b.add(40);
	System.out.println(b);
	a.removeAll(b);
	System.out.println(a);
	
}
}
