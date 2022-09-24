package VariableExample;

public class AllinOneVariable {
	static int age;//static global varaible
	double salary;//non-static global varaible
	

	public static void main(String[] args) {
		//we can acess static variable directly into main method
		System.out.println("Result"+age);//accecs defualt value
		AllinOneVariable.age=20;
		System.out.println("updated Result:"+age);
		System.out.println("*******nonstatic global variable****");
		//first we need to load nonstatic gloabl variable into the memory
		//AllinOneVariable ref1;no oject create
		//ref1= new AllinOneVariable;object created
		AllinOneVariable ref1= new AllinOneVariable();
		ref1.salary=5000;
		System.out.println("result NSGV:"+ref1.salary);
		
		AllinOneVariable ref2= new AllinOneVariable();
		System.out.println("intial salary:"+ref2.salary);//show defult value
		ref2.salary=6000;
		System.out.println("updated salary value:"+ref2.salary);
		

		

	}

}
