package testPackage;

public class ArrayDemo2 {
	
	public static void main(String[] args) {
		
		  
        //2-D array
        
        int ar[][];  //array declaration
        ar = new int[2][2];  //array creation
        
        System.out.println(ar);  //prints [[I@15db9742 
        
        //the above 2-dimensional array is broken into two 1-dimensional arrays as below
        System.out.println(ar[0]); //prints [I@6d06d69c 
        System.out.println(ar[1]); //prints [I@7852e922
        
        ar[0][0] = 5;
        ar[1][1] = 10;
        
        System.out.println("Enhanced for loop starts");
        //as we are using 2-D array, we have to write two for loops to fetch the array values
        for(int[] y:ar) //this for loop is for reading rows and storing in an array int[] y
        {
        	for(int z:y) //this for loop is for reading values from the array int[] y
        	{
        		System.out.println(z);
        		
        	}
        }
        
        //Disadvantage of array is it's size is fixed. Hence Collections framework comes into picture+
		
	}

}
