package FinalKeyword;

public class Example3 {
	 final int bikespeed;// variable value not declare
	 Example3(){
		 bikespeed=100;
		 System.out.println("bikespeed:"+bikespeed);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     // create object to accecs bikespeed
		Example3 r3=new Example3();
		System.out.println("speed:"+r3.bikespeed);
		
		
		
		/* any variable  declare as final should  initalize  at the same time 
		 * but  for non static final global variable can declare and initilize constractor body*/
	}

}
