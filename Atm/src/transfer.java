public class transfer extends Atm {
	static int i, a12;

	void v(int k) {
		System.out.println("1.Transfer Card to Card\n2.Transfer Card to Bank");
		int a8 = s.nextInt();
		System.out.println("Enter the amount");
		a12 = s.nextInt();
		if (a12 >= Atm.bal[k]) {
			System.out.println("Invalid Balance");
			System.exit(0);
		}
		switch (a8) {
		case 1:
			card(a12,k);
			break;
		case 2:
			bank(a12,k);
			break;

		}
	}

	void bank(int a12,int k) {
		System.out.println("Enter the Account No.");
		int a9 = s.nextInt();
		System.out.println("Re-enter the Account No.");
		int a10 = s.nextInt();
		if (a9 == a10) {
			for (int j = 0; j < Atm.an.length; j++) {
				if (Atm.atm_n[j] == a9) {
					i = j;
					System.out.println("Name of A/c no. is " + Atm.name[i]);
					System.out.println("Type CONFIRM to transfer fund");
					String s1 = s.next();
					if (s1 == "CONFIRM")
						de(i,k);
				} else
					Atm.exit();
			}
		} else
			Atm.exit();
	}

	void de(int i,int k) {
		Atm.bal[k]-=a12;
		Atm.bal[i]+=a12;
		System.out.println("Transaction succesfully complete");
	}

	void card(int a12,int k) {
		System.out.println("Enter the Card No.");
		int a9 = s.nextInt();
		System.out.println("Re-enter the Card No.");
		int a10 = s.nextInt();
		if (a9 == a10) {
			for (int j = 0; j < Atm.atm_n.length; j++) {
				if (Atm.atm_n[j] == a9) {
					i = j;
					System.out.println("Name of A/c no. is " + Atm.name[i]);
					System.out.println("Type CONFIRM to transfer fund");
					String s1 = s.next();
					if (s1 == "CONFIRM")
						de(i,k);
				} else
					Atm.exit();
			}
		} else
			Atm.exit();
	}
}