package triStar;

public class SumandAverage {
	public static void main(String args[]) {
		double sum=0;
		int i=0;		
		while(i<=100) {
			sum+=i;
			i++;
		}
		System.out.println("The Sum is: "+sum);
		double avg=(sum/100);
		System.out.println("The average is: "+avg);
	}
}
