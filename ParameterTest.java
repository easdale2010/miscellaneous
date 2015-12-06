// demonstrates that primitive parameters are pass by value

// meaning that any change to the parameter made

// within a method is lost when the method ends

// need to use the return statement to capture

// any changes to the parameter 

 
public class ParameterTest{
   
 public static void main (String[] args){
  
      int value=10;
    
    System.out.println (value);
  
      ParameterTest.update1(value);
 
       System.out.println (value); // outputs 10
 
      value=ParameterTest.update2(value);
    
    System.out.println (value); // outputs 11
   
 }


 public static void update1(int value)
  {
        
value++;
  
  }
    
public static int update2(int value)
{
        
value++;
   
     return value;
  
  }

}
