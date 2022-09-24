package VariableExample;

public class StaticGlobalVariable3 {
	static int age;
	static boolean res;
	static char grade;
	static float roi;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program start");
		System.out.println("defult value of  age is:"+StaticGlobalVariable3.age);
		System.out.println("defult value of res is:"+StaticGlobalVariable3.res);
		System.out.println("defult value of grade is:"+StaticGlobalVariable3.grade);
		System.out.println("defult value of roi is:"+StaticGlobalVariable3.roi);
		System.out.println("program end");
		System.out.println("****************upadated varibales value******");
		//initialization of static global variable
		age=25;
		res=true;
		grade='B';
		roi=9.5f;
		System.out.println("updated value of age:"+StaticGlobalVariable3.age);
		System.out.println("updaed value of res:"+StaticGlobalVariable3.res);
		System.out.println("updaed value of grade:"+StaticGlobalVariable3.grade);
		System.out.println("updaed value of roi:"+StaticGlobalVariable3.roi);
		System.out.println("program end");
		
		




	}

}
