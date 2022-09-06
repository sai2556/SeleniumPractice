package Day4Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5Assignment {

	public static void main(String[] args) {
		String chromepath=System.getProperty("user.dir")+"\\Executeable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromepath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		

		
		WebElement username=driver.findElement(By.cssSelector("#username"));
		System.out.println("username dispaly :"+username.isDisplayed());
		System.out.println("username enabled :"+username.isEnabled());
		username.click();
	
		
		WebElement Password=driver.findElement(By.cssSelector("#password"));
		System.out.println("password dispaly :"+Password.isDisplayed());
		System.out.println("password is enable :"+Password.isEnabled());
		Password.click();
		
		WebElement signin=driver.findElement(By.cssSelector(".button"));
		System.out.println("login button is  displayed:"+signin.isDisplayed());
		System.out.println("login button is enable: "+signin.isEnabled());
		
		
		WebElement forgotpassword=driver.findElement(By.cssSelector(".forgotPasswordLink"));
		System.out.println("forgotpassword is dispalyed :"+forgotpassword.isDisplayed());
		System.out.println("forgotpassword is enabled :"+forgotpassword.isEnabled());
		signin.click();
		
		
	
		
		WebElement addwidget=driver.findElement(By.cssSelector(".addButton.dropdown-toggle"));

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		addwidget.click();
		
		WebElement selecthistory=driver.findElement(By.cssSelector("a[data-name='History']"));
		selecthistory.click();
		WebElement addwidget1=driver.findElement(By.cssSelector(".addButton"));
		addwidget1.click();
		WebElement selectSalespipline=driver.findElement(By.cssSelector("a[data-name='PipelinedAmountPerSalesPerson']"));
		selectSalespipline.click();

		WebElement user=driver.findElement(By.cssSelector(".userName"));
		user.click();
		WebElement signout=driver.findElement(By.cssSelector("#menubar_item_right_LBL_SIGN_OUT"));
		signout.click();
		

	}

}
