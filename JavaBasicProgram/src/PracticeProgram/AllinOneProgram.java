package PracticeProgram;
import java.util.Scanner;
class test{
	static int a=12;
	double salary=30;

	 
	void demo() {
		System.out.println("run demo");
		
		
	}
	
	}
	class test2 extends test{
		
		// when sub class inheritate superclas using extendx keyword  subclass constractor call superclass contractor is called constrcator chaning 
		// every class has constractor in constractor super() is the first statement inside the constractor super() use to call super class constractor in sub class
		
		void demo() {
			System.out.println("demo override   test class  demo method ");
		}
		
			
		}
		class test3 extends test2{
			int b ;
			void demo2(int b) {
				b=b;
				System.out.println(b);
				
			}
		}
			
			class test4{
			    int b;
			    test4(){
			    	System.out.println("default constractor ");
			    }
			    test4(int b){
			    	this();   // this() call another constracctor of current class
			    	this.b=b; //this difrentiate local variable and global varible
			    	
		    }
			    void show() {
			    	System.out.println(b);
			    }
			   
			}
		



public class AllinOneProgram {
	 

	public static void main(String[] args) {
		
         test4 r=new test4(20);
         r.show();
                		
		test3 ref5=new test3();
		ref5.demo();
	    ref5.demo2(10);
	    test ref6=new test2();// upcasting convert 
	    
		
		
		
		
		System.out.println(test.a);//call static varible directly in static method using class name as reffrence 
		System.out.println(ref5.salary);// when we create object we can acces only non static member of class  using object refrence
		
		
		// predefine Object class 
		AllinOneProgram ref=new AllinOneProgram();
		System.out.println("print:"+ref);
		test ref1= new test();
		System.out.println(ref1.toString());
		System.out.println(ref1.hashCode());
		System.out.println(ref.equals(ref1));
		// Predefine Scanner class
	/*	Scanner scn=new Scanner(System.in);
		int age;
		double salary;
		String Name;
		System.out.println("Please Enter The Age ");
		age=scn.nextInt();
		System.out.println("please enter The salary");
		salary=scn.nextDouble();
		System.out.println("Please Enter The Name");
		Name=scn.next();*/
		// Array class = collection of similer data type
		int []T1=new int[3];//INDEX BASE
		int []Empid= {111,112,113};//stored multiple value in singale varible
		char []T2= {'a','b','c'};
		T2[0]='C';
		System.out.println(T2.length);
		for(char f:T2) {
			System.out.println(f);
			
		}
		
		System.out.println("DEFAULT VALUE"+T1[0]);
		
	    T1[0]=120;
	    T1[1]=110;
	    T1[2]=210;
	    System.out.println("UPDATED VALUE:"+T1[0]);
	    System.out.println("LENGTH:"+T1.length);
	    for(int a=0;a<T1.length;a++) {
	    	System.out.println(T1[a]);
			    }
		// String class =group of character
        String s="mumbai";// create in  consatant pol
        String s2="mumbai";// no object create
        String s4="pune";// new object create in constant pool
        System.out.println(s2.equals(s4));// difrent addres 
		  System.out.println(s.equals(s2));// in stirng compare with address 
        String s1=new String("Sai");// create in non constant poll
        System.out.println(s1);
        // String Buffer
        StringBuffer sb=new StringBuffer("Hello");
        System.out.println(sb);// .tostring() override
		
        sb.append("Everyone");// string buffer represnt growable length
        System.out.println(sb);
        sb.insert(5, "!");
        System.out.println(sb);
        sb.replace(6,7,"sai");
        System.out.println(sb);
        sb.delete(4, 7);
        System.out.println(sb);
        
        // Wrapper class= wraapping code and statment in single unit
        int a=20;
        Integer k=new Integer(a); // boxing  premtive data type into object 
        int n=k.intValue();// unboxing object into primative datatype
        
      
      
		
        
        
        
		
		
		
		
		
        
		
	    
		
		
		
		
		
		
		
	
		

	}

}
