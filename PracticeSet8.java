
public class PracticeSet8 {
	
	class Employee{
		int salary;
		String name;
		
		public int GetSalary() {
			return salary;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String n) {
			name= n;
		}
	}

	public static void main(String[] args) {
		
		Employee satyam = new Employee();
		satyam.setName("Ajit Kumar Yadav");
		System.out.println(satyam.getName());
				

	}

}
