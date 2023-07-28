package webdriverpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowncheckbox {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Automation\\chromedriver_win32\\chromedriver.exe");

	      WebDriver driver = new ChromeDriver();
	   
	   // driver.get("http://www.webdriveruniversity.com/");
	    
	      driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	      
	    driver.manage().window().maximize();
	    
	   /* WebElement drpdowns = driver.findElement(By.id("dropdowm-menu-1"));
	    drpdowns.click();
	    
	    Select drpdown = new Select(driver.findElement(By.id("dropdowm-menu-1")));
	    drpdown.selectByIndex(1);
	     Thread.sleep(1000);
	     
	     Select drpdown1 = new Select(driver.findElement(By.id("dropdowm-menu-2")));
		 drpdown1.selectByVisibleText("TestNG");
		 Thread.sleep(1000);
	     
		 Select drpdown2 = new Select(driver.findElement(By.id("dropdowm-menu-3")));
	     drpdown2.selectByVisibleText("CSS");
		 Thread.sleep(1000);
	    */
	    
		 //CHECKBOXES
		 /*   
	    WebElement Checkbox1 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[1]/input"));
	    Checkbox1.click();
	    Thread.sleep(1000);
	    
	    WebElement Checkbox4 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[4]/input"));
	    Checkbox4.click();
	    */
	    
	    //RADIO BUTTON
	  /*
	     WebElement Radiobtn1 = driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[1]"));
	    Radiobtn1.click();
	    Thread.sleep(1000);
	    
	    WebElement Radiobtn2 = driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[3]"));
	    Radiobtn2.click();
	    Thread.sleep(1000);
	    
	    WebElement Radiobtn3 = driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[5]"));
	    Radiobtn3.click();
	    Thread.sleep(1000);
	    */
	    
	    //SELECT AND DISABLE
	    
	    WebElement Selectbtn1 = driver.findElement(By.xpath("//*[@id=\"radio-buttons-selected-disabled\"]/input[1]"));
	    Selectbtn1.click();
	    Thread.sleep(1000);
	    
	    Select drpfruits = new Select(driver.findElement(By.id("fruit-selects")));
	    drpfruits.selectByVisibleText("Pear");
	    
	    driver.quit();
	    
	}

}
