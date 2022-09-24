package Abstract;
abstract class p{
	 abstract void run();
	 abstract void run1();
}
 abstract class L extends p{
	void run() {
		 System.out.println("run show()");
	}
}class K extends L{
	void run1() {
		 System.out.println("run show1()");
	}
}

public class PracticeProgram {

	public static void main(String[] args) {
		K ref2=new K();
		ref2.run();
		ref2.run1();
		

	}

}
