package Day8Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCssvalu {

	public static void main(String[] args) {
		String ChromeExePath1=System.getProperty("user.dir")+"\\Executeable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromeExePath1);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		WebElement signinbutton=driver.findElement(By.cssSelector(".buttonBlue"));
         String fontsize=signinbutton.getCssValue("font-size");
         String fontcolor=signinbutton.getCssValue("color");
         String fontbackgroundcolor=signinbutton.getCssValue("background-image");
         
         System.out.println("fontsize:"+fontsize);
         System.out.println("fontcolor:"+fontcolor);
         System.out.println("fontbackgroundcolor:"+fontbackgroundcolor);
	}

}
