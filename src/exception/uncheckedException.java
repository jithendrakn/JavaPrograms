package exception;

public class uncheckedException {
public static void main(String[] args) {
	int a=10;
	int b=0;
	try {
	int c=a/b;
	}
	catch(ArithmeticException e) {
		e.printStackTrace();
	System.out.println(e.toString());
	System.out.println(e.getMessage());
	}
	System.out.println("SuccesFull");
}
}
