package VariableExample;

public class NonStaticVariableExample1 {
	int age;
	boolean res;
	char grade;
	float roi;

	public static void main(String[] args) {
		System.out.println("program start");
		//System.out.println(age);//we can not acces nonstatic member directly to the main()
		//to avoid above error first we need to load all non static member into memoery
		//create in instance/object of requierd class
		NonStaticVariableExample1 result1 =new NonStaticVariableExample1();
		System.out.println("defult nonstatic variable="+result1.age);
		System.out.println("defult nonstaticc variable="+result1.res);
		System.out.println("defult nonstatic variable="+result1.grade);
		System.out.println("defult nonstatic variable="+result1.roi);
	
		System.out.println("******upadted value****");
		result1.age=25;
		result1.res=true;
		result1.grade='D';
		result1.roi=2.5f;
		System.out.println("updated nonstatic variable="+result1.age);
		System.out.println("updated nonstatic variable="+result1.res);
		System.out.println("updated nonstatic variable="+result1.grade);
		System.out.println("updated nonstatc variable="+result1.roi);
		System.out.println("program end");
		System.out.println("****new instance Created****");
		NonStaticVariableExample1 result2 =new NonStaticVariableExample1();
		System.out.println("defult with result2,nonstatic variable="+result2.age);
		System.out.println("defult with result2,nonstatic variable="+result2.res);
		System.out.println("defult with result2,nonstatic variable2="+result2.grade);
		System.out.println("defult with result2.nonstatic variable2="+result2.roi);
		System.out.println("program end");
		
		
		
		
				
		

	}

}
