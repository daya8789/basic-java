class MyEmployee{
	private int id;
	private String name;
	
	public MyEmployee() {
		id = 234;
		name = "Ajit Kumar Yadav";
	}
	
	public MyEmployee(int myid, String myname) {
		id = myid;
		name = myname;
	}
	
	public MyEmployee(int yourid) {
		id = yourid;
	}
	
	public MyEmployee(String myname) {
		name = myname;
	}
	
	
	
	
	
	public void setid(int i) {
		id = i;
	}
	public int getid() {
		return id;
	}
	
	public void setname(String n) {
		name = n;
	}
	public String getname() {
		return name;
	}
}
public class Constructor {
	
	public static void main(String[] args) {
		
		MyEmployee ajit = new MyEmployee("AjitKumarYadav");
		
//		ajit.setid(12);
//		ajit.setname("Ajit Kumar");
		
		System.out.println(ajit.getid());
		System.out.println(ajit.getname());
		
	}
}
