package PracticeProgram;

public class Example3 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=20;
		if(num<21) {
			System.out.println("num is less than");
		}else {
			System.out.println("num is greter than");
		}
		if(num%2==0) {
			System.out.println("given number is even");
		}else {
			System.out.println("no is odd");
		}
		
       int mark=55;
       if(mark<50) {
    	   System.out.println("student fail");
       }else if(mark>50&&mark<60) {
    	   System.out.println("pass classd");
       }else if(mark>60&&mark<70) {
    	   System.out.println("pass class c");
       }
       int age=20;
       int weight=52;
       if(age>18) {
    	   if(weight>50) {
    		   System.out.println("you r eligibal to blood donate");
    	   }else {
    		   System.out.println("age must be greter than 18");
    	   }
    	   
    	    {
    		   System.out.println("weight is less than 50");
    	   }
       }
     /*  char capital='A';
       for(int i='A';i<='Z';i++) {
    	   System.out.println(capital +" "+i);
    	   capital++;
       }*/
        char small='z';
        for(int j='z';j>='a';j++) {
        	System.out.println(small +" "+j);
        	small++;
        }
	}

}
