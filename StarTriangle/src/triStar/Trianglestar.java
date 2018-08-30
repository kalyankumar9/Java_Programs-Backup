package triStar;

public class Trianglestar {
	
	public static void main(String[] kalyan) {
		
		int i, j, k, s=9 ;
		
		for(i=1; i<=s; i++) {
			
			for(j=1; j<=s-i; j++) {
				System.out.print(" ");
			}
			for(k=1; k<=2*i-1; k++) {
				System.out.print("*");
			}
			System.out.print("\n");			
		}
	}
}
