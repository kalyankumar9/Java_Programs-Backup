package triStar;
import java.util.Scanner;


public class PrintOddN {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any Number = ");
		int n = input.nextInt();
		input.close();
			for(int i=1;i<=n;i++)
			{
				if((i%2) != 0) {
				System.out.println(i);
				System.out.print("\n");
				for(int j=i; j<(i*2);j++) {
					System.out.print("*");
				}
				System.out.print("\n");
		}
			}
	}
}
