package WeeklyAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimeapp {

	public static void main(String[] args) {
		String chromepath=System.getProperty("user.dir")+"\\Executeable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromepath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String title=driver.getTitle();
		System.out.println("print title:"+title.length());
		System.out.println(" title:"+title);
		
		
		String url=driver.getCurrentUrl();
		System.out.println("print url:"+url);
		System.out.println("validation url:"+url.equals("https://demo.actitime.com/login.do"));
		
		WebElement username=driver.findElement(By.name("username"));
		username.clear();
		username.sendKeys("admin");
		
		WebElement password=driver.findElement(By.name("pwd"));
		password.clear();
		password.sendKeys("manager");
		
		WebElement login=driver.findElement(By.className("initial"));
		login.click();
		
		String pagetitle=driver.getTitle();
		System.out.println("parint titile:"+pagetitle);
		
		driver.close();
		
		
		
		
		

	}

}
