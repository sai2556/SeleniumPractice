package PredefineScannerclass;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		String s="Hello, this is basic java";
		
		//create scanner class nd pass string in it
		Scanner scn=new Scanner(s);
		 System.out.println("Bolean result:"+scn.hasNext());
		 //print all string use nextline()
		 System.out.println("Stirng :"+scn.nextLine());

	}

}
