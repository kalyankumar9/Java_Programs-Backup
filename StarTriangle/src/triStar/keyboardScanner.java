package triStar;
import java.util.Scanner;

public class keyboardScanner {
	public static void main(String[] args)
    {
        String name; 
        int age; 
        char gender; 
        double salary;

        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Employer details: ");
        
        System.out.print("Enter name: ");
        name = Sc.nextLine();
        
        System.out.print("Enter age: ");
        age = Sc.nextInt();

        System.out.print("Enter gender: ");
        gender = Sc.next().charAt(0);

        System.out.print("Enter salary: ");
        salary = Sc.nextDouble();

        System.out.println("Name: " + name + " Age: " + age + " Gender: "
                + gender + " Salary: " + salary);
        Sc.close();
    }
}
