package oops;

public class account {

	
		private int accno;
		private String name;
		double bal;
		String IFSCcode;
		String address;
		private int phoneno;
		
		public account() {
			super();
		}

		public account(int accno, String name, double bal) {
			super();
			this.accno = accno;
			this.name = name;
			this.bal = bal;
		}
		
		
		public account(int accno, String name, double bal, String iFSCcode, String address, int phoneno) {
			super();
			this.accno = accno;
			this.name = name;
			this.bal = bal;
			IFSCcode = iFSCcode;
			this.address = address;
			this.phoneno = phoneno;
		}

		void debit(double amt) {
			if(amt<=bal) {
				bal=bal-amt;
				System.out.println(amt + " is withdrawn sucessfully ");
				System.out.println("remaining bal : "+ bal);
			}
			else
				System.out.println("insufficient balance");
		}
		void credit(double amt) {
			bal=bal+amt;
			System.out.println("credited amount is: "+ amt);
			System.out.println("total avialable balanace: "+ bal);
		}
		
		public int getAccno() {
			return accno;
		}

		public void setAccno(int accno) {
			this.accno = accno;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getPhoneno() {
			return phoneno;
		}

		public void setPhoneno(int phoneno) {
			this.phoneno = phoneno;
		}

		void display(){
			//System.out.println("account number : " + accno);
			//System.out.println("account holder name : " + name);
			System.out.println("account balance : " + bal);
			System.out.println("bank IFSC code : " + IFSCcode);
			System.out.println("address of bank : " + address);
			//System.out.println("phone number of account holder : " + phoneno );
		}
}
