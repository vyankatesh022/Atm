import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class transaction {
	void t() {
		Scanner sc = null;
		String line = "";
		String splitBy = ",";
		try {
			sc = new Scanner(new File("v.csv"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String[] v = line.split(splitBy);
		while (sc.hasNext()) {
			System.out.println("Date=" + v[0] + "Account no.=" + v[1] + "Transaction id=" + v[2]
					+ "Amount=" + v[3]);
		}
		sc.close();
	}
}