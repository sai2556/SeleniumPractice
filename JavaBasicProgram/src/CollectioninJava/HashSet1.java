package CollectioninJava;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;



public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set=new HashSet<String>();
		set.add("ravi");
		set.add("Manoj");
		set.add("ajay");
		set.add("ravi");// ignor duplicate in hasset
		System.out.println("print the element:"+set.size());
		System.out.println("print the element:"+set);
		set.remove("ravi");
		System.out.println("print the element:"+set);
		set.add("sanket");
		System.out.println("print the element:"+set);
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	       HashSet<String> set1=new HashSet<String>();
	       set1.add("karina");
	       set1.add("janvi");
	       set1.add("katrina");
	       System.out.println("print the element:"+set1);
	       set.addAll(set1);
	       System.out.println("combine both  the element:"+set);
	       set.remove("karina");
	       System.out.println("print the element:"+set);
	       set.clear();
	       System.out.println("print the element:"+set);
	       
	       HashSet<Boolean> s2=new HashSet<Boolean>();
	       s2.add(true);
	       s2.add(false);
	       System.out.println("print the result"+s2);

	}

}
