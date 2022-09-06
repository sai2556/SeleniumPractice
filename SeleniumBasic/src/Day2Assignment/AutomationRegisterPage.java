package Day2Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationRegisterPage {

	public static void main(String[] args) {
		String ChromeExePath=System.getProperty("user.dir")+"\\Executeable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromeExePath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		System.out.println("****AutomationRegisterpage***** ");
		String expectedurl="https://demo.automationtesting.in/Register.html";
		String currenturl=driver.getCurrentUrl();
		System.out.println("Url of page:"+currenturl);
		System.out.println("Validation of Url is:"+expectedurl.equals(currenturl));
		
		String expectedtitle="Register";
		String actualtitle=driver.getTitle();
		System.out.println("Title of page:"+actualtitle);
		System.out.println("vaidation of Title is:"+expectedtitle.equals(actualtitle));
		
		String Pagesource=driver.getPageSource();
		System.out.println("Length of page source is:"+Pagesource.length());
		
		

	}

}
