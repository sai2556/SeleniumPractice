package VariableExample;

public class MethodRoi {
	static void getroi1() {
		int p=25000,t=2;
		double r=5.5;
		System.out.println("principle:"+p);
		System.out.println("Time:"+t);
		System.out.println("rate:"+r);
		double roi=(p*t*r)/100;
		System.out.println("rate of intrest:"+roi);
		
	}
	static double getroi2(int p,int t, float r) {
		System.out.println("principle amount:"+p);
		System.out.println("time duration:"+t);
		System.out.println("rate of intrest"+r);
		double Roi=(p*t*r)/100;
		System.out.println("amoun to be pay in intrest:"+Roi);
		return Roi;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getroi1();// direct calling in main method
		System.out.println("*******************");;
		getroi2(2000,3,4.5f);//caling by parameter
		int amount=20000;
		double result=getroi2(amount,3,5.5f);//calling by return value
		double resultfinal=amount+result;
		System.out.println("total amount pay :"+resultfinal);
		
		
		

	}

}
