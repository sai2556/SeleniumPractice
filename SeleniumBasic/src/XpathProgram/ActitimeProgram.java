package XpathProgram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class ActitimeProgram {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", ".\\Executeable\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     
	     driver.get(" https://demo.actitime.com/login.do");
	     
	     //finding  username element using Xpath
	     driver.findElement(By.xpath("//input[@class='textField' or @name='username']")).sendKeys("admin");
         // finding password element using Xpath
	     driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	     
	    driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	   
	    driver.findElement(By.xpath("//a/div[2][@id='container_tasks']")).click();
	    
	    
	     
	}
      
}
