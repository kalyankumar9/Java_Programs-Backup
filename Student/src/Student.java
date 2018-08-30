public class Student {
	
	String name;
	int age = 25;
	
	int getAge() {
		return age;
	}
	
	String getName() {
		return name;
	}
	
	public int add(int a, int b) {
		return a+b;
	}
	
	
	public static void main(String args[]) {
		
		Student s1	=	new Student();
		s1.name		=	"Ramesh";
		s1.age		=	20;
		Student s2	=	new Student();
		s2.name		= 	"Suresh";
		s2.age		=	21;
		System.out.println(s1.getName()+s1.getAge());
		System.out.println(s2.getName()+s2.getAge());
		
		int result = s1.add(20, 21);
		
		System.out.println(result);
	}
}
	
