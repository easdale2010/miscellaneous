public class CastTest{
  
  public static void main(String[] args)
{
        
int value1=14;
  
      int value2=5;
   
     double result;
	
	// result of integer division assigned to a double variable
 
       result=value1/value2;
   
     System.out.println(result);

		// cast to force floating point division

        result=(double)value1/value2;
	
	// output to 2 decimal places
      
  System.out.format("%.2f%n",result);
	
	// cast to get integer result
     
   System.out.println((int)result);// rounds down
	
}
}
