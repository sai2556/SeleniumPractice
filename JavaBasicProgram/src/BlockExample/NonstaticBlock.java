package BlockExample;

public class NonstaticBlock {
	{
		System.out.println("Non static block1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("program start");
		NonstaticBlock ref=new NonstaticBlock();
		System.out.println("**************");
		NonstaticBlock ref1=new NonstaticBlock();
		System.out.println("progra ends");
		

	}
	{
		System.out.println("Non static Block2");
	}

}
