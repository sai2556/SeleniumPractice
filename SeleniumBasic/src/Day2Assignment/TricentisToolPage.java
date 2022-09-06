package Day2Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TricentisToolPage {

	public static void main(String[] args) {
		String ChromeExePath1=System.getProperty("user.dir")+"\\Executeable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromeExePath1);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tricentis.com/");
		
		System.out.println("***Tricentis Tool Page Automtion***");
		String expectedurl="https://www.tricentis.com/";
		String currenturl=driver.getCurrentUrl();
		System.out.println("Page url is:"+currenturl);
		System.out.println("validation of url is:"+expectedurl.equals(currenturl));
		
		String expectedtitle="Automated Software Testing Tools | Tricentis";
		String actualtitle=driver.getTitle();
		System.out.println("Page Title is:"+actualtitle);
		System.out.println("validation of Title is:"+expectedtitle.equals(actualtitle));
		
		String pagesource=driver.getPageSource();
		System.out.println("Page source count  is:"+pagesource.length());
		
		

	}

}
