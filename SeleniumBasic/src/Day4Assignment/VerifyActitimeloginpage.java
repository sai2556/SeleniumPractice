package Day4Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyActitimeloginpage {

	public static void main(String[] args) {
	String chromepath=System.getProperty("user.dir")+"\\Executeable\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", chromepath);
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	
	//verification of username
	WebElement username=driver.findElement(By.name("username"));
	System.out.println("Username is dispaly or not:"+username.isDisplayed());
	System.out.println("Username is enable or not:"+username.isEnabled());
	String defaultusername=username.getAttribute("placeholder");
	System.out.println("default value of username"+defaultusername.equals("Username"));
	
	//verification of  password
	WebElement password=driver.findElement(By.name("pwd"));
	System.out.println("password is dispaly or not:"+password.isDisplayed());
	System.out.println("password is enable or not:"+password.isEnabled());
	String defaultpassword=password.getAttribute("placeholder");
	System.out.println("defualt validation of password:"+defaultpassword.equals("Password"));
	
	WebElement loginbutton=driver.findElement(By.className("initial"));
	System.out.println("login button is dispaly or not:"+loginbutton.isDisplayed());
	System.out.println("login button is enable or not:"+loginbutton.isEnabled());
	String deafultloginbuttonfeild=loginbutton.getText();
	System.out.println("login button:"+deafultloginbuttonfeild);
	System.out.println("validation of login button:"+deafultloginbuttonfeild.equals("Login"));
	 driver.close();		
	

	}

}
