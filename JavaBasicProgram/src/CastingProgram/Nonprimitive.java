package CastingProgram;
 class parent{
	 void call() {
		 System.out.println("print call method");
		
	 }
	 
		 void show() {
			 System.out.println("print show method");
		 }
 }
	 class chilld extends parent{
		 void display() {
			 System.out.println("print display");
		 }
	 }
 

public class Nonprimitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// object of chilld class and ref of chilld class
		chilld s1=new chilld();
		s1.display();
		
		parent p1=new parent();// ref and object both are parent
		p1.show();
		
		 chilld s2=new chilld();
		 s2.display();
		 
		parent ref=(parent)new chilld();
		
		 
		 
		 
		
		
		

	}

}
