package Day4Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orngtoolautomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chromepath=System.getProperty("user.dir")+"\\Executeable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromepath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement username=driver.findElement(By.cssSelector("#txtUsername"));
		username.clear();
		username.sendKeys("Admin");
		
		
		WebElement password=driver.findElement(By.cssSelector("#txtPassword"));
		password.clear();
		password.sendKeys("admin123");
		
		WebElement signin=driver.findElement(By.cssSelector("#btnLogin"));
		signin.click();
		
		WebElement timesheet=driver.findElement(By.linkText("Timesheets"));
		timesheet.click();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement View=driver.findElement(By.cssSelector("#viewSubmitted"));
		View.click();
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		WebElement welcome=driver.findElement(By.cssSelector("a[id=\"welcome\"]"));
		welcome.click();
		
		WebElement signout=driver.findElement(By.linkText("Logout"));
		signout.click();
		
		
	
		
		
	    
		
		
		
	}

}
