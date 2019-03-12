package testPackage;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int a[]=new int [5]; //Array gets created in Heap memory. whenever something is created using 'new' keyword, it's created in heap memory
		int b[]=new int [3];
		
		System.out.println(a); //As array is non-primitive data type, the address of the array a[] is printed here 
		                       //e.g. [I@15db9742 -> [ - 1D array, I - Integer

		System.out.println(b); 
		
		System.out.println("Length of the int array 'a' is " +a.length);
		
		long c[]= new long[20];
		System.out.println(c);
		System.out.println("Length of the long array 'c' is " +c.length);
		
		int d[] = new int[4];
		d[0]= 9;
		d[1]= 18;
		d[2]= 27;
		d[3]= 36;
		
		System.out.println("Using conventional for loop");
        int dlength = d.length;
        for(int i=0;i<dlength;i++){
        	
        	System.out.println(d[i]);
        }
        
        /*enhanced for loop syntax:
         
         for(datatype<variable name> : array name)
         {
           code;
         }
        
		*/
        System.out.println("Using enhanced for loop");
        for(int x:d){
        	
        	System.out.println(x);
        }
        
        
        
	}
	
}
