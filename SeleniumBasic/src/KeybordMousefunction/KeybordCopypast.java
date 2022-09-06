package KeybordMousefunction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeybordCopypast {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", ".\\Executeable\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     
	     driver.get("https://demo.automationtesting.in/Register.html");
	     
	     //loactr firstname field
	    WebElement Firstnamefield= driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	     Firstnamefield.sendKeys("sainath",Keys.chord(Keys.CONTROL,"a"));// select all
	     Firstnamefield.sendKeys(Keys.chord(Keys.CONTROL,"c"));// copay all
	     
	     WebElement lastnamefield=driver.findElement(By.xpath("//input[@placeholder='Last Name' or @class='from-control']"));
         lastnamefield.sendKeys(Keys.chord(Keys.CONTROL,"v"));// paste in lastnamefield
	}

}
