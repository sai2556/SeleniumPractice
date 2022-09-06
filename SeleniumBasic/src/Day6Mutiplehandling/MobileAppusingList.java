package Day6Mutiplehandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MobileAppusingList {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",".\\Executeable\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.gsmarena.com/");
	driver.findElement(By.cssSelector("ul>li:nth-of-type(26)>a")).click();
	List<WebElement>Alldevicelist=driver.findElements(By.cssSelector("div>ul>li>a"));
	System.out.println("all device count:"+Alldevicelist.size());
	for(int i=0;i<Alldevicelist.size();i++) {
		System.out.println("Print all device  name:"+Alldevicelist.get(i).getText());
	}
     List<WebElement>Pagination=driver.findElements(By.cssSelector(".nav-pages>a"));	
     System.out.println("check page count:"+Pagination.size());
     if(Pagination.size()>0) {
    	 System.out.println("Pagination Existing");
     }else {
     System.out.println("Pagination is not existing");
     }
    System.out.println( "Page one:"+driver.getCurrentUrl());
    for(int i=0;i<Pagination.size();i++) {
    	
    	Pagination.get(i).click();
    	System.out.println(driver.getCurrentUrl());
    	Thread.sleep(2000);
    	Pagination=driver.findElements(By.cssSelector(".nav-pages>a"));
    	
    }
     }

}
