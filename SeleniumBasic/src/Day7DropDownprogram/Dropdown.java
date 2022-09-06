package Day7DropDownprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Executeable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement skilldropdown=driver.findElement(By.id("Skills"));
		
		// create an instance of select class
		Select selectskill=new Select(skilldropdown);
 
		// check dropdown list is multiselect or not
		System.out.println("dropwon is allowing multiple select :"+selectskill.isMultiple());
		
		//get default select option
		WebElement defaultname=selectskill.getFirstSelectedOption();
		String defaultoption=defaultname.getText();
		System.out.println("Default option name is:"+defaultoption);
		
		// get option count
		List<WebElement> option=selectskill.getOptions();
		System.out.println("get option list:"+option.size());
		for(int i=0;i<option.size();i++) {
			System.out.println(option.get(i).getText());
		}
		
		// validation of dropdown list in asending order
		 selectskill.selectByIndex(5);
		        //or
         selectskill.selectByValue("AutoCAD");
               //or
         selectskill.selectByVisibleText("Android");
         
        List actuallist=new ArrayList();
        for(WebElement element:option) {
        	String data=element.getText();
        	actuallist.add(data);
        	}
        System.out.println("actuallist:"+actuallist);
         List temp=new ArrayList();
         temp.addAll(actuallist);
         System.out.println(temp.equals(actuallist));
         
         WebElement yearlist=driver.findElement(By.id("yearbox"));
         Select dropdownlist=new Select(yearlist);
         System.out.println("year dropdown is allowing select  multiple option"+dropdownlist.isMultiple());
         dropdownlist.selectByIndex(10);
         
        List< WebElement> getoption=dropdownlist.getOptions();
       
        System.out.println(getoption.size());
         
        List orignallist=new ArrayList();
         for(WebElement ele:getoption) {
              String data=ele.getText();
             orignallist.add(data);
         }
         List temp1=new ArrayList();
         temp1.addAll(orignallist);
         System.out.println(temp1.equals(orignallist));
         
         // validation of day
         WebElement monthlist=driver.findElement(By.cssSelector("select[placeholder='Month']"));
         Select getlist=new Select(monthlist);
         System.out.println("month  drop down is allowing multiple select:"+getlist.isMultiple());
         
         List<WebElement>monthname=getlist.getOptions();
         System.out.println(monthname.size());
         List org=new ArrayList();
         for(int i=0;i<monthname.size();i++) {
        	 WebElement data=monthname.get(i);
        	 String data1=data.getText();
        	 org.add(data1);
         }
         List temp2=new ArrayList();
         temp2.addAll(org);
         System.out.println(temp2.equals(org));
         System.out.println("org list:"+org);
         System.out.println("temp2 list:"+temp2);
         
         
         //validation for days
         WebElement dayoption=driver.findElement(By.id("daybox"));
         Select selectday=new Select(dayoption);
         System.out.println("Day dropdown is allowing multiple select:"+selectday.isMultiple());
         
         selectday.selectByIndex(20);
         List<WebElement>daylist=selectday.getOptions();
         System.out.println("day count:"+daylist.size());
         for(int i=0;i<daylist.size();i++) {
        	 System.out.println(daylist.get(i).getText());
             
         }
         List org1=new ArrayList();
         for(WebElement ele:daylist) {
        	 String data=ele.getText();
        	 org1.add(data);
         }
         List temp3=new ArrayList();
         temp3.addAll(org1);
         System.out.println("validation of day is:"+temp3.equals(org1));
         System.out.println("org1 daylist"+org1);
         System.out.println("temp3 list:"+temp3);
         
         
         
         
         }
}
