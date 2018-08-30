
class Area{
 
 public static void main(String args[]){
  
	 //Data Abstraction : here the variables length, width are not visible to the main method
  
	 Rectangle r = new Rectangle();// compiler will allocate memory for the rectangle and that memory location will be refered with r.
	 System.out.println("The length of the rectangle is:"+r.getLength());
	 System.out.println("The width of the rectangle is:"+r.getWidth());
	 r.findArea();
 }
}