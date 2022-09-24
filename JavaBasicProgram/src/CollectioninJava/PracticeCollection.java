package CollectioninJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class PracticeCollection {

	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		list.add("mango");
		list.add("ravi");
		list.add(123);
		list.add(true);
		list.add(null);// list return null value
		System.out.println("Count of Element:"+list.size());
		System.out.println("Element print :"+list);
		
		//trvering element using iterator
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println("Element name:"+itr.next());
			
		}
		
		//acces single element
		System.out.println("Accesing single elemnt"+list.get(2));//index base
		
		//add the element on index base
		list.add(2, "Kapil");
		
		System.out.println("Print Element after editing:"+list);
		
		//replce the element on index base 
		list.set(5, "Not null");
		
		//to remove element
		list.remove(3);
		System.out.println("Print Element Name:"+list);
		list.clear();
		System.out.println("Print Name:"+list);
		
	/*
	 * Arraylist method 
	 * 1.to replce
	 * 2.to set = use to replce the element
	 * 3.get= to get single element
	 * 4.clear = clear all the element*/
		
		System.out.println("******LinkedList****");
	LinkedList<String> lnk=new LinkedList<String>();
	lnk.add("salman");
	lnk.add("ajay");
	lnk.add("virat");
	System.out.println("Print element Name:"+lnk);
	lnk.addFirst("sanjay");
	lnk.addLast("sachin");
	System.out.println("Print  element Name:"+lnk);
	
	LinkedList<String> lnk2=new LinkedList<String>();
	lnk2.add("deepika");
	lnk2.add("saniya");
	lnk2.add("anushka");
	System.out.println("Print  element Name:"+lnk2);
	lnk2.add("saniya");
	
	//combine both list 
	lnk.addAll(lnk2);
	System.out.println("Print  element Name:"+lnk);
	
	
	Queue q1=new PriorityQueue();
	q1.add(150);
	q1.add(125);
	q1.add(30);
	q1.add(10);
	System.out.println("Print  element Name:"+q1.size());
	System.out.println("Print  element Name:"+q1);	
	q1.add(30);
	System.out.println("Print  element Name:"+q1);
	
	System.out.println("Print  element Name:"+q1.element());
	System.out.println("Print  element Name:"+q1.peek());
	System.out.println("Print  element Name:"+q1);
	System.out.println("Print  element Name:"+q1.remove());//fifo operation perform  first in first out
	System.out.println("Print  element Name:"+q1); // 30,150,125
	
	System.out.println("Print  element Name:"+q1.poll());
	System.out.println("Print  element Name:"+q1);
	
	System.out.println("*****Map****"); //doesnt allow dupblicate
	Map m1=new HashMap();
	m1.put("key1", "admin");
	m1.put("key2", "admin1");
	m1.put("key1", "admin");
	System.out.println("Print  element Name:"+m1);
	System.out.println("Print  element Name:"+m1.values());
	System.out.println("Print  element Name:"+m1.keySet());
	
	
	
	
	
	
	
	
		
		
		
		
		
		

	}

}
