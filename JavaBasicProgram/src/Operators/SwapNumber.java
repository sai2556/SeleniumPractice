package Operators;

public class SwapNumber {
	static void Swap(int x,int y) {
		 int res=x;
		x=y;
		y=res;
		System.out.println("x="+x+"and y="+y);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int res;
      int  x=100;
      int y=200;
      
      res=x;
      x=y;
      y=res;
      System.out.println("x="+x+"and y="+y);
      Swap(200,300);
	}

}
