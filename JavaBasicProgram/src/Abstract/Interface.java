package Abstract;
interface  Example{
	  void Test();
	  void Show();
	  void display();
}
class sum implements Example{
	public void Test() {
		System.out.println("i am test()");
	}
	public void Show() {
		System.out.println("i am show()");
	}
	public void display() {
		System.out.println("i am display()");
	}
}


public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum a=new sum();
		a.Test();
		a.Show();
		a.display();

	}


}
