package webdriverpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrollingaround {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Automation\\chromedriver_win32\\chromedriver.exe");

	      WebDriver driver = new ChromeDriver();
	      
	     // JavascriptExecutor js = (JavascriptExecutor) driver;
	   
	   // driver.get("http://www.webdriveruniversity.com/");
	    
	      driver.get("http://www.webdriveruniversity.com/Scrolling/index.html");
	      
	    
	      
	    driver.manage().window().maximize();
	    
	    JavascriptExecutor js = (JavascriptExecutor) driver; //scroll down 
	    js.executeScript("window.scrollBy(0,350)", "");
	    
	   // JavascriptExecutor js1 = (JavascriptExecutor) driver; // scroll up
	   // js1.executeScript("window.scrollBy(0,-350)", "");
	   
	   // WebElement Text= driver.findElement(By.linkText("Well done for scrolling to me!"));
	    //js.executeScript("arguments[0].scrollIntoView();",Text );
	      
	  // Actions Scroll = new Actions(driver);
	  //  Scroll.sendKeys(Keys.PAGE_DOWN).build().perform();
	  
	   
	    /*	   
	    
	   WebElement Scrollkey = driver.findElement(By.className("col-lg-12"));
	   Actions Scrollact = new Actions(driver);
	      Scrollact.moveToElement(Scrollkey);
	      Scrollact.perform();
	   ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", Scrollkey);
	      Thread.sleep(800);
	      //driver.quit();
	        */
	       

	}
	
}
