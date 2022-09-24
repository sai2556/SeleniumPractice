package Logicaloperator;

public class GradeExample {
          
		
public static void main(String[] args) {
		// TODO Auto-generated method stub
        int mark=65;
        if(mark<50) {
        	System.out.println(" student faill");
        }
        else if(mark>=50 && mark<60) {
        	System.out.println("student get D grade");
        }
        else if(mark>=60 && mark<70) {
        	System.out.println("student get C grade");
        }
        else if(mark>=70&&mark<80) {
        	System.out.println("student get B grade");
        }
        else if(mark>=80&&mark<90) {
        	System.out.println("student get A grade");
        	}
        else if (mark>=90&&mark<100) {
        	System.out.println("studennt get A+ grade");
        }
        else {
        	System.out.println("invalid");}
         }
	
	}



