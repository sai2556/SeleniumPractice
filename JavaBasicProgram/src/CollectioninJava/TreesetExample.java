package CollectioninJava;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class TreesetExample {

	public static void main(String[] args) {
		
		TreeSet<String> t1= new TreeSet<String>();
		t1.add("ravi");
		t1.add("kapil");
		t1.add("akash");
		t1.add("sai");
		System.out.println("Print count:"+t1.size());
		
		System.out.println("Print Name:"+t1);
	    Iterator<String> itr=t1.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
			  }
	    
	    //using integervalue
	    TreeSet<Integer> i1=new TreeSet<Integer>();
	    i1.add(10);
	    i1.add(20);
	    i1.add(60);
	    i1.add(50);
	    System.out.println("to get the value of frist element:"+i1.pollFirst())	;
	    System.out.println(i1.pollLast() );// return asecending orde    		
	    
	    TreeSet<String> t2=new TreeSet<String>();
	    t2.add("A");
	    t2.add("B");
	    t2.add("C");
	    t2.add("D");
	    t2.add("E");
	    System.out.println(t2.descendingSet());
	    System.out.println(t2.headSet("D"));//[A,B,C]
	    System.out.println(t2.headSet("D", true));//[A,B,C,D]
	    System.out.println(t2.tailSet("A"));// [A,B,C,D,E]
	    System.out.println(t2.tailSet("B", false));//[C,D,E]
	    
	    System.out.println(t2.subSet("B", "E"));// [B,C,d]
	    System.out.println(t2.subSet("B", true, "E", false));// [B,C,D]
		
		
		
		
	    
		
		
		
		
	    
		
		

	}

}
