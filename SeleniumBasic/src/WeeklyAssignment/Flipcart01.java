package WeeklyAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart01 {

	public static void main(String[] args) {
		String chromepath=System.getProperty("user.dir")+"\\Executeable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromepath);
		WebDriver driver=new ChromeDriver();
	//driver.get("https://www.flipkart.com/");
		/*driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println("validate title:"+title.equals("https://www.flipkart.com/"));
		
		List<WebElement>menucount=driver.findElements(By.cssSelector("div[class='eFQ30H']>a"));
		System.out.println("count"+menucount.size());
		for(int i=0;i<menucount.size();i++) {
			System.out.println("count nd name"+menucount.get(i).getText());
		}
		driver.close();*/
		driver.get("https://www.espncricinfo.com");
		driver.manage().window().maximize();
		String title1=driver.getTitle();
		System.out.println("validte title:"+title1.equals("https://www.espncricinfo.com"));
		List<WebElement> cricmenu=driver.findElements(By.cssSelector("div[class='ds-flex ds-flex-row']>div>a"));
		System.out.println(cricmenu.size());
		for(int i=0;i<cricmenu.size();i++) {
			System.out.println("print menu name:"+cricmenu.get(i).getText());
		}
	/*List<WebElement>mobile=driver.findElements(By.cssSelector("div[class='eFQ30H']>div>div>a"));
		driver.findElement(By.cssSelector(".xtXmba")).click();
		List<WebElement>devicename=driver.findElements(By.cssSelector("div[class='_1YokD2 _3Mn1Gg col-10-12']>div>a"));
		System.out.println(devicename.size());*/
		
		
		
		

	}

}
