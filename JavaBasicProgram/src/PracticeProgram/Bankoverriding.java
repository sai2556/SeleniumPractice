package PracticeProgram;

class Bank{
	int getroi(){return 0;} 
		
		
	}
	class SBI extends Bank{
		int getroi() {return 8;}
	}
	class ICICI extends Bank{
		int getroi() {return 16;}
	}
	class HDFC extends Bank{
		int getroi() {return 12;}
	}

public class Bankoverriding {

	public static void main(String[] args) {
		// overriding= when child class has same method declre in parent class is known as overring 
		// method must have same name as  in parent class
		//method must have same paramete as in parent class
		//and thear must be as inheritance
		SBI s1=new SBI();
		ICICI s2=new ICICI();
		HDFC s3=new HDFC();
		System.out.println("sbi"+s1.getroi());
		System.out.println("icici"+s2.getroi());
		System.out.println("hdfc"+s3.getroi());
		
		

	}

}
