package webdriverpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contactus {

	public static void main(String[] args) {
		
       System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Automation\\chromedriver_win32\\chromedriver.exe");

	      WebDriver driver = new ChromeDriver();
	   
	    //driver.get("http://www.webdriveruniversity.com/");
	      
	      driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
	    
	    driver.manage().window().maximize();

	   // WebElement ContactUs = driver.findElement(By.xpath("//*[@id=\"contact-us\"]/div/div[1]/h1"));
	   // ContactUs.click();
	    
	    WebElement Firstname= driver.findElement(By.name("first_name"));
	    Firstname.sendKeys("FATHIMA");
	    
	    WebElement Lastname = driver.findElement(By.name("last_name"));
	    Lastname.sendKeys("ZAHIRA");
	    
	    WebElement Email=driver.findElement(By.name("email"));
	    Email.sendKeys("fath@gmail.com");
	    
	    WebElement Comments=driver.findElement(By.name("message"));
	    Comments.sendKeys("TRUST IN GOD");
	    
	   // WebElement Reset=driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[1]"));
	    //Reset.click();
	    
	   // WebElement Submit=driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]"));
	    //Submit.click(); 
	    
	}

}
