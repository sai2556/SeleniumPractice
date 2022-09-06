package Day3Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeApplogin {

	public static void main(String[] args) {
		String ChromeExePath1=System.getProperty("user.dir")+"\\Executeable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromeExePath1);
		WebDriver driver=new ChromeDriver();
		driver.get(" https://demo.actitime.com/login.do");
		
		WebElement username=driver.findElement(By.name("username"));
		username.clear();
		username.sendKeys("admin");
		
		WebElement password=driver.findElement(By.name("pwd"));
		password.clear();
		password.sendKeys("manager");
		
		WebElement login=driver.findElement(By.className("initial"));
		login.click();
		
		

	}

}
