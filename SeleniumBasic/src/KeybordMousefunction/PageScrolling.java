package KeybordMousefunction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageScrolling {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", ".\\Executeable\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     
	     driver.get("https://www.flipkart.com/");
	     
	     WebElement element=driver.findElement(By.xpath("//body"));
	    element.sendKeys(Keys.ESCAPE);
	     Thread.sleep(500);
	     element.sendKeys(Keys.F5);
	  /*  for(int i=0;i<10;i++) {
	    	 element.sendKeys(Keys.PAGE_DOWN);
	   	 Thread.sleep(500);
	    }*/
	/*     Thread.sleep(1500);
	     //scrolling direct to the bottom of page
	     element.sendKeys(Keys.chord(Keys.CONTROL),Keys.END);
	     
	    
	     //scrolling direct top of page
	     element.sendKeys(Keys.chord(Keys.CONTROL),Keys.HOME);*/
	     
	     
	     

	}

}
