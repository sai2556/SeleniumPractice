package SeleniumUtility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility {
          private static final WebDriver Chrome = null;
		public static WebDriver driver=null;
          public WebDriver setup(String Browsername,String AppUrl ) {
			 if(Browsername.equalsIgnoreCase("Chrome")) {
				 System.setProperty("webdriver.chrome.driver",".\\Executeable\\chromedriver.exe value");
				 driver=new ChromeDriver();
			 }
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get(AppUrl);
		     return driver;
		 }
          public void username(WebElement element) {
        	  WebElement Usernamefield=driver.findElement(By.name("username"));
        	  element.clear();
        	  element.sendKeys("admin");
          }
          
	public static void main(String[] args) {
          
		

	}

}
