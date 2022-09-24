package VariableExample;

public class NonStaticGlobalVariable2 {
	int age;
	boolean res;
	char grade;
	float roi;

	public static void main(String[] args) {
		//system.out.prntln(age);//we can not access nonstatic varibale in main() directly we can declare in main method
		//first we need to load all nonstatic variable into the  memory
		//create instance/object of the class
		NonStaticGlobalVariable2 ref1 =new NonStaticGlobalVariable2();
		System.out.println("defult value nonstatic variable:"+ref1.age);
		System.out.println("defult value nonstatic variable:"+ref1.res);
		System.out.println("defult value nonstatic variable:"+ref1.grade);
		System.out.println("defult value nonstatic variable:"+ref1.roi);
		System.out.println("*****updated value**********");
		ref1.age=20;
		ref1.res=true;
		ref1.grade='C';
		ref1.roi=4.5f;
		System.out.println("updated  value nonstatic variable:"+ref1.age);
		System.out.println("updated value nonstatic variable:"+ref1.res);
		System.out.println("updated value nonstatic variable:"+ref1.grade);
		System.out.println("updated value nonstatic variable:"+ref1.roi);
		
		

	}

}
