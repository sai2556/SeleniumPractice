package BlockExample;

public class StaticBlock {// static block are executed in sequential order
	
		static {
	System.out.println("static Block1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("program start");
		System.out.println("program end");
		

	}
	static {
		System.out.println("static block2");
	}
	static {
		System.out.println("static block3");
	}

}
