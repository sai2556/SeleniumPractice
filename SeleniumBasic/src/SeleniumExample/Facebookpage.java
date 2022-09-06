package SeleniumExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookpage {

	public static void main(String[] args) {
		String path2=System.getProperty("user.dir")+"\\Executeable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path2);
		WebDriver driver1=new ChromeDriver();
		
		
		driver1.get("https://www.facebook.com");
		
		System.out.println("****Automate Facebook page***** ");
		String expectedurl="https://www.facebook.com/";
        String currenturl=driver1.getCurrentUrl();
		System.out.println(currenturl);
		System.out.println("result:"+expectedurl.equals(currenturl));
		
		String expectedtitle="Facebook – log in or sign up";
		String actualtitle=driver1.getTitle();
		System.out.println("Title count:"+actualtitle.length());
		System.out.println(actualtitle);
		System.out.println("result:"+expectedtitle.equals(actualtitle));
		
		String pagesource=driver1.getPageSource();
		System.out.println("page source count:"+pagesource.length());
		
		driver1.close();
		
		
	}
}
