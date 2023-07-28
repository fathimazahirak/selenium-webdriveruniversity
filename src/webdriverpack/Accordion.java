package webdriverpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Accordion {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Automation\\chromedriver_win32\\chromedriver.exe");

	      WebDriver driver = new ChromeDriver();
	   
	   // driver.get("http://www.webdriveruniversity.com/");
	    
	      driver.get("http://www.webdriveruniversity.com/Accordion/index.html");
	      
	    driver.manage().window().maximize();
	    
	    WebElement Manualtest = driver.findElement(By.id("manual-testing-accordion"));
	    Manualtest.click();
	    Thread.sleep(2000);
	    
	    WebElement Cucumberbdd = driver.findElement(By.id("cucumber-accordion"));
	    Cucumberbdd.click();
	    Thread.sleep(2000);
	    
	    WebElement Autotest = driver.findElement(By.id("automation-accordion"));
	    Autotest.click();
	    Thread.sleep(2000);
	    
	    WebElement Keepclick = driver.findElement(By.id("click-accordion"));
	    Keepclick.click();
	    Thread.sleep(2000);
	   
        driver.quit();
	}

}
