package SeleniumExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipCartWebaseprogram {

	public static void main(String[] args) {
		String path2=System.getProperty("user.dir")+"\\Executeable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path2);
		WebDriver driver1=new ChromeDriver();
		
		driver1.get("https://www.flipkart.com");
		
		String expectedurl="https://www.flipkart.com";
		String currenturl=driver1.getCurrentUrl();
		System.out.println(expectedurl);
		System.out.println(currenturl);
		System.out.println("result:"+expectedurl.equals(currenturl));
		
		String pagetitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		String actulpagetitle=driver1.getTitle();
		System.out.println(actulpagetitle);
		System.out.println("title validation is:"+pagetitle.equals(actulpagetitle));
		
		String pagesource=driver1.getPageSource();
		System.out.println("get page source length:"+pagesource.length());
		driver1.close();
		
	}

}
