package CastingProgram;
class A{
	
	double test1() {
		System.out.println("running test1");
		return 4;
		
	}
}


   class Example4 {
	 
	void test(double d) {
		System.out.println("print :"+d);
		
	}
	

		
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example4 s1=new Example4();
		s1.test(20);
		 
		A s2=new A();
		int res=(int)s2.test1(); //  narrowing Explicit
		System.out.println("print:"+res);
		
		

	}

}
