zzpackage PracticeProgram;
    class A{
    	int l=10;
    	A(){
    		System.out.println("A constarctor");
    		l=25;
    	}
    /*A(){
    		
    	}*/
    	A(int a,double b){
    		double res=a*b;
    		System.out.println(res);
    	}
    	void display () {
    		System.out.println("i am class A display");
    	}
    	A(double m,int n){
    		double res1=m/n;
    		System.out.println(res1);
    	}
    	
    }class X{
    	X(int m,int n){
    		System.out.println(m);
    		System.out.println(n);
    	}void display(){
    		System.out.println("i am class X display ()");
    	}
    	double i;
    	X(double j){
    		System.out.println("X constractor running");
    		i=j;
    	}
    }
    
    // use of parameter constractor is  to for every instance we can initilze diffrent value of non satatic varible

public class Constractor1 {
	// consatractor use to inililize non static member 
	int age;
	double salary;
	Constractor1(){
		age=25;
		salary=2525.36;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A p1=new A();
		System.out.println("global varible l="+p1.l);
		A p5=new A();
		System.out.println("global varibale l="+p5.l);
		A p2=new A(40,50.00);// constractor overloading
		A p3=new A(100.00,25);
	//	p2.display();
		X ref=new X(10,50);
		ref.display();
		X ref2=new X(35.25);
		System.out.println("global varibale i="+ref2.i);
		ref2.i=65.36;
		System.out.println(ref2.i);
		Constractor1 ref3=new Constractor1();
		System.out.println(ref3.age);
		System.out.println(ref3.salary);
		
		

	}

}
