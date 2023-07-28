package webdriverpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplttextfield {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Automation\\chromedriver_win32\\chromedriver.exe");

	      WebDriver driver = new ChromeDriver();	     	    
	   
	   // driver.get("http://www.webdriveruniversity.com/");
	    
	      driver.get("http://www.webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html?food-item=");
	      
	      driver.manage().timeouts(); 
	      
	      driver.manage().window().maximize();
	      
	      
	      WebElement Fooditem = driver.findElement(By.id("myInput"));
	      Fooditem.sendKeys("B");
	      Thread.sleep(1000);
	      
	      List<WebElement> searchListAutoComplete = driver.findElements(By.xpath("//*[@id=\"myInputautocomplete-list\"]/div[5]"));
	      
	      for (WebElement Fooditem1 : searchListAutoComplete) {	        		        
	            String searchTexts = Fooditem1.getText();
	            System.out.println(searchTexts);
	           
	            if (searchTexts.contains("Barley")) {
	                Fooditem1.click();
	            }
	      }
	     
	      WebElement Submit = driver.findElement(By.id("submit-button"));
	  	  Submit.click();
	  	  	driver.close();
	  	  	
	    }
	    	     
	}
