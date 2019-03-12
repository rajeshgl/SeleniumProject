package testPackage;

public class StringSessions {
	
	public static void main(String[] args) {
		
	   String s1="Rajesh";
	   String s2="Rajesh";
	   String s3= new String("Rajesh");
	   String s4= "Raja";
	   String s5="Kumar";
	   String s6="Dan";
	   String s7="RAJESH";
	   
	   System.out.println(s1.equals(s7));
	   System.out.println(s1.equalsIgnoreCase(s2));
	   System.out.println(s1==s2); //true because both s1 and s2 refer to same instance
	   System.out.println(s1==s3); //false because s1 refers to value in string constant pool and s3 is pointing to non constant pool
	   
	   System.out.println(s1.compareTo(s7)); 
	   //compareTo method will compare the unicode character value of the corresponding string and gives the output
	   //for eg. unicode character value of A is '65', and a is '97'. so S1.compareTo(S7) gives +32
	   
	   System.out.println(s7.compareTo(s1));
	   // here output will be a negative value 
	   
	   String s8="AB";
	   String s9="";
	   
	   System.out.println(s8.compareTo(s9));
	   //here as we are comparing AB to an empty string, s8.compareTo(s9) will display the length of the string s8 i.e, 2
	   
	   s1.concat("Raman");
	   //concat() method appends the string at the end
	   System.out.println(s1);
	   // will print just the s1 value because "Strings are immutable objects"
	   // Actually concatenation is happening. But no reference is pointing to the newly created "Rajesh Raman", hence just Rajesh gets printed
	   
	   
	   
	}

}
