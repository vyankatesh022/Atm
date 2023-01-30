import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Atm {
	static protected int atm_n[] = { 356514, 546514, 451564, 154544 }; // atm number
	static protected int pin[] = { 5465, 4565, 5865, 4874 };// pin number
	static protected int an[] = { 68468444, 56464185, 56786687, 48548574 }; // account number
	static protected String name[] = { "Roshan", "Vivek", "Swapnil", "Saurabh" };// name
	static protected int bal[] = { 33540, 54984, 549841, 8450 }; // balance
	static protected String[][] ss =new String[5][4];
	static Scanner s = new Scanner(System.in);
	static withdraw w = new withdraw();
	static Deposit d = new Deposit();
	static transaction t1=new transaction();

	static void atm(int i) {
		System.out.println("1.Withdraw\n2.Deposit\n3.Transfer\n4.Transaction History\n5.Quit");
		int c = s.nextInt();
		switch (c) {
		case 1:
			w.wi(i);
			break;
		case 2:
			d.de(i);
			break;
		case 3:
			break;
		default:
			System.exit(0);
			break;

		}

	}

	static void exit() {
		System.out.println("Invalid Enter");
		System.out.println("Thank for using");
		System.exit(0);
	}

	static void fi() {
		File f = new File("v.csv");
		FileWriter t = null;
		try {
			t = new FileWriter(f);
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (String[] v : ss) {
			StringBuilder line = new StringBuilder();
			for (int i = 0; i < v.length; i++) {
				line.append("\"");
				line.append(v[i].replaceAll("\"", "\"\""));
				line.append("\"");
				if (i != v.length - 1) {
					line.append(",");
				}

			}
			line.append("\n");
			try {
				t.write(line.toString());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			t.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		System.out.println("Welcome to V Bank Atm");
		System.out.println("Enter the Atm no.");
		int a = s.nextInt();
		System.out.println("Enter the pin no.");
		int b = s.nextInt();

		for (int i = 0; i < atm_n.length; i++) {
			if (atm_n[i] == a && pin[i] == b)
				atm(i);
			else
				System.exit(0);
		}
		
		System.out.println("Thanks for using");
	}
}
