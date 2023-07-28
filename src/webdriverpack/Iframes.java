package webdriverpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Automation\\chromedriver_win32\\chromedriver.exe");

	      WebDriver driver = new ChromeDriver();	     	    
	   
	   // driver.get("http://www.webdriveruniversity.com/");
	    
	      driver.get("http://www.webdriveruniversity.com/IFrame/index.html");
	      
	      driver.manage().window().maximize();
	      
	      //frame using id or name
	     // driver.switchTo().frame("frame"); //given id starts in line iframe
	      
	      //frame using index
	      driver.switchTo().frame(0); // given index
	      driver.findElement(By.linkText("Contact Us")).click();
	      
	      //frame using webelement	      	   
	    // WebElement frame1=driver.findElement(By.xpath("//*[@id=\"frame\"]"));
	    // driver.switchTo().frame(frame1);	      
	    // driver.findElement(By.linkText("Our Products")).click(); // click 'our products' inside frame
	     
	      
	     
	      //driver.quit();
	      //how many iframes  are there: take inspect ,cntrl f 
	      
	      
	}

}
