package webdriverpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Databutntables {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Automation\\chromedriver_win32\\chromedriver.exe");

	      WebDriver driver = new ChromeDriver();	     	    
	   
	   // driver.get("http://www.webdriveruniversity.com/");
	    
	      driver.get("http://www.webdriveruniversity.com/Data-Table/index.html");
	      
	      driver.manage().window().maximize();
	      
	      //Enter data
	     /*
	       WebElement Fname = driver.findElement(By.name("firstname"));
	      
	      Fname.sendKeys("Nachu");
	      
	      WebElement Lname = driver.findElement(By.name("lastname"));
	      Lname.sendKeys("kutty");
	      
	      WebElement Inputtext= driver.findElement(By.xpath("//*[@id=\"form-textfield\"]/textarea"));
	      Inputtext.sendKeys("30");
	      */
	      
	     // WebElement Fname = driver.findElement(By.name("firstname"));
	     // Fname.sendKeys("Nachu");
		
	    	        WebElement AboutUs = driver.findElement(By.xpath("/html/body/div/div[3]/div/nav/ol/li[2]/a"));
	    	        Actions act = new Actions(driver);
	    	        act.moveToElement(AboutUs).perform();
	    	        driver.findElement(By.xpath("/html/body/div/div[3]/div/nav/ol/li[3]]")).click();
	    	       
	    	       
	    	        String breadcrumb = driver.findElement(By.xpath("/html/body/div/div[3]/div/h2]")).getText();
	    	        System.out.println(breadcrumb);
	    	       
	    	        String lastBreadcrumb = driver.findElement(By.xpath("/html/body/div/div[3]/div/nav/ol/li[2]/a")).getText();
	    	        System.out.println(lastBreadcrumb);
	    	        if(lastBreadcrumb.equals("AboutUs")){
	    	            System.out.println("bread crumb is in correct order.");
	    	        }else{
	    	            System.out.println("bread crumb is not in correct order.");

	}

}
}
