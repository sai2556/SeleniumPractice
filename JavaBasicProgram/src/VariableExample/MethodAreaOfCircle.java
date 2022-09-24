package VariableExample;

public class MethodAreaOfCircle {
      static void getArea()
      {
    	  int r=7;
    	  float p=22/7f;
    	  System.out.println("radius is:"+r);
    	  System.out.println("pie value is:"+p);
    	  double aoc=p*r*r;
    	  System.out.println("Area of circle is:"+aoc);
      }
      static double area(int r,float p)
      {
    	  System.out.println("radius is :"+r);
    	  System.out.println("pie value:"+p);
    	  float aoc=p*r*r;
    	  System.out.println("area of circle is:"+aoc);
    	  return aoc;
    	  
    	  
    	  
      }
    	  
      
      
	public static void main(String[] args) {
		getArea();
		// TODO Auto-generated method stub
		System.out.println("***********************");
		double x=area(21,22/7f);
		double amount=x+100;
		System.out.println("finnal area of circle:"+amount);
	}

}
