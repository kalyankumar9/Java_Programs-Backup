package triStar;

import java.util.Arrays;

public class SecondSmallNum {
	public static void main(String args[]) {
		
		int [] numbers = new int[]{6,3,2,7,8,4,5};	
		
		System.out.println("Numbers"+Arrays.toString(numbers));
		int First = Integer.MAX_VALUE;
		int Second = Integer.MAX_VALUE;
		for(int n: numbers) {
			if(n<First) {
				Second = First;
				First = n;				
			}
			else if(n!=First && n< Second){
				Second=n;
			}
		}
		System.out.println("First: " +First);
		System.out.println("Second: " +Second);
	}

}
