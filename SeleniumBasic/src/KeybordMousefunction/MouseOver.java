package KeybordMousefunction;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", ".\\Executeable\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     
	     driver.get("https://www.globalsqa.com/demo-site/");
	     List<WebElement> menu=driver.findElements(By.xpath("//div[@id='menu']/ul/li/a"));
	     System.out.println("get count of menu:"+menu.size());
	     Actions act=new Actions(driver);
	 //    act.moveToElement(menu.get(2)).perform();
	     
	/*     for(int i=0;i<menu.size();i++) {
	    	 WebElement option=menu.get(i);
	    	 act.moveToElement(option).perform();
	    	 Thread.sleep(1000);
	     }*/
	     
	     mouseoverOverTheElement(act,menu.get(3));
	     rightclick(act,menu.get(2));
	     act.moveToElement(menu.get(1),100,0).perform();

	}

	private static void mouseoverOverTheElement(Actions act, WebElement webElement) {
		// TODO Auto-generated method stub
		
	}

	private static void rightclick(Actions act, WebElement webElement) {
		// TODO Auto-generated method stub
		
	}

	private static void mouseHoverOverTheElement(Actions act, WebElement webElement) {
		// TODO Auto-generated method stub
		
	}

}
