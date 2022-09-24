package PracticeProgram;

public class Constrctor {
	/*
	 * constractor is simpiler type of method but constarctor name shuld be same as class name 
	 *whenever we create object in java class constractor will be create atuomaticaly 
	 *constarctor will not have any return type and do not return any value 
	 *constracor is used to initilize non static member of the class
	 *their are 2 types of constractor deafualt constractor and user defind constractor 
	 *defult constractor : when class does not have any type of  contracotr then java complier creat constractor whhich kwnon as deafult constarctor
	 *default constracotr does not have parameter and its body will be empty
	 *user define constrscotr: when programmer create constrctor then that constractor kwon as user define constractor */
    
	
	int age=50;
	void display() {
		System.out.println("print display method");
	}
	void play() {
	int m=40,n=30;
	System.out.println(m);
	System.out.println(n);}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constrctor ref=new Constrctor();// compiler create defult constrctor()
		ref.display();
		System.out.println(ref.age);
		ref.play();
		
		 
		 

	}

}
