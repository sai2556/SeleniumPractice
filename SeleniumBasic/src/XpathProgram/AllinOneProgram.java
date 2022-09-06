package XpathProgram;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllinOneProgram {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", ".\\Executeable\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     
	     driver.get("https://demo.automationtesting.in/Register.html");
       // WebElement Headname= driver.findElement(By.xpath("//h1[text()='Automation Demo Site']"));
	     // front nd last  space is not allowed in inner text() method 
        // System.out.println("Headder Nanme="+Headname.getText());
      
      List<WebElement> menubar=driver.findElements(By.xpath("//ul[@class='nav navbar-nav']/li"));
      
      System.out.println("print menubbar:"+menubar.size());
      for(int i=0;i<menubar.size();i++) {
    	  System.out.println(menubar.get(i).getText());
      }
      WebElement name=driver.findElement(By.xpath("//h2[text()='Register']"));
      System.out.println("namr:"+name.getText());
      System.out.println (name.isDisplayed());
      String fontcolor=name.getCssValue("color");
      String fontsize=name.getCssValue("font-size");
      String backgroundcolor=name.getCssValue("background-color");
      System.out.println(" fontcolor"+fontcolor);
      System.out.println("fontcolor="+fontsize);
      System.out.println("backgroundcolor="+backgroundcolor);
      
       WebElement username=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
      String fontcolor1=username.getCssValue("color"); System.out.println("username1"+fontcolor1);
      String fontsize1=username.getCssValue("font-size");System.out.println("username1"+fontsize1);
      String backgroundcolor1=username.getCssValue("background-color");System.out.println("username1"+backgroundcolor1);
      username.clear();
      username.sendKeys("sainath");
      
      // get last name fontcolor,fontsize,put last name 
      WebElement lastname=driver.findElement(By.xpath("//input[@placeholder='Last Name' or @class='from-control']"));
      String fontcolor2=lastname.getCssValue("color");
      String fontsize2=lastname.getCssValue("font-size");
      String backgroundcolor2=lastname.getCssValue("background-color");
      String width=lastname.getCssValue("width");System.out.println("width of lastname:"+width);
      lastname.clear();
      lastname.sendKeys("kale");
      
      //check last name position is right or not 
      Point locationusername=username.getLocation();
      int usernameX=locationusername.getX();
      int usernameY=locationusername.getY();
      System.out.println("usernameY cord"+usernameY);
      System.out.println("username X cord"+usernameX);
      int lstnameX=lastname.getLocation().getX();
      int lstnameY=lastname.getLocation().getY();
      System.out.println("is last name is diplayed right side of username:"+(usernameX<lstnameX));
      
      // locate address element get fontcolor,fontsize,put adress nd check position
      WebElement adress=driver.findElement(By.xpath("//*[@ng-model='Adress']"));
      String boxsizing=adress.getCssValue("box-sizing");System.out.println("boxsizzing:"+boxsizing);
      adress.sendKeys("sevalal nagar georai,dist beed");
      int adresY=adress.getLocation().getY();
      System.out.println("is addres is displayed down side of username nd password:"+(adresY>usernameY));
      
      //locate email addres nd phone number 
      int emailY=driver.findElement(By.xpath("//input[@*='email']")).getLocation().getY();
      System.out.println("is email id displyed under adrees:"+(adresY<emailY));
      WebElement email=driver.findElement(By.xpath("//input[@*='email']"));
      String emailfontsize=email.getCssValue("font-size");System.out.println("fontsize email is:"+emailfontsize);
      email.sendKeys("saikale007@gmail.com");
      
      WebElement Phoneno=driver.findElement(By.xpath("//*[@*='tel']"));
      int phnoY=Phoneno.getLocation().getY(); System.out.println("phone Y cord:"+phnoY);
      System.out.println("is phone no displayed exact under the emailadrs:"+(phnoY>emailY));
      System.out.println("emailY cord is:"+emailY);
      Phoneno.sendKeys("9545452556");
      String phnofontcolor=Phoneno.getCssValue("color"); System.out.println("phno fontcolor is:"+phnofontcolor);
       
      // locate radio button nd select the button 
      WebElement radiobutton=driver.findElement(By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4']/label[1]"));
      int radioMY=radiobutton.getLocation().getY();
      int radioMX=radiobutton.getLocation().getX();
      System.out.println("is radio button displayed exact under the phoneno:"+(radioMY>phnoY));
     String rdbtnfontsize= radiobutton.getCssValue("font-size");
     radiobutton.click();
     int radioFX=driver.findElement(By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4']/label[2]")).getLocation().getX();
     System.out.println("is female radio button is right side of male radiobuton:"+(radioMX<radioFX));
     
     //locate checkbox
     WebElement checkbox=driver.findElement(By.xpath("//input[@id='checkbox1']"));
     int checkboxY=checkbox.getLocation().getY();
     System.out.println("is check box displayed exact under the radiobutton:"+(checkboxY>radioMY));
     checkbox.click();
     
     //dropdown list
    WebElement language=driver.findElement(By.id("msdd"));
    language.click();
    driver.findElement(By.xpath("//div[@style='display: block;']/ul/li[16]")).click();
   
   WebElement skilloption=driver.findElement(By.xpath("//select[@id='Skills']"));
   Select skilllist=new Select(skilloption);
   List<WebElement>getoptionlist=skilllist.getOptions();
  
   for(int i=0;i<getoptionlist.size();i++) {
	   System.out.println(getoptionlist.get(i).getText());
   }
   skilllist.selectByValue("Adobe Photoshop");
    
   WebElement country=driver.findElement(By.xpath("//span[@aria-labelledby='select2-country-container']"));
   country.click();
   WebElement list=driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']"));
   Select countrylist=new Select(list);
   List<WebElement> countryoption=countrylist.getOptions();
   countrylist.selectByIndex(2);
   for(int i=0;i<countryoption.size();i++) {
	   System.out.println(countryoption.get(i).getText());
   }
     WebElement year=driver.findElement(By.xpath("//select[@*='yearbox']"));
     Select yearlist=new Select(year);
     yearlist.selectByValue("1995");
     
      
      
      
      
      
      
    		  
      
      
	}

}
 