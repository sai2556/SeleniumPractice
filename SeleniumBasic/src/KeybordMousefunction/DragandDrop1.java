package KeybordMousefunction;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop1 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", ".\\Executeable\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     
	     driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	     WebElement frame = driver.findElement(By.cssSelector(".demo-frame.lazyloaded"));
			driver.switchTo().frame(frame);
	     Actions act=new Actions(driver);
	     
	     List<WebElement>sourceelements=driver.findElements(By.xpath("//ul[@*='gallery']/li"));
	     WebElement target=driver.findElement(By.id("trash"));
	     performdraganddrop(act, sourceelements.get(0),target);
	     performdraganddrop(act, sourceelements.get(3),target);
	}
	     static void performdraganddrop(Actions act, WebElement source,WebElement target) {
	    	 act.dragAndDrop(source, target).build().perform();
	     }
	     

	}


