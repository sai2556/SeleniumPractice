package Day4Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifOrangehrmpage {

	public static void main(String[] args) {
		String ChromeExePath1=System.getProperty("user.dir")+"\\Executeable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromeExePath1);
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//implicit wwait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		String pageurl=driver.getCurrentUrl();
		System.out.println("Validation of url:"+pageurl.equals("https://opensource-demo.orangehrmlive.com/"));
		
		String loginpagetitle=driver.getTitle();
		System.out.println("Validation of title:"+loginpagetitle.equals("OrangeHRM"));
		
		
		
		
		WebElement Usernamefield=driver.findElement(By.id("txtUsername"));
		Usernamefield.sendKeys("Admin");
        System.out.println("Username is dispaly or not:"+Usernamefield.isDisplayed());
        System.out.println("Username is enabled or not:"+Usernamefield.isEnabled());
       
        WebElement PasswordField=driver.findElement(By.id("txtPassword"));
        PasswordField.sendKeys("admin123");
        System.out.println("Username is dispaly or not:"+PasswordField.isDisplayed());
        System.out.println("password enabled or not:"+PasswordField.isEnabled());
        
        WebElement forgotpassword=driver.findElement(By.linkText("Forgot your password?"));
        System.out.println("forgot password  is dispaly or not:"+forgotpassword.isDisplayed());
        System.out.println("forgot password is enable or not:"+forgotpassword.isEnabled());
        WebElement loginbutton=driver.findElement(By.id("btnLogin"));
        
        
        System.out.println("login is dispaly or not:"+loginbutton.isDisplayed());
        System.out.println("login button  is dispaly or not:"+loginbutton.isEnabled());
        
        String defaultloginbutton= loginbutton.getAttribute("value");
        System.out.println("default login button:"+defaultloginbutton);
        System.out.println("validate  loginbuttonn :"+defaultloginbutton.equals("LOGIN"));
        loginbutton.click();
        
        String homepageurl=driver.getCurrentUrl();
        System.out.println("home page url:"+homepageurl);
        System.out.println("home page url validation is::"+homepageurl.contains("dashboard"));
        
        WebElement welcome=driver.findElement(By.id("welcome"));
        welcome.click();
        WebElement logout=driver.findElement(By.linkText("Logout"));
        logout.click();
        
        driver.close();
        
        
        
        
        
        
        
        
        

	}

}
