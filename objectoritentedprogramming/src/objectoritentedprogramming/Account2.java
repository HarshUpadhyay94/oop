package objectoritentedprogramming;

public class Account2 {

	public static void main(String[] args) {
		Account s=new Account();
		s.setNumber("12345678890");
		s.setAccounttype("saving");
		s.setBalance(1000);
		//s.withdraw(20);
		//s.deposite(50);
		s.paybill(100);
		System.out.println(s.getBalance());
	}
}
