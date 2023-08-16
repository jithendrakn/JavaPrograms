package oops;

public class driverAB {
public static void main(String[] args) {
	abstractionA a=new abstractionB();
	int res=a.add(10, 20);
	System.out.println(res);
}
}
