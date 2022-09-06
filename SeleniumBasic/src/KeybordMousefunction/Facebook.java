package KeybordMousefunction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", ".\\Executeable\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     
	     driver.get("https://www.facebook.com/");
	     Actions act=new Actions(driver);
	     WebElement emailaddres=driver.findElement(By.xpath("//input[@name='email']"));
         // emailaddres.sendKeys("saikale007@gmail.com",Keys.chord(Keys.CONTROL,"a"));
	     emailaddres.sendKeys("saikale007@gmail");
	     
        //  emailaddres.sendKeys(Keys.chord(Keys.CONTROL,"c"));
          WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
        //  password.sendKeys(Keys.chord(Keys.CONTROL,"v"),Keys.chord(Keys.ENTER));
       //   int passwordY=password.getLocation().getY();
          
         // WebElement Errormsg=driver.findElement(By.xpath("//div[@class='clearfix _5466 _44mg']/div[2]/a"));
          //int errormsgY=Errormsg.getLocation().getY();
         // System.out.println("is errormsg displayd under password field"+(errormsgY>passwordY));
          
          // mouse operation  copy paste
          act.moveToElement(emailaddres).doubleClick().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
          act.moveToElement(password).click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
          
	}

}
