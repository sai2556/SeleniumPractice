package CollectioninJava;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LinkedList<String> link=new LinkedList<String>();
       link.add("ravi");
       link.add("ajay");
       link.add("vijay");
       link.add("ajay");// allow dupblicate
       System.out.println("print the result:"+link);
       
       link.add(3,"sachin");
       System.out.println("print the result:"+link);
       
       LinkedList<String> link1=new LinkedList<String>();
       link1.add("sayli");
       link1.add("poonam");
       link1.add("anjali");
       System.out.println("print the result:"+link1);
       link.addAll(link1);
       System.out.println("print the result:"+link);
       link.remove("ajay");
       System.out.println("print the result:"+link);
       link.addFirst("sai");
       link.addLast("amol");
       System.out.println("print the result:"+link);
	}

}
