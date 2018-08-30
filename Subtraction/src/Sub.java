
public class Sub {
		
		int i = 30;
		int j = 20;
		
		
		int subtraction(){
		return this.i - this.j;
		}
		
	public static void main(String args[]){
		Sub s1 = new Sub();
		int result = s1.subtraction();
		System.out.println("Result of subtraction is :" +result);
	}
}