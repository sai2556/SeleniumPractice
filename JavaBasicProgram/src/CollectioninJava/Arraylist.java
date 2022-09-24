package CollectioninJava;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList list=new ArrayList();
     list.add("mango");
     list.add(123);
     list.add("apple");
     list.add('v');
     list.add(null);
     list.add(true);
     System.out.println("print size:"+list.size());
     System.out.println("print  list :"+list);
     list.add("mango"); // duplicate object accepted
     System.out.println("print  updated list:"+list);
     for(int i=0;i<list.size();i++) {
    	 System.out.println(list.get(i));
     }
     // using for each loop
     for(Object fruite:list) {
    	 System.out.println(fruite);
     }
     System.out.println("print single index:"+list.get(1));
      // changinng index 
     list.set(2, "banana");
     System.out.println("print size:"+list.size());
     System.out.println("print Element:"+list);
     list.forEach(a->{
    	 System.out.println(a);
     });
     ArrayList al=new ArrayList();
     System.out.println("print the element :"+al.isEmpty());
     
     al.add("sai");
     al.add("suraj");
     al.add("sanket");
     System.out.println("print the element :"+al);
     ArrayList al2=new ArrayList();
     al2.add("rutu");
     al2.add("akash");
     System.out.println("print the element :"+al2);
     System.out.println("print the element :"+al);
     al.addAll(al2);
     System.out.println("print the element :"+al);
     ArrayList al3=new ArrayList();
     al3.add("kapil");
     al.addAll(al3);
     System.out.println("print the element :"+al);
     al2.addAll(1,al3);
     System.out.println("print the element :"+al2);
     
     System.out.println("*****Genereic*******");
     ArrayList<Integer> b1=new ArrayList<Integer>();
     b1.add(15);
     System.out.println("print the element :"+b1);
     ArrayList<Boolean> b2=new ArrayList<Boolean>();
     b2.add(true);
     System.out.println("print the element :"+b2);
     ArrayList<Character> b3=new ArrayList<Character>();
     b3.add('M');
     System.out.println("print the element :"+b2);
     System.out.println("print the element :"+b3);
     
     
     
     
     
     
     
     
     
     
     
     
     
    
     
     }
     
     
     
	}


