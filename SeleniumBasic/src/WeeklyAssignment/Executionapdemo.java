package WeeklyAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Executionapdemo {

	public static void main(String[] args) {
		String chromepath=System.getProperty("user.dir")+"\\Executeable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromepath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://demosite.executeautomation.com/Login.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String pagetitle=driver.getTitle();
		System.out.println("print title:"+pagetitle);
		System.out.println("print title length:"+pagetitle.length());
		
		String pageurl=driver.getCurrentUrl();
		System.out.println("verify url:"+pageurl.equals("https://demosite.executeautomation.com/Login.html"));
		
		WebElement username=driver.findElement(By.name("UserName"));
		username.sendKeys("execution");

		WebElement password=driver.findElement(By.name("Password"));
		password.sendKeys("admin");
		
		WebElement login=driver.findElement(By.cssSelector("input[value='Login']"));
		login.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String title=driver.getTitle();
		System.out.println("home page title:"+title);
		String url=driver.getCurrentUrl();
		System.out.println("home page url:"+url);
		
		WebElement logout=driver.findElement(By.linkText("LOGOUT"));
		logout.click();
		driver.close();
		

	}

}
