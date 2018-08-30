package triStar;

public class SumOddNum {
	public static void main(String args[]) {
		
		double sum = 0;		
		for(int i=1; i<=100; i++) {
			if((i%2)!=0) {
				sum+=i;
			}
		}	
			System.out.println("The sum of Odd Number: " +sum);
			double avg=(sum/100);
			System.out.println("The average is: "+avg);
			}
		}
