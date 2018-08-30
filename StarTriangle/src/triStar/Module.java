package triStar;
import java.util.Scanner;

public class Module {
	
	public static void main (String args[]) {
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter any Number:");
	    int n=s.nextInt();
	    s.close();
	    int i = n;
	    int j = 2;
	    int k = (i % j);
	    System.out.println("Mod of Number is " + k);
	  }
}
