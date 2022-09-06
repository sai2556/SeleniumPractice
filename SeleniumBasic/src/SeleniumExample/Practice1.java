package SeleniumExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) {
		 String Path=System.getProperty("user.dir")+"\\Executeable\\chromedriver.exe";
         System.setProperty("webdriver.chrome.driver", Path);
         WebDriver driver=new ChromeDriver();
         driver.get("https://www.google.com");
         
          String expectedurl="https://www.google.com";
          String currenturl=driver.getCurrentUrl();
          System.out.println("check:"+expectedurl.equals(currenturl));
          
          String expectedtitle="Google";
          String actultitle=driver.getTitle();
          System.out.println("check:"+expectedtitle.equals(actultitle));
          
          String sourcepagecontains=driver.getPageSource();
          System.out.println("check:"+sourcepagecontains.length());
         driver.close();
          
          
	}
}
