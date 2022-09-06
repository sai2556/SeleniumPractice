package WeeklyAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Executionapp {

	public static void main(String[] args) {
		String firefoxpath=System.getProperty("user.dir")+"\\Executeable\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", firefoxpath);
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demosite.executeautomation.com/Login.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String title=driver.getTitle();
		System.out.println("print title length:"+title.length());
		System.out.println("print title:"+title);
		
		String pageurl=driver.getCurrentUrl();
		System.out.println("print url :"+pageurl.equals("https://demosite.executeautomation.com/Login.html"));
		
		driver.findElement(By.name("UserName")).sendKeys("execution");
		driver.findElement(By.name("Password")).sendKeys("admin");
		WebElement login=driver.findElement(By.cssSelector("input[value=Login]"));
		login.click();
		
		String titlepage=driver.getTitle();
		System.out.println("print title:"+titlepage);
		
		String pageurl1=driver.getCurrentUrl();
		System.out.println("print url:"+pageurl1);
		WebElement Logout=driver.findElement(By.linkText("LOGOUT"));
		Logout.click();
		
		
		
		
		
		
		
		

	}

}
