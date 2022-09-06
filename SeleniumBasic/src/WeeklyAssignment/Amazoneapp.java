package WeeklyAssignment;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Amazoneapp {

	public static void main(String[] args) {
		String chromepath=System.getProperty("user.dir")+"\\Executeable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromepath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	    String pagetitle= driver.getTitle();
	    System.out.println("print page title:"+pagetitle);
	   WebElement mobilelink= driver.findElement(By.linkText("Mobiles"));
	   mobilelink.click();
	   String title=driver.getTitle();
	   System.out.println("print page title:"+title);
	   driver.navigate().back();
	  String title1= driver.getTitle();
	  System.out.println("verify title:"+title1.equals(pagetitle));
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement bestselles=driver.findElement(By.linkText("Best Sellers"));
	bestselles.click();
	String navigatepage=driver.getTitle();
	System.out.println("validation navi & homepage title:"+navigatepage.equals("Amazon.in Bestsellers: The most popular items on Amazon"));
	System.out.println("validation home page:"+pagetitle.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 WebElement books=driver.findElement(By.linkText("Books"));
	 books.click();
	 String booktitle=driver.getTitle();
	 System.out.println("validation of books is:"+booktitle.equals("Book Store Online : Buy Books Online at Best Prices in India | Books Shopping @ Amazon.in"));
	WebElement Electronic =driver.findElement(By.linkText("Electronics"));
	Electronic.click();
	String electitle=driver.getTitle();
	System.out.println("validation of title:"+electitle.equals("Electronics Store: Buy Electronics products Online at Best Prices in India at Amazon.in"));
	
	
	driver.close();
	  
	  
	   
	    
	    
	}

}
