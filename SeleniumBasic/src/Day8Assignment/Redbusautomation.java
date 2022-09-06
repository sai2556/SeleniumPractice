package Day8Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Redbusautomation {

	public static void main(String[] args) {
	     System.setProperty("webdriver.chrome.driver", ".\\Executeable\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     
	     driver.get("https://www.redbus.in/");
	     
	     //enter from input feild
	   
	     driver.findElement(By.id("src")).sendKeys("pune");
	     driver.findElement(By.cssSelector("div>ul>li[data-id='66920']")).click();
	  
	     driver.findElement(By.id("dest")).sendKeys("Go");
	     
	     driver.findElement(By.cssSelector("div>ul>li[data-id='67123']")).click();
	    driver.findElement(By.id("onward_cal")).click();
	     driver.findElement(By.cssSelector(".text-trans-uc"));
	     driver.findElement(By.cssSelector("div>table>tbody>tr>td[class='next']")).click();
	     driver.findElement(By.cssSelector("div>table>tbody>:nth-of-type(4)>*:nth-of-type(4)")).click();
	     driver.findElement(By.id("search_btn")).click();
	     driver.findElement(By.cssSelector("ul.dt-time-filter>*:last-child>label.custom-checkbox")).click();
	     driver.findElement(By.cssSelector("ul.list-chkbox>*:nth-child(3)>label.custom-checkbox")).click();
	    
	    
	    
	    
	     
	}

}
