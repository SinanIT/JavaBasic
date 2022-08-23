package methodChainingLogic;


class MethodRepo{
	
	//1
	
//	public void printName(String firstName, String lastName ) {
//		System.out.println("Name is " + firstName + " " + lastName);
//	}
//	
//	public void printAge(int age) {
//		System.out.println("Age is " + age);
//	}
	
	
	//2
	
//	public MethodRepo printName(String firstName, String lastName ) {
//		System.out.println("Name is " + firstName + " " + lastName);
//		return new MethodRepo();
//	}
//	
//	public MethodRepo printAge(int age) {
//		System.out.println("Age is " + age);
//		return new MethodRepo();
//	}
	
	
	public MethodRepo printName(String firstName, String lastName ) {
		System.out.println("Name is " + firstName + " " + lastName);
		return this;
	}
	
	public MethodRepo printAge(int age) {
		System.out.println("Age is " + age);
		return this;
	}
	
}

public class Demo {
	
	public static void main(String[] args) {
		
		MethodRepo methodRepo = new MethodRepo();
		
		//1
		//methodRepo.printName("Ali", "Can");
		//methodRepo.printAge(50);
		
		//2
		
		//methodRepo.printName("Ali", "Can").printAge(50);
		
		//3
		
		methodRepo.printName("Ali", "Can").printAge(50);
		
	}

}
