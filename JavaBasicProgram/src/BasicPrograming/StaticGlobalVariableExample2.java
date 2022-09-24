package BasicPrograming;

public class StaticGlobalVariableExample2 {
	static int age;
	static double salary;
	static char grade;
	static boolean result;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program start");
		   System.out.println("defualt value:"+age);
		System.out.println("defualt value:"+salary);
		System.out.println("defualt value:"+grade);
		System.out.println("defualt value:"+result);
		System.out.println("****************************************");
		age=25;
		salary=9200;
		grade='A';
		result=true;
		System.out.println("updated value:"+age);
		System.out.println("updated value:"+salary);
		System.out.println("updated value:"+grade);
		System.out.println("updated value:"+result);
		
				

	}

}	