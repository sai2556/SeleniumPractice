package SeleniumExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPage {

	public static void main(String[] args) {
		String path2=System.getProperty("user.dir")+"\\Executeable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path2);
		WebDriver driver1=new ChromeDriver();
	  System.out.println("Automate Amazone Page");
	  
	  driver1.get("https://www.amazon.in/");
	  
	  String expectedurl="https://www.amazon.in/";
	  String currenturl=driver1.getCurrentUrl();
	  System.out.println(currenturl);
	  System.out.println("Url Validation is:"+expectedurl.equals(currenturl));
	  
	  String expectedtitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	  String actualtitle=driver1.getTitle();
	  System.out.println(actualtitle);
	  System.out.println("Title Validation is:"+expectedtitle.equals(actualtitle));
	 
	  System.out.println("Amazon page Title count is:"+actualtitle.length());
	  
	  String pagesourcecount=driver1.getPageSource();
	  System.out.println("Amazon pagesource count is:"+pagesourcecount.length());
	  driver1.close();
	  
	  
	  

	}

}
