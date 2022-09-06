package KeybordMousefunction;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazonapp {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", ".\\Executeable\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     driver.manage().window().maximize();
      driver.get("https://www.amazon.in/");
      
	     Actions act=new Actions(driver);
    driver.findElement(By.xpath("//div[@class='nav-search-field ']/input")).sendKeys("samsung mobile",Keys.ENTER);
    Thread.sleep(2000);
    
    WebElement mobilename=driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
    System.out.println("Name"+mobilename.getText());
    
    List<WebElement> Price=driver.findElements(By.xpath("//span[text()='11,999']"));
    System.out.println("Mobille Price:"+Price.get(0).getText() );
    for(int i=0;i<Price.size();i++) {
    System.out.println("mobile price"+Price.get(i).getText());
	}
   List<WebElement>Changpage=driver.findElements(By.xpath("//span[@class='s-pagination-strip']/a"));
  driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.ALT,Keys.END));
   for(int i=0;i<Changpage.size();i++) {
	   System.out.println(driver.getCurrentUrl());
	   WebElement option=Changpage.get(i);
	   act.moveToElement(option).click().perform();
	   Changpage=driver.findElements(By.xpath("//span[@class='s-pagination-strip']/a"));
	   
	   
   }
    

	}
}