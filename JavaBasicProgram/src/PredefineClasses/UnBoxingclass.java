package PredefineClasses;

public class UnBoxingclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k=50;// initilization 
		Integer obj=new Integer(k); // boxing
		int res=obj.intValue();  // unboxing
		System.out.println("print:"+k);
		System.out.println("print:"+obj);
		System.out.println("print:"+res);
		

		boolean g=true;
		Boolean obj1=false;
		boolean res1=obj1.booleanValue()	;
		System.out.println("print:"+g);
		System.out.println("print:"+obj1);
		System.out.println("print:"+res1);
		
		short p=100;
		Short obj2=new Short(p);
		double res2=obj2.shortValue();
		System.out.println("print:"+p);
		System.out.println("print:"+obj2);
		System.out.println("print:"+res2);

}
}