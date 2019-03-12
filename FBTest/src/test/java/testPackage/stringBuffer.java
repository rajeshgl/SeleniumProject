package testPackage;

public class stringBuffer {

	//java StringBuffer class is used to create mutable(modifiable) string. The StringBuffer class in java is same as String class except it is mutable
	// i.e, it can be changed
	
	public static void main(String[] args) {
		
		
		/*StringBuffer sBuffer= new StringBuffer("Hello");
		sBuffer.append(" World"); //now original string gets appended
		System.out.println(sBuffer);*/ //Hello World gets printed
		
		//StringBuilder is efficient compared to StringBuffer in terms of completing the operation. It'll take less time to append the string
		
		
		//stringBuffer sBuffer2= new stringBuffer("Hello");
		
        long startTime = System.currentTimeMillis();
		
		StringBuffer sBuffer= new StringBuffer("Hello");
		
		for(int i=0; i<1000; i++)
		{
			sBuffer.append("world");
		}
		
		System.out.println("Time taken by string buffer: "+(System.currentTimeMillis()-startTime)+"ms");
		
		StringBuilder sBuilder = new StringBuilder("Hello");
		
		for(int i=0;i<1000;i++){
			
			sBuilder.append("world");
		}
		
		System.out.println("Time taken by string builder: "+(System.currentTimeMillis()-startTime)+"ms");
	}
	
}
