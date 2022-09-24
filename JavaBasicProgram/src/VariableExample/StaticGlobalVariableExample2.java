package VariableExample;

public class StaticGlobalVariableExample2 {
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
				System.out.println("****************upadated varibales value******");
				//initialization of static global variable
				age=25;
				res=true;
				grade='B';
				roi=9.5f;
				System.out.println("updated value of age:"+age);
				System.out.println("updaed value of res:"+res);
				System.out.println("updaed value of grade:"+grade);
				System.out.println("updaed value of roi:"+roi);
				System.out.println("program end");
				
				


	}

}
