
public class MethodExample1 {
	static double salary=1050;
	static int empId=002;
	public static int printEmpId () {
		System.out.println("print empid is running");
		return 1011;		
	}
	public static void printempsalary() {
		System.out.println("print empslary"+salary);
		
	}
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("salary:"+salary);
     System.out.println("emid:"+empId);
     int age=20;
     System.out.println("print age:"+age);
      //or
     System.out.println("salary:"+MethodExample1.salary);
   //or
     System.out.println("Empid:"+MethodExample1.empId);
     //or
     int id=MethodExample1.printEmpId();
    
     System.out.println("emid:"+id);
     int res=20;
     System.out.println("result:"+res);
     double x=res-100;
     System.out.println("result:"+x);
     
     
     
     
     
	}

}
