package KeybordMousefunction;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragndDrop {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", ".\\Executeable\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     
	     driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	     WebElement frame = driver.findElement(By.cssSelector(".demo-frame.lazyloaded"));
			driver.switchTo().frame(frame);

	     Thread.sleep(1000);
	     
	     List<WebElement>sourceelement=driver.findElements(By.xpath("//ul[@*='gallery']/li"));
	     System.out.println(sourceelement.size());
	     WebElement targetelement=driver.findElement(By.id("trash"));
	     Actions act=new Actions(driver);
    act.dragAndDrop(sourceelement.get(0),targetelement).build().perform();
	     Thread.sleep(1000);
	     
	     act.dragAndDrop(sourceelement.get(3), targetelement).build().perform();
	     act.dragAndDrop(sourceelement.get(1), targetelement).build().perform();
	     Thread.sleep(1000);
	     act.dragAndDrop(sourceelement.get(2), targetelement).build().perform();
	     
	    
	      
	     
	     
	}

}
