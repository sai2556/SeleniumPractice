package SeleniumExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformOperation {

	public static void main(String[] args) throws InterruptedException {
		
		String chromepath=System.getProperty("user.dir")+"\\Executeable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromepath);
		
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       driver.get("https://demo.actitime.com/");
       
       driver.findElement(By.name("username")).sendKeys("admin");
    
       driver.findElement(By.name("pwd")).sendKeys("manager");
     
       driver.findElement(By.id("loginButton")).click();
      
       Thread.sleep(2000);
      driver.findElement(By.cssSelector("a[class='content tasks']")).click();
      
      
       
		

	}

}
