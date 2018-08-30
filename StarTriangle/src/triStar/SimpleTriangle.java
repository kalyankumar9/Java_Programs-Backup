package triStar;

public class SimpleTriangle {
	
	 public static void main(String[] args) {
		 
	      // Our triangle will have i lines
	      // One loop iteration each line
	 int n=6;
	     for(int k=1;k<n;k++)
	     {
	    	 if(k%2!=0)
	    	 {
	    		 System.out.println(k);
	    			 for (int j=k;j<(k*2); j++) 
	    			 {
	    				 System.out.print("*");
	    			 }
	    			 System.out.println();
	      }
	   }
	 }

}
