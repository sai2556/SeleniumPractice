package Day2Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMpage {

	public static void main(String[] args) {
		String ChromeExePath=System.getProperty("user.dir")+"\\Executeable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromeExePath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		System.out.println("***OrangeHrm page Automation****");
		System.out.println("***Print Page Url****");
		String expectedurl="https://opensource-demo.orangehrmlive.com/";
		String currenturl=driver.getCurrentUrl();
		System.out.println(" orangeHrm page Url:"+currenturl);
		System.out.println("Validation of page url is:"+expectedurl.equals(currenturl));
		
		String expectedtitle="OrangeHRM";
		String actualtitle=driver.getTitle();
		System.out.println(" orangeHrm page Title:"+actualtitle);
		System.out.println(" Validation of Title is:"+expectedtitle.equals(actualtitle));
		
		String pagesource=driver.getPageSource();
		System.out.println(" Page Source count is:"+pagesource.length());
		
		driver.close();
		
		
		
		

	}

}
