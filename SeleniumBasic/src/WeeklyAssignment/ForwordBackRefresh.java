package WeeklyAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForwordBackRefresh {

	public static void main(String[] args) {
		String chromepath=System.getProperty("user.dir")+"\\Executeable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromepath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		WebElement fashion=driver.findElement(By.linkText("Fashion"));
		fashion.click();
		
		driver.navigate().back();
		driver.getTitle();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().to("https:www.amazon.in");
 
		
	}

}
