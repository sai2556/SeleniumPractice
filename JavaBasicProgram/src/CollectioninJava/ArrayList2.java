package CollectioninJava;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Book{
	int id;
	String name,author,publisher;
	int quantity;
	public Book(int id, String name,String author,String publisher,int quantity) {
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
		
	}
}

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book> list=new ArrayList<Book>();
		Book a1=new Book(100,"xyz","sai","pune",85);
		Book a2=new Book(101,"fvg","ajayy","pune",40);
		Book a3=new Book(102,"math","rutu","pune",30);
		Book a4=new Book(103,"science","suraj","pune",20);
		list.add(a1);
		list.add(a2);
		list.add(a3);
		list.add(a4);
		list.add(new Book(105,"dfy","jki","hjui",53));
		System.out.println("print the list:"+list);
		System.out.println(list.get(2).name);
		System.out.println(list.get(2).quantity);
		
		List<Integer> b1=new  ArrayList<Integer>();
		b1.add(12);
		b1.add(25);
		b1.add(15);
		b1.add(45);
		System.out.println("print the element:"+b1.size());
		System.out.println("print the element :"+b1);
		Collections.sort(b1);
		System.out.println("print the element:"+b1);
		Collections.reverse(b1);
		System.out.println("print the element:"+b1);
		
		

	}

}
