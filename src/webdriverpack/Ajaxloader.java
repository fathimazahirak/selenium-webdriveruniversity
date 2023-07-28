package webdriverpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ajaxloader {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Automation\\chromedriver_win32\\chromedriver.exe");

	      WebDriver driver = new ChromeDriver();
	   
	   // driver.get("http://www.webdriveruniversity.com/");
	    
	      driver.get("http://www.webdriveruniversity.com/Ajax-Loader/index.html");
	      
	    driver.manage().window().maximize();
	    
	    //implicit wait
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	    
	    //Ajax calls are handled using wait calls
	    
	   // WebElement Ajax1 = driver.findElement(By.xpath("//*[@id=\"ajax-loader\"]/div/div[1]/h1"));
	    //Ajax1.click();
	    
	    WebElement Clickme = driver.findElement(By.xpath("//*[@id=\"button1\"]/p"));
	    Clickme.click();
	    		
	    
	}

}
