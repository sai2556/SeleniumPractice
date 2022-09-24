package Inheritance;

interface P {
	  void show();
}
interface Q {
	void display();
}
class N implements P,Q{
	public void show() {
		System.out.println("i am show a");
		
	}
	public void display() {
		System.out.println("i am display b");
	}


}


public class Multipleinheritance1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	N a=new N();
		a.show();
		a.display();

	}

}
