import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class withdraw extends Atm {
	static int tran = 1000;
	static int a1;
	DateTimeFormatter v = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	LocalDateTime now = LocalDateTime.now();

	int amount() {
		a1 = s.nextInt();
		if (a1 % 100 == 0)
			return a1;
		else {
			System.out.println("Invalid Amount\nRe-enter amount");
			amount();
		}
		return a1;

	}

	void tras(int k,int q, int r, String s) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				if (Atm.ss[i][2] == null) {
					Atm.ss[i][0] = s;
					Atm.ss[i][1] = String.valueOf(Atm.an[k]);
					Atm.ss[i][2] = String.valueOf(q);
					Atm.ss[i][3] = String.valueOf(r);
					break;
				} else
					continue;
			}

		}
		fi();
	}

	public void wi(int i) {
		System.out.println("Currently Notes are available 100,200,500");
		System.out.println("Enter the amount");
		a1 = amount();
		
		if (a1 <= Atm.bal[i]) {
			Atm.bal[i] -= a1;
			tran++;
			String b = v.format(now);
			System.out
					.println("Successfully Withdraw !\n Your balance is " + Atm.bal[i] + "\n Transcation id = " + tran);
			tras(i,tran, a1, b);
		} else {
			Atm.exit();
		}
	}

}
