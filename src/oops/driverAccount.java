package oops;

public class driverAccount {
public static void main(String[] args) {
	account a1=new account();
	a1.debit(5000);
	System.out.println("***************");
	System.out.println(a1.getAccno());
	a1.display();
	System.out.println("*************");
	account a2=new account(123,"dings",1000.0);
	a2.credit(2000);
	System.out.println(a2.getAccno());
	System.out.println("***************");
	a2.display();
	System.out.println("***************");
	account a3=new account(123,"digna",8500.0,"CNRB123","KADAGATTUR",359741211);
	a3.debit(3000);
	System.out.println("THE ACCOUNT NUMBER IS : " + a3.getAccno());
	System.out.println("***************");
	a3.display();
	System.out.println("***************");
	a3.credit(2000);
	System.out.println("***************");
	a3.display();
	System.out.println("***************");
}
}
