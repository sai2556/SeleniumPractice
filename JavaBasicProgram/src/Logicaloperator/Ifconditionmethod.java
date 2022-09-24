package Logicaloperator;

public class Ifconditionmethod
{
	  static void Checkevenodd(int num)
	  {
	 if(num%2==0) {
		 System.out.println("given number is even");
	 }else {
		 System.out.println("given number is odd");
		 }
	  }
	  static boolean Numberis(int num) {
    	  if(num%2==0) {
    		return true;
    	  }else {
    		  return false;
       }
    	 
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Checkevenodd(123);
      Checkevenodd(150);
      
      System.out.println("given number is:"+Numberis(152));
      System.out.println("given number is :"+Numberis(147));
      
     
    	 
      
	}

}

