package triStar;
import java.util.Scanner;

public class CheckPassfail {
	
	public static void main(String args[]) {
		Scanner m = new Scanner(System.in);
		System.out.println("Enter the marks: ");
		int marks = m.nextInt();
		m.close();
		if (marks>=50) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
		System.out.println("\n DONE");
	}

}
