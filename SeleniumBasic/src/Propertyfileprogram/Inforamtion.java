package Propertyfileprogram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Inforamtion {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis2=new FileInputStream(".\\PropertyFile\\Information.properties");
		Properties pro=new Properties();
		pro.load(fis2);
		String Name=pro.getProperty("Name");
		String surname=pro.getProperty("surname");
		String email=pro.getProperty("email");
		String mobile=pro.getProperty("mobile");
		
		System.out.println("Name:"+Name);
		System.out.println("surname:"+surname);
		System.out.println("email:"+email);
		System.out.println("mobile:"+mobile);
		
	}
	
}
