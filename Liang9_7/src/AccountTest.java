
public class AccountTest {

	public static void main(String[] args) {
		
		Account account = new Account(1122,20000.0,4.5);
		
		System.out.println("Id:" + account.getId());
		System.out.println("Balance:" + account.getBalance());
		System.out.println("annualInterestRate:" + account.getAnnualInterestRate());
		System.out.println("yatırılmıs newbalance:" + account.withdraw());
		System.out.println("cekilmis newbalance:" + account.deposit());
		
		
		
	}

}
