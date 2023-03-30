
class Employee{
	int id;
	int salary;
	String name;
	
	public void getDetails() {
		System.out.println("My id is "+ id);
		System.out.println("and My name is "+ name);
		System.out.println("The salary is "+ salary+" thousand");
	}
	
}

public class ObjectsAndClass {

	public static void main(String[] args) {
		System.out.println("this is our custom class");
		
		Employee harry = new Employee();
		Employee ajit = new Employee();
		
		harry.id = 1;
		harry.salary = 34;
		harry.name = "Harry Bhai";
		//System.out.println(harry.id +" , "+ harry.name);
		
		ajit.id = 5;
		ajit.salary = 50;
		ajit.name = "Ajit Kumar";
		
		harry.getDetails();
		ajit.getDetails();
		
	}

}
