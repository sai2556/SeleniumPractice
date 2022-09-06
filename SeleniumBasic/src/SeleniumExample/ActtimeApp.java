package SeleniumExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActtimeApp {

	public static void main(String[] args) {
		String path2=System.getProperty("user.dir")+"\\Executeable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path2);
		WebDriver driver1=new ChromeDriver();
		
		driver1.get("https://demo.actitime.com/");
		String expectedurl="https://demo.actitime.com/login.do";
		String currenturl=driver1.getCurrentUrl();
		System.out.println(currenturl);
		
		System.out.println("check url validation is :"+expectedurl.equals(currenturl));
		
		String expectedpagetitle="actiTIME - Login";
		String actualpagetitle=driver1.getTitle();
		System.out.println("title length is:"+actualpagetitle.length());
		System.out.println("check pagetitle validation is :"+expectedpagetitle.equals(actualpagetitle));
		
		String pagesourcecontain=driver1.getPageSource();
		System.out.println("print pagesouce contain :"+pagesourcecontain.length());
		
		driver1.close();
		
		
	}

}
