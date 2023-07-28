package webdriverpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Pageobjectmodel {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Automation\\chromedriver_win32\\chromedriver.exe");

	      WebDriver driver = new ChromeDriver();
	   
	   // driver.get("http://www.webdriveruniversity.com/");
	    
	      driver.get("http://www.webdriveruniversity.com/Page-Object-Model/index.html");
	      
	    driver.manage().window().maximize();
	   
	    WebElement Home = driver.findElement(By.xpath("//*[@id=\"div-main-nav\"]/div/ul/li[1]/a"));
	    Home.click();	   
	    
      // WebElement Sidebar = driver.findElement(By.xpath("//*[@id=\"carousel-example-generic\"]/a[2]/span"));
      // Sidebar.click();
       
     //  WebElement Products = driver.findElement(By.xpath("//*[@id=\"div-main-nav\"]/div/ul/li[2]/a"));
       //Products.click();
             
      // WebElement Cameras = driver.findElement(By.xpath("//*[@id=\"container-product1\"]/div[1]/p"));
      // Cameras.click();
       
      /// WebElement Closebtn = driver.findElement(By.className("close"));
       //Closebtn.clear();
	    
	   /*
	     WebElement Contactus = driver.findElement(By.xpath("//*[@id=\"div-main-nav\"]/div/ul/li[3]/a"));	    
	     Contactus.click();
	    
	    WebElement Fullname = driver.findElement(By.name("first_name"));
	    Fullname.sendKeys("RYHA");
	     
	    WebElement Lastname = driver.findElement(By.name("last_name"));
	    Lastname.sendKeys("NYHA");
	    
	    WebElement Emailadd = driver.findElement(By.name("email"));
	    Emailadd.sendKeys("ryha@gmail.com");
	    
	    WebElement Comments=driver.findElement(By.name("message"));
	    Comments.sendKeys("TRUST IN GOD");
	    
	    Thread.sleep(2000);
	    
	   // WebElement Reset=driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[1]"));
	    //Reset.click();
	    
	    WebElement Submit=driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]"));
	    Submit.click(); 
       
	    driver.close();
	    */
	    
	    
       
       
       
       
       

	}

}
