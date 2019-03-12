package testPackage;

public class Employee {
	
	int id;
	String name;
	Address address;
	
	public Employee(int id, String name, Address address){
		
		this.id=id;
		this.name=name;
		this.address=address;
		
	}
	
	void display(){
		
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
		System.out.println("*********************************************************");
	}
	
	public static void main(String[] args) {
		
		Address address1= new Address("Madurai", "TN", "INDIA");
		Address address2= new Address("Bangalore","KA", "INDIA");
		
		Employee e1= new Employee(101, "Sundar", address1);
		Employee e2= new Employee(102, "Rajesh", address2);
		
		e1.display();
		e2.display();
	}

}
