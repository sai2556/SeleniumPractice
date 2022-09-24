package CollectioninJava;
import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<Integer,String> map1=new HashMap<Integer,String>();
        map1.put(101, "Ravi");
        map1.put(102, "Salman");
        map1.put(103, "ajay");
        map1.put(101, "Ravi");// duplicate not allowed
        System.out.println("print the element:"+map1.size());
        System.out.println("print the element:"+map1);
        System.out.println("Itrating Hashmap");
        for(Map.Entry m:map1.entrySet()) {
        	System.out.println(m.getKey()+":"+m.getValue());
        	
        	HashMap<Integer,String> s1=new HashMap<Integer,String>();
        	s1.put(201, "kiran");
        	s1.put(202, "sharukh");
        	s1.put(203, "sanket");
        	System.out.println("print the element:"+s1.size());
        	System.out.println("print the element:"+s1);
        	for(Map.Entry n:s1.entrySet()) {
        		System.out.println(n.getKey()+":"+n.getValue());
        	}
        	HashMap<Integer,String> map=new HashMap<Integer,String>();
        	map.putAll(s1);
        	System.out.println(map);
        	map.remove(201);
        	System.out.println("print the element:"+map);
        	map.remove(202, "sharukh");
        	System.out.println("print the element:"+map);
        	for(Map.Entry p:map.entrySet()) {
        		System.out.println(p.getKey()+":"+p.getValue());
        	}
 
        }
	}

}
