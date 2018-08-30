package India;

import java.io.*;


public class Team {
	
	String name, position, nick;
	
	public Team(String n, String p, String ni) {	//use of constructor
		name = n;
		position = p;
		nick = ni;
	}
	public static void main (String[]args) {

		String s1 = "Import/package-program";
		System.out.println(s1);
		File f = new File("Resume.doc");
		try {			
			FileInputStream f1 = new FileInputStream(f);
			}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		/*		System.out.println("TeamIndia");
		System.out.println("Name: "+name);
		System.out.println("Position: "+position);
		System.out.println("NickName: "+nick);*/
		
	}

}
