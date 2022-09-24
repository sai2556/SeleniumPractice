package Inheritance;//single levle inheritance
class Animal{
	  public  void move() {
		   System.out.println("class A animal can move");
	   }
	   void eat() {
		   System.out.println("class A animal can eat");
	   }
}
	   class Tiger extends Animal {
		   public void wild()  {
			   System.out.println("tiger is wild animal");
		   }
		   public void move() {
			   System.out.println("all animal  can move ");
		   }
		   
		   
	   }
	   class fruit {
		   int fruitage;
		   fruit(){
			   System.out.println("i am fruit class constractor");
			   fruitage=25;
		   }
		   void taste() {
			   System.out.println("all fruit taste is good");
		   }
	   }class Apple extends fruit{
		   int fruitage;
		   Apple(){
			   System.out.println("i am apple class connstractor");
			   fruitage=30;
		   } void taste() {
			   System.out.println(" apple taste is sweet");
		   }
		   void shape() {
			   System.out.println("apple is round");
			   System.out.println("apple class fruitage:"+fruitage);
			   System.out.println("fruit class fruitage:"+super.fruitage);
			   taste();
			   super.taste();
			   
		   }
	   }interface vehical{
		    void color();
		   }
	   interface  car {
		    void wheels();
	   }
	  class bike implements vehical,car{
		   public void color() {
			   System.out.println("vehical has many color");
		   }
		   public void wheels() {
			   System.out.println("car has 4 wheels");
		   }
	   }
		   


public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger ref1=new Tiger();
		ref1.move();// override method
		ref1.eat();
		ref1.wild();
		
		Apple ref2=new Apple();
		ref2.shape();
		
		bike ref3=new bike();
		ref3.color();
		ref3.wheels();
		
		
				
		
		
		
		
		
	}

}
