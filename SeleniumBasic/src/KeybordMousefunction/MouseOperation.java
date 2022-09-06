package KeybordMousefunction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseOperation {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", ".\\Executeable\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     
	     driver.get("https://demo.automationtesting.in/Register.html");
	     
	     WebElement username= driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	     username.sendKeys("sainath");
	     
	     //create an instance of actions class by passing required browser instance to its constractor
	     Actions act=new Actions(driver);
	     
	     act.moveToElement(username).doubleClick().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	     
	     //paste in lastname field
	     WebElement lastname=driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
	     act.moveToElement(lastname).click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	}

}
