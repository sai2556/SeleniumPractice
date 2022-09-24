package Abstract;
interface demo1{
	void test1();// by deafult public and abstract method
	int age=30;// interfce varible by  default final and static
}
interface demo2 extends demo1{
	  void test3();
}
class m implements demo2 {
	 public void test3() {
		 System.out.println("run test 3 class v");
	 }
	public  void test1() {
		System.out.println("run test 2 class v");
	}
}
/*class run extends v implements demo1{
	  public  void test1() {
		   System.out.println("run test 1 run");
		}
	  public void test2() {
		  System.out.println("run test 2 class run");
	  }
	   }*/
public  class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      /*  run ref=new run();
        ref.test1();
        ref.test2();*/
        System.out.println("print :"+demo1.age);
     //   demo1.age=40;// can not reinitilize final varible
        m ref=new m();
        ref.test1();
        ref.test3();
        
	}

}
