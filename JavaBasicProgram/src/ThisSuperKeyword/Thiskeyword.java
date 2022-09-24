package ThisSuperKeyword;
class A{
	int a;
	A( int a){
		this.a=a;   // this keyword refer to current class object/ instance varible 
		            // this keyword use to find local and global varible  this alwys instance means non static global varible
	}void show(){
		System.out.println(a);
	}
}
class B{
	B(){
		this(20);      // this()   use to  call parameterize constractor of its own class 
	}
	B(int a){
		System.out.println(a);
	}
}
class C{
	C(){
		System.out.println("runing  c class deafult constractor");
	}
	C(int a){
		this();    // this() use to call  default constractor of its own class 
		System.out.println("runing parameterize constrctor of class c");
	}
}

public class Thiskeyword {

	public static void main(String[] args) {
	
        A ref=new A(100);
        ref.show();
        B ref1=new B();
        C ref2=new C(20);
        
        
	}

}
