package ExceptionHandling;

public class UserDefineException {
	 public static void Agevalidate(int age) {
		 //throwing unchecked exception
	      if(age<18) {
	    	  
	    	throw  new ArithmeticException("person is not eligble for vote");
	      }
	      else {
	    	  System.out.println("person is eligble for vote");
	      }
	 }

	public static void main(String[] args)
	{
		// without handling exception 
		//aAgevalidate(15);
	    
		//handling exception calling trt nd catch
		try {
			Agevalidate(15);
		}
		catch(Throwable k) {
			System.out.println("Exception handled");
			System.out.println(k);
		}
		
		System.out.println("Execute rest of the code");
	
		
		}
		

	}


