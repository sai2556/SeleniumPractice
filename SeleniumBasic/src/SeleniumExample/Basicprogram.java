package SeleniumExample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basicprogram {

	public static void main(String[] args) {
		/*
		 * step  1=set the path of required browser Executable  file using system.setproperty(key,value)
		 *  theare are tow types to get path 
		 *  1.absolute path=E:\\Eclipse Workplace\\SeleniumBasic\\Executeable\\chromedriver.exe
		 *  2.relative path=.\\Executeable\\chromedriver.exe ="." indicate current user dir
		 * step 2=crate an instance of required browser class*/
	/*	System.setProperty("webdriver.chrome.driver", 
				"E:\\Eclipse Workplace\\SeleniumBasic\\Executeable\\chromedriver.exe");
       
		ChromeDriver drv=new ChromeDriver(); // crate instance 
		drv.get("https://www.google.com");// to enter the url on the open browser
		drv.close();*/
	//System.setProperty("webdriver.chrome.driver", ".\\Executeable\\chromedriver.exe");
	//System.getProperty("user.dir");
	String drvpath=System.getProperty("user.dir")+"\\Executeable\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver","drvpath" );
//	ChromeDriver drv=new ChromeDriver();
	WebDriver drv=new ChromeDriver(); //performe upcasting
	drv.get("https://www.google.com");
	// validate Expected page url
	String expectedUrl="https://www.google.com";
	String CurrentUrl=drv.getCurrentUrl();
	System.out.println("check :"+expectedUrl.equals(CurrentUrl));
	
	
	
		
		
	}

}
