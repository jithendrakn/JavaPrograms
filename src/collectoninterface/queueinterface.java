package collectoninterface;

import java.util.PriorityQueue;

public class queueinterface {

	public static void main(String[] args) {
		PriorityQueue<String> p=new PriorityQueue<>();
		
		p.add("red");
		p.add("green");
		p.add("blue");
		p.add("white");
		
		String q = p.poll();
		
			System.out.println(q);
			
			
		

	}

}
