package Constructer;
class X{
	int i=20;
	X(){
		System.out.println("program start");
		i=30;
	}
}

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X ref=new X();
		System.out.println("print  "+ref.i);
		X ref2=new X();
		System.out.println("print  "+ref2.i);

	}

}
