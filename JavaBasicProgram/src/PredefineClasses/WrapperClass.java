package PredefineClasses;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// converting primative datattyoe into object and object into primitive datatype
		//1.Boxing  convert primitive datattype into object  operation perform implicite or explicite
		//2.Unboxing convert object into primitive datatype  operation perform implicite or explicite
		
		int a=20;
		Integer intobj=new Integer(a);// explicite Boxing
		Integer b=20;// implicit boxing
		System.out.println("print:"+a);
		System.out.println("print:"+b);
		System.out.println("print:"+(a==b));
		
		// Unboxing 
		Integer obj2=new Integer(30);// boxing
		Integer ref=30;
		int unbox=obj2.intValue(); //  unboxing
		System.out.println("print:"+unbox);
		
		
		Character charobj=new Character('H');
		Character obj='H';
		System.out.println("print:"+charobj);
		System.out.println("print:"+obj);
		System.out.println("print:"+(charobj==obj));// compare based on value
		
		Boolean bolobj=new Boolean(true);
		Boolean obj1=true;
		System.out.println("print:"+bolobj);
		System.out.println("print:"+obj1);
		System.out.println("print:"+(bolobj==obj1));
	}

}
