package webdriverpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Datepicker {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Automation\\chromedriver_win32\\chromedriver.exe");

	      WebDriver driver = new ChromeDriver();
	   
	   // driver.get("http://www.webdriveruniversity.com/");
	    
	      driver.get("http://www.webdriveruniversity.com/Datepicker/index.html");
	      
	    driver.manage().window().maximize();
	    
	   WebElement Datepicker= driver.findElement(By.xpath("//*[@id=\"datepicker\"]/input"));
		Datepicker.click();
		
		//double click
		
		WebElement Doubleclickyrmnth= driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[1]/th[2]"));		
		Actions act= new Actions(driver);
		Thread.sleep(2000);
		act.doubleClick(Doubleclickyrmnth).perform();
		
		 WebElement yearSelect = driver.findElement(By.xpath("/html/body/div[2]/div[3]/table/tbody/tr/td/span[3]"));
		yearSelect.click();
			
		WebElement monthSelect = driver.findElement(By.xpath("/html/body/div[2]/div[2]/table/tbody/tr/td/span[1]"));
		monthSelect.click();
		 // use desired month
		
		WebElement daySelect = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[2]/td[3]"));
		daySelect.click();
		
		//date selected :01/05/2021
			    
	   
				

    }
  }


