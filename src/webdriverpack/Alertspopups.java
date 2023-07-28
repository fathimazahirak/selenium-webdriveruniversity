package webdriverpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertspopups {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Automation\\chromedriver_win32\\chromedriver.exe");

	      WebDriver driver = new ChromeDriver();	     	    
	   
	   // driver.get("http://www.webdriveruniversity.com/");
	    
	      driver.get("http://www.webdriveruniversity.com/Popup-Alerts/index.html");
	      
	      driver.manage().window().maximize();
	     
	      /*
	      //CLICK1
	      WebElement Click1 = driver.findElement(By.id("button1"));
	      Click1.click();
	      Thread.sleep(1000);
	      driver.switchTo().alert().accept();
	      */
	      
	      //CLICK2
	     
	      /*
	      WebElement Click2 = driver.findElement(By.xpath("//*[@id=\"button2\"]/p"));
	      Click2.click();
	      Thread.sleep(1000);
	     // driver.switchTo().alert().accept();
	     // driver.switchTo().alert().getText();	     	     
	      WebElement Close = driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button"));
	      Close.click();
	      
	      
	      //Click 3
	      WebElement Click3 = driver.findElement(By.xpath("//*[@id=\"button3\"]/p/a"));
	      Click3.click();
	      driver.switchTo().alert().accept();
	      */
	      
	      //click4
	      driver.findElement(By.xpath("//*[@id=\"button4\"]/p")).click();
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("//*[@id=\"confirm-alert-text\"]"));
	      Thread.sleep(1000);
	      //driver.switchTo().alert().accept();
	} 
	

}
