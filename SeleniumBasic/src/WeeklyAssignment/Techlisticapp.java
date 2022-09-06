package WeeklyAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Techlisticapp {

	public static void main(String[] args) {
		String chromepath=System.getProperty("user.dir")+"\\Executeable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromepath);
		WebDriver driver=new ChromeDriver();
	//	driver.manage().window().maximize();
		driver.get("https://www.techlistic.com");
		
	/*	WebElement java=driver.findElement(By.linkText("JAVA"));
		java.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String Title=driver.getTitle();
		System.out.println("title print:"+Title);
	driver.navigate().back();
		
		WebElement selenium=driver.findElement(By.className("dropbtn"));
		selenium.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String title=driver.getTitle();
		System.out.println("Print title:"+title);*/
		
		
		
		
		
		
			
		
		

	}

}
