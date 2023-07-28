package webdriverpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttonclicks {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Automation\\chromedriver_win32\\chromedriver.exe");

	      WebDriver driver = new ChromeDriver();
	   
	   // driver.get("http://www.webdriveruniversity.com/");
	    
	      driver.get("http://www.webdriveruniversity.com/Click-Buttons/index.html");
	      
	    driver.manage().window().maximize();
	    
	    //WebElement Webclick = driver.findElement(By.xpath("//*[@id=\"button1\"]/p"));
	    //Webclick.click();
	    
	    //WebElement Javaclick = driver.findElement(By.xpath("//*[@id=\"button2\"]"));
	   // Javaclick.click();
	    
	    WebElement Moveclick = driver.findElement(By.id("button3"));
		   Moveclick.click();
	    
	    
	    
	    

	}

}
