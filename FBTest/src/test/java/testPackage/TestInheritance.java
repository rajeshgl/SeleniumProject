package testPackage;

class Father{
	
	 void father(){
		 System.out.println("This is parent class constructor");
	 }
	 
	void sleep(){
		System.out.println("I am sleeping");
	}
	void anger(){
		System.out.println("I am angry");
	}
	void hunger(){
		System.out.println("I am hungry");
	}
	
}

class Son extends Father{
	 
	void smile(){
		System.out.println("Son smiles");
	}
	
	void love(){
		System.out.println("Son loves");
	}
	
}

public class TestInheritance {

	
	public static void main(String[] args) {
		
		
	 Father father = new Father(); //base class reference and base class object
	 Son son= new Son();           // child class reference and child class object
	 Father father1= new Son();    //base class reference and child class object
	 father.sleep();               //accessing base class method
		son.hunger();              //child class reference accessing base class method
	 father1.anger();             
     	
	 //multiple inheritance is not supported through class, it's supported through Interface
		
	}

}
