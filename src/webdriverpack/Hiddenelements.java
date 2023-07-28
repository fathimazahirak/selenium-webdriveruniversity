package webdriverpack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddenelements {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Automation\\chromedriver_win32\\chromedriver.exe");

	      WebDriver driver = new ChromeDriver();	     	    
	   
	   // driver.get("http://www.webdriveruniversity.com/");
	    
	      driver.get("http://www.webdriveruniversity.com/Hidden-Elements/index.html");
	      
	      driver.manage().window().maximize();
	      
	      
	      
	      WebElement Box1 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div[1]/div"));
	      Box1.click();
	      Thread.sleep(2000);
	      
	      WebElement Box2 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div[2]/div"));
	      Box2.click();
	     // JavascriptExecutor Box = (JavascriptExecutor) driver;
	     // Box.executeScript("document", "welcome");
	      

	      WebElement Box3 = driver.findElement(By.xpath("//*[@id=\"button3\"]"));
	      Box3.click(); 
	      
	      WebElement Close = driver.findElement(By.xpath("//*[@id=\"myModalMoveClick\"]/div/div/div[3]/button]"));
	      Close.click(); 
	}

}
