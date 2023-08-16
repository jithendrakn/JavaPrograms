package oops;

public class Encp {
	
		int accno;
		private String name;
		private String IFSCCODE;
		private double bal;
		Encp(){
			 }
		public Encp(String name, double bal) {
			super();
			this.name = name;
			this.bal = bal;
		}
		Encp(int accno,String name,String IFSCCODE,double bal){
			this.accno=accno;
			this.name=name;
			this.IFSCCODE=IFSCCODE;
			this.bal=bal;
		}
		
		void savingaccno() {
			System.out.println("account number : " + accno);
			System.out.println("account holder name : " + name);
			System.out.println("account holder IFSC CODE: " + IFSCCODE);
			System.out.println("account balance : " + bal);
		}

}
