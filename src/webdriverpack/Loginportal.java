package webdriverpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginportal {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Automation\\chromedriver_win32\\chromedriver.exe");

	      WebDriver driver = new ChromeDriver();
	   
	   // driver.get("http://www.webdriveruniversity.com/");
	    
	      driver.get("http://www.webdriveruniversity.com/Login-Portal/index.html");
	      
	    driver.manage().window().maximize();
	    
	   // WebElement Loginportal = driver.findElement(By.xpath("//*[@id=\"login-portal\"]/div/div[1]/h1"));
	    //Loginportal.click();
	    
	    WebElement Username = driver.findElement(By.id("text"));
	    Username.sendKeys("ANEES");
	    
	    WebElement Password = driver.findElement(By.id("password"));
	    Password.sendKeys("12345@nachu");
	    
	    WebElement Login = driver.findElement(By.id("login-button"));
	    Login.click();

	}

}
