package CollectioninJava;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Iterator;

public class Queue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue s1=new PriorityQueue();
		 System.out.println("print the object:"+s1);
		 System.out.println("print the object:"+s1.size());
		// System.out.println("print the result:"+s1.element());// when use element() show error
		 System.out.println("print the result:"+s1.peek()); // when use peek() show null result
		 
		 Queue s2=new PriorityQueue();
		 s2.add(11);
		 s2.add(56);
		 s2.add(89);
		 s2.add(23);
		 System.out.println("print the result:"+s2);
		 
		 System.out.println("print the result:"+s2.element());
		 System.out.println("print the result:"+s2.peek());
		 System.out.println("print the result:"+s2.remove());
		 System.out.println("print the result:"+s2.poll());
		 System.out.println("print the result:"+s2);
		 System.out.println("print the result:"+s2.remove());
		 System.out.println("print the result:"+s2.poll());
		 System.out.println("print the result:"+s2);// empty
		 
		 Queue s3=new PriorityQueue();
		 s3.add(25);
		 s3.add(56);
		 s3.add(13);
		 System.out.println("print the result:"+s3);
		 
		 System.out.println("print the result:"+s3.element());
		 System.out.println("print the result:"+s3.peek());
		 System.out.println("print the result:"+s3.remove());
		 System.out.println("print the result:"+s3);
		 System.out.println("print the result:"+s3.poll());
		 System.out.println("print the result:"+s3);
		 
		 
	
	}

}
