package exception;

import java.io.FileInputStream;

public class checkedException {
public static void main(String[] args) {
	try {
	FileInputStream f= new FileInputStream("./drivers");
	}
	catch(Exception e){
		System.out.println(e);	
	}
	
}
}
