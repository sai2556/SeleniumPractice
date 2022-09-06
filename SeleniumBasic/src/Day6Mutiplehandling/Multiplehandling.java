package Day6Mutiplehandling;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplehandling {

	public static void main(String[] args) throws InterruptedException {
		String chromepath1=System.getProperty("user.dir")+"\\Executeable\\chromedriver.exe";
		// setting the path to driver executable
		System.setProperty("webdriver.chrome.driver", chromepath1);
		
		// create an insatance of chrome browser and upcasting  it to webdriver
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.gsmarena.com/samsung-phones-9.php");
		List<WebElement> devicename=driver.findElements(By.cssSelector("ul>li>a>strong>span"));
		System.out.println("devicename:"+devicename.size());
		for(int i=0;i<devicename.size();i++) {
			System.out.println(devicename.get(i).getText());
		}
		List<WebElement>name=driver.findElements(By.cssSelector("ul>li>a"));
		System.out.println("name:"+name.size());
		for(int i=0;i<name.size();i++) {
			System.out.println(name.get(i).getText());
		}
			List<WebElement>mobilename=driver.findElements(By.cssSelector("ul>li:nth-of-type(2)>a"));	
			System.out.println(mobilename.size());
			
		/*	List<WebElement>catogryname=driver.findElements(By.cssSelector("html>body>div>div>div>aside>div>ul"));
			for(int i=0;i<catogryname.size();i++) {
				System.out.println(catogryname.get(i).getText());
			}*/
			// samsung mobile pagination
			List<WebElement>pagination=driver.findElements(By.cssSelector(".nav-pages>a"));
			System.out.println("page count"+pagination.size());
			if(pagination.size()>0) {
				System.out.println("pagination exist");
			}else {
				System.out.println("pagination is not exist");
			}
			for(int i=0;i<pagination.size();i++) {
				System.out.println(driver.getCurrentUrl());
				pagination.get(i).click();
				Thread.sleep(2000);
				pagination=driver.findElements(By.cssSelector(".nav-pages>a"));
				
			}
		}
		

	}


