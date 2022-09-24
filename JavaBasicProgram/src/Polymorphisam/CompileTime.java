package Polymorphisam;


public class CompileTime {
	static void Num(int a,int b) {
		int c=a+b;
		System.out.println("Addition is:"+c);
	}
	static void Num(int a,int b,int h) {
		int c=a+b+h;
		System.out.println("addition is:"+c);
	}		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompileTime.Num(20, 30, 50);

	}

}
// when static method is overloded then it is the example of compiletime polymorphisam