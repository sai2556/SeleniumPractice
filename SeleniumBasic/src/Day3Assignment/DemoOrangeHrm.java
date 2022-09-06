package Day3Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoOrangeHrm {

	public static void main(String[] args) {
		String ChromeExePath1=System.getProperty("user.dir")+"\\Executeable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromeExePath1);
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		/*
		 * to perform any opeartion first we need to identify element from the application then we performe  required opeation
		 * 1.input type=sendkeys("input");
		 * 2.click=click();
		 * 3.existing text deletion=clear();*/
		
		//identify username field
		WebElement username=driver.findElement(By.id("txtUsername"));
		//performed requird operation in the username feild
		username.clear();
		username.sendKeys("Admin");
		
		//identify username field
		WebElement password=driver.findElement(By.id("txtPassword"));
		//performed requird operation in the username feild
		password.clear();
		password.sendKeys("admin123");
		
		//identify username field
		WebElement loginbutton=driver.findElement(By.className("button"));
		//performed requird operation in the username feild
		loginbutton.click();
		String Homepagetitle=driver.getCurrentUrl();
		System.out.println("Home Page Title:"+Homepagetitle);
		
		System.out.println("HomePage Verification is:"+Homepagetitle.contains("dashboard"));
		
	
		
		driver.close();

	}

}
