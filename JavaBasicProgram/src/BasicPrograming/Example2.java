package BasicPrograming;

public class Example2 {
	static int sum; // it is not mandtory to initilize global varibale 
	double sum2;// it is non static global varible or instance varible
	
	static public void Age() {// method or function
		int num1=10,num2=30;
        double result=num1+num2;	
        System.out.println("print age:"+result);
	}
	public double salary() {
		int amol=300, nikhil=500;
	    double result1=amol+nikhil;
	    System.out.println("print :"+result1);
	    return result1;
	    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int age=20;// it is mandatory to initilize local varible 
            System.out.println("print age:"+age);
            System.out.println("print :"+sum);// static varible  acces directly 
            System.out.println("print :"+Example2.sum);//acces using class name it is standard process
           Example2 ref=new Example2();
           System.out.println("print :"+ref.sum2);
           // whenever acces non static global varible or instance varible in main() we create object to acces them
	
           Age();// call directly 
           Example2 ref2=new Example2();
           ref2.salary();
           double total=ref2.salary();
           System.out.println("print :"+total);
           double finalresult=total/10;
           System.out.println("print :"+finalresult);
           
	
	
	
	
	}
	
	

}
