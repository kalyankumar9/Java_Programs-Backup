
public class Sum {		
		int i = 10;
		int j = 20;
		
		int addition(){
		return this.i + this.j;
		}		
	public static void main(String args[]){
		Sum s1 = new Sum();
		int result = s1.addition();
		System.out.println("Result of addition is :" +result);
	}
}
