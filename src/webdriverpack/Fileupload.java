package webdriverpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Automation\\chromedriver_win32\\chromedriver.exe");

	      WebDriver driver = new ChromeDriver();
	   
	   // driver.get("http://www.webdriveruniversity.com/");
	    
	      driver.get("http://www.webdriveruniversity.com/File-Upload/index.html?filename=");
	      
	    driver.manage().window().maximize();
	    
	    WebElement Uploadfile = driver.findElement(By.id("myFile"));
	    Uploadfile.sendKeys("C:\\Users\\Admin\\Documents\\calligraphy\\calligraphy english\\thankful.png");
	    Thread.sleep(2000);
	    
	    
	    WebElement Submit = driver.findElement(By.id("submit-button"));
	    Submit.click();
	    Thread.sleep(1000);
	    
	    driver.quit();
	}

}
