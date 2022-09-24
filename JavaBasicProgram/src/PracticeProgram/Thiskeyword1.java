package PracticeProgram;

public class Thiskeyword1 {
	int salary=2000;
	double rent=5000;
	
	int rollno;
	float fees;
	 void Thiskeyword(int rollno,float fees){
		System.out.println("Local roll no :"+rollno);
		System.out.println("Global roll no:"+this.rollno);
		this.rollno=rollno;
		System.out.println("updated this.rollno:"+this.rollno);
		System.out.println("local fees amount:"+fees);
		System.out.println("gloabl fees amount:"+this.fees);
		this.fees=fees;
		System.out.println("updated this.fees:"+this.fees);
	}
	void display() {
		System.out.println(rollno+" "+fees);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thiskeyword1 D1=new Thiskeyword1();
		System.out.println(D1);// prinnt  fullydefineclassname@hexadecimalnumbber
		D1.Method1(50);
		D1.method();
		System.out.println("global varible:"+D1.salary);// show local varible value
		Thiskeyword1 D2=new Thiskeyword1();
		System.out.println("global variable :"+D2.salary);// show global vaarible value
		D2.Thiskeyword(10,5000f);
		D2.display();
		
		
	}
		void Method1(int salary) {
			System.out.println("local vairable:"+salary);//50
			salary=60;
			System.out.println("reinitilzie value:"+salary);//60
			System.out.println("global  variable:"+this.salary);//2000
			this.salary=salary;
			System.out.println("reinitilze gloabl salary:"+salary);// reinitilazie value salary 60
			
		}void method(){
			int salary=40;
			System.out.println("method variable value:"+salary);//40
			salary=100;
			System.out.println("reinitilize value:"+salary);//100
			System.out.println("global varible:"+this.salary);//2000
			this.salary=salary;
			System.out.println("reinitilize value:"+this.salary);//100
		}
		
		

	}


