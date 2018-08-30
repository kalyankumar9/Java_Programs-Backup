package triStar;

public class SumandAverageDoW {
	
	public static void main(String args[]) {
		double sum=0;
		int i=0;
		    do{ 
		      sum += i; 
		       i++;
		    }while(i<=100);
		    System.out.println("The sum is " + sum);
			double avg=(sum/100);
			System.out.println("The average is: "+avg);
	}
}
