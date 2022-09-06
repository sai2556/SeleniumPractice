package Day3Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterPage {

	public static void main(String[] args) {
		String ChromeExePath1=System.getProperty("user.dir")+"\\Executeable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromeExePath1);
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement FullName=driver.findElement(By.className("form-control"));
		FullName.clear();
		FullName.sendKeys("Sainath");
		
		/*WebElement Address=driver.findElement(By.tagName("3"));
            Address.sendKeys("Shahu colony lane no 11 ,karve nagar,pune");
            
            WebElement EmailAddress=driver.findElement(By.className("form-control"));
            EmailAddress.sendKeys("Saikale005@gmail.com");
            
            WebElement Phone=driver.findElement(By.className("form-control "));
            Phone.sendKeys("9585256545");*/
		WebElement Gender=driver.findElement(By.name("radiooptions"));
		Gender.sendKeys("Male");
		
		WebElement Hobbis=driver.findElement(By.id("checkbox1"));
		Hobbis.sendKeys("Cricket");
		
		
            
            
	}

}
