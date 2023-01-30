public class Deposit extends Atm {

	void de(int i) {
		System.out.println("Enter the no. of 100₹ notes");
		int a4=s.nextInt();
		System.out.println("Enter the no. of 200₹ notes");
		int a5=s.nextInt();
		System.out.println("Enter the no. of 500₹ notes");
		int a6=s.nextInt();
		Atm.bal[i]+=a4*100+a5*200+a6*100;
		
		System.out.println("Deposit Successfully !\n Balance is "+Atm.bal[i]);
	}
}
