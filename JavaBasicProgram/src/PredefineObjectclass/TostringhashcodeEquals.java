package PredefineObjectclass;

class demo2{
	void show() {
		System.out.println("run show method");
	}
}


public class TostringhashcodeEquals extends demo2{
	     void Run() {
	    	 System.out.println("Run run method");
	     }

	public static void main(String[] args) {
		demo2 d1=new demo2();
		//both are same tostring 
		 System.out.println("tostring:"+d1);
	    System.out.println("print tostring for demo class:"+d1.toString());
	    System.out.println("compare tostring:"+d1.equals(d1.toString()));
	    
	   TostringhashcodeEquals t1=new  TostringhashcodeEquals();
	   //both are smae tostring
	   System.out.println("tostring:"+t1);
	   System.out.println("Print tostring for  TostringhashcodeEquals class:"+t1);
	
	   //hascode
	   System.out.println("hashcode:"+d1.hashCode());
	   System.out.println("hashcode:"+t1.hashCode());
	   
	   System.out.println("equals:"+d1.equals(t1));
	}

}
