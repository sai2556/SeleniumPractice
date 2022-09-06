package Propertyfileprogram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimeprogram {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis1=new FileInputStream(".\\PropertyFile\\Data.properties");
		
		//crate instance of properties class
		Properties prop=new Properties();
		
		// load property file useing load() of properties class 
		prop.load(fis1);
		
		//read the data from property file using getproperty(Strinng key)
		String driverkey=prop.getProperty("driver");
		String Browserpath=prop.getProperty("Browserpath");
		String AplictionURL=prop.getProperty("URL");
		String username=prop.getProperty("username");
		String password=prop.getProperty("password");
				
		System.setProperty(driverkey,Browserpath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get( AplictionURL);
		
		String pagetitle=driver.getTitle();
		System.out.println("Pagetitle:"+pagetitle);
		System.out.println("Pagetitle:"+pagetitle.length());
		
		String pageurl=driver.getCurrentUrl();
		System.out.println("Pageurl:"+pageurl);
		System.out.println("Pageurl:"+pageurl.equals(AplictionURL));
		
		WebElement Usernamefield=driver.findElement(By.name("username"));
		Usernamefield.clear();
		Usernamefield.sendKeys(username);
		
		WebElement passwordfield=driver.findElement(By.name("pwd"));
		passwordfield.clear();
		passwordfield.sendKeys(password);
		
		WebElement login=driver.findElement(By.className("initial"));
		login.click();
		
		
		
		
		

	}

}
