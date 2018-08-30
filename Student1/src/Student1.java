class Student1 {
	
	private String name;
	private int age = 25;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>=0) {
		this.age = age;
	} else {
		System.out.println("wrong data");
	}
	}
	
/*	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setName(String Name) {

	}

	public static void main(String args[]) {

		Student1 s1	=	new Student1();
		s1.name		=	"Ramesh";
		s1.age		=	20;
		Student1 s2	=	new Student1();
		s2.name		= 	"Suresh";
		s2.age		=	21;
		System.out.println(s1.getName()+s1.getAge());
		System.out.println(s2.getName()+s2.getAge());
	}*/
	}
	
