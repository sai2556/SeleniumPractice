package VariableExample;

public class StaticGlobalVaribaleExample1 { 
	static int age;
	static boolean res;
	static char grade;
	static float roi;

	public static void main(String[] args) {
		// we can access static global variables directly from here as main() is also static
		System.out.println("program start");
		System.out.println("defult value of age is:"+age);
		System.out.println("defult value of res is:"+res);
		System.out.println("defult value of grade is:"+grade);
		System.out.println("defult value of roi is:"+roi);
		System.out.println("program end");
		

	}

}
