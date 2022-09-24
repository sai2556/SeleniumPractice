package Abstract;
abstract class Vehical{
	abstract void start() ;
		
	
		
	}

	class car extends Vehical{ //if regular class extends in abstract class
		//then regullar class must have to declare  all abstarct method of abstract class
	
		void start() {
			System.out.println("start with key");  
		}
		
	}
	class bike extends Vehical{
		void start() {
			System.out.println("start with kick");
		}
	}
		
	


public class ExampleClass {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        car s1=new car();
        s1.start();
        bike s2=new bike();
        s2.start();
       // Vehical s3=new Vehical(); abstract class do not create object
	}

}
