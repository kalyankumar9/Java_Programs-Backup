package triStar;

import java.util.Scanner;

public class CheckOddEven {
	
	public static void main(String args[]) {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter any Number: ");
		int num = n.nextInt();
		n.close();
		if((num % 2)==0) {
			System.out.println("Even Number");
		}else {
			System.out.println("Odd Number");
		}
		System.out.println("\n BYE");
	}
}
