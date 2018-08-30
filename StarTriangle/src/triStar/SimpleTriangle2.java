package triStar;

public class SimpleTriangle2 {
	
    public static void printStars(int n)	// Function to demonstrate printing pattern
    {
        int i, j;
         for(i=0; i<n; i++)					// outer loop to handle number of rows
        {
        	 								//  inner loop to handle number of columns
        	 for(j=0; j<=i; j++)			//  values changing acc. to outer loop  
            {
                System.out.print(" * ");	// printing stars
            }
            System.out.println();			// ending line after each row
        }
   }
    public static void main(String args[])
    {
        int n = 6;
        printStars(n);						// using method
    }

}
