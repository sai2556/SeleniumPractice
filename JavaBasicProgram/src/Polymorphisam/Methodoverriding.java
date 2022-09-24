package Polymorphisam;
class vichal{
	void  display() {
		System.out.println("print display a");}
}
	
	class Bike extends vichal  {
		void display() {
			System.out.println("pritn display b");
		}
	}

		

public class Methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Bike ref=new Bike();
		 ref.display();
		 
	}
}

	

