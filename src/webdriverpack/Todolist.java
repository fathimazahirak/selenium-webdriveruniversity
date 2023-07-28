package webdriverpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Todolist {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Automation\\chromedriver_win32\\chromedriver.exe");

	      WebDriver driver = new ChromeDriver();
	   
	   // driver.get("http://www.webdriveruniversity.com/");
	    
	      driver.get("http://www.webdriveruniversity.com/To-Do-List/index.html");
	      
	    driver.manage().window().maximize();
	   
	    
	   // WebElement Addtodo = driver.findElement(By.xpath("//*[@id=\"container\"]/input"));
	  //  Addtodo.sendKeys("Sit and study");
	    
	    WebElement Addtrash= driver.findElement(By.xpath("//*[@id=\"container\"]/ul/li[3]/span"));
	    Addtrash.click();

	}

}
