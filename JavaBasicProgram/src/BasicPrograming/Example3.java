package BasicPrograming;

public class Example3 {
	
	// method overloding :
	//more than one method declare in class body having same name but dif in parameter
	// position of arg is dif
	//type of arg is dif
	// name of arg is dif
	 public  void display() {
		 int age=20,id=101;
		 double result=age*id;
		 System.out.println("print result:"+result);
	 }
	 public void display(int num,int num2) {
		 double res=num/num2;
		 System.out.println("print res:"+res);
	 }
	 public double display(int age,double salary) {
		 double res1=age-salary;
		 System.out.println("print :"+res1);
		 return res1;
		  }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("hello");

     Example3 ref=new Example3();
     ref.display();
     ref.display(100,25);
     ref.display(200,100.50);
     
	}

}
