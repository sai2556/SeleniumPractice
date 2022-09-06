package KeybordMousefunction;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignmentflipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Executeable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		 Actions act=new Actions(driver);
		 driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.ESCAPE));
		List<WebElement>Menubar=driver.findElements(By.xpath("//div[@class='_37M3Pb']/div/a/div[2]"));
         System.out.println("menubar name count:"+Menubar.size());
         for(int i=0;i<Menubar.size();i++) {
        	 System.out.println("Name  on menubar:"+Menubar.get(i).getText());
        	 WebElement option=Menubar.get(i);
        	 act.moveToElement(option).perform();
        	 Thread.sleep(1000);
        	  }
         driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.F5));
	}

}
