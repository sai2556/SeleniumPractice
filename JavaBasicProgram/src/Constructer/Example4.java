package Constructer;
class Test{
	double i;
	Test(double j){
		System.out.println("print ");
		i=j;
		
	}
}

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Test r=new Test(25.02);// with the help  of parametarized connstrctor for every instanse or object we can initize diifrent values
       System.out.println("print"+r.i);
       r.i=25.36;
       System.out.println("print"+r.i);
       Test r1=new Test(45.25);
       System.out.println("print "+r1.i);
       r1.i=85.36;
       System.out.println("print"+r1.i);
       
	}

}
