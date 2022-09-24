package CollectioninJava;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("sharuk");
		a1.add("salman");
		a1.add("akshay");
		System.out.println("print the element :"+a1);
	     
		System.out.println("remove the element:"+ a1.remove("sharuk"));
		System.out.println("print the element :"+a1);
		a1.add("ajay");
		a1.add("shahid");
		System.out.println("print the element :"+a1);
	     a1.remove(0);
	     System.out.println("print the element :"+a1);
	     ArrayList<String> a2=new ArrayList<String>();
	     a2.add("katrina");
	     a2.add("sonam");
	     a2.add("isha");
	     System.out.println("print the element :"+a2);
	     a1.addAll(a2);
	     System.out.println("print the element :"+a1);
	     // relaacing by position
        a1.addAll(2,a2);
        System.out.println("print the element :"+a1);
        if(a1.contains("ajay")) {
        	a1.remove("ajay");
        }
        System.out.println("print the element :"+a1);
        a1.removeAll(a2);
        System.out.println("print the element :"+a1);
        a1.clear();
        System.out.println("print the element :"+a1);
        
        ArrayList<String> c1=new ArrayList();
        c1.add("pune");
        c1.add("mumbai");
        c1.add("delhi");
        System.out.println("print the element :"+c1);
        ArrayList<String> c2=new ArrayList<String>();
        c2.add("nagar");
        c2.add("solapur");
        c2.add("mumbai");
        System.out.println("print the element :"+c2);
        c1.retainAll(c2);
        System.out.println("print the element :"+c1);
        Iterator itr=c1.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
            
        }
        	
        List d1=new ArrayList();
        d1.add("pune");
        d1.add("12345");
        d1.add("c");
        d1.add(null);
        System.out.println("print the element :"+d1);
        
        
        
        
        
        
	     
	     
	     
	     
		
		
	     
	     
		}

}
