package triStar;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileScanner {
	public static void main(String[] args) throws IOException
    {		
		try{    
            FileInputStream fin=new FileInputStream("C:\\Users\\kalya\\Desktop\\in.txt");    
            int i=fin.read();  
            System.out.print((char)i);    
  
            fin.close();    
          }catch(Exception e){System.out.println(e);}    
		
//        FileReader fr = new FileReader("in.txt");
//        Scanner inFile = new Scanner(fr);
//        
//        String line;
//        
//        line = inFile.nextLine();
//        System.out.println(line);
//
//
//        line = inFile.nextLine();
//        System.out.println(line);
//        
//        inFile.close();
    }

}
