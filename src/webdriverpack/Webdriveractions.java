package webdriverpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Webdriveractions {

	public Webdriveractions(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Automation\\chromedriver_win32\\chromedriver.exe");

	      WebDriver driver = new ChromeDriver();
	   
	   // driver.get("http://www.webdriveruniversity.com/");
	    
	      driver.get("http://www.webdriveruniversity.com/Actions/index.html");
	      
	    driver.manage().window().maximize();
	   
	    /*Right click
	     
	    WebElement Rightclick = driver.findElement(By.xpath("//*[@id=\"droppable\"]/p/b"));
	    Actions act = new Actions(driver);
	    act.contextClick(Rightclick).perform(); //Right click action
	    */
	    
	    //Drag and drop
	  /*
	   WebElement Dragme = driver.findElement(By.xpath("//*[@id=\"draggable\"]/p"));
	    WebElement Dropme = driver.findElement(By.xpath("//*[@id=\"droppable\"]/p/b"));
	    
	    Actions act = new Actions(driver);
	    Thread.sleep(2000);
	    act.dragAndDrop(Dragme, Dropme).build().perform();
	    
	    //mam code
	     driver.switchTo().frame(0);
		WebElement sourceElement = driver.findElement(By.xpath("//div[@id='draggable']//p"));	 
		WebElement targetElement = driver.findElement(By.xpath("//div[@id='droppable']"));
		   
		Actions action = new Actions(driver);   
		action.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();
	     
	    
	    
	    //Double Click
	    
	   /*
	    WebElement Doubleclick= driver.findElement(By.id("double-click"));
	    Actions act = new Actions(driver);
	    Thread.sleep(2000);
	    act.doubleClick(Doubleclick).perform();
	    */
	   /* 
	    WebElement Linkclick1 = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[1]/button"));
	    Linkclick1.click();
	    
	    WebElement Linkclick11 = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[1]/div/a"));
	    Linkclick11.click();
	    
	    
	    WebElement Linkclick2 = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[2]/button"));
	    Linkclick2.click();
	    
	    WebElement Linkclick21 = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[2]/div/a"));
	    Linkclick21.click();
	    Thread.sleep(2000);
	    
	    
	    WebElement Linkclick3 = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[3]/button"));
	    Linkclick3.click();
	    
	    WebElement Linkclick31 = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[3]/div/a[1]"));
	    Linkclick31.click();
	    Thread.sleep(2000);
	    
	    WebElement Linkclick32 = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[3]/div/a[2]"));
	    Linkclick32.click();
	    
	    
	    //Click and hold
	    
	    WebElement Clickhold= driver.findElement(By.id("click-box"));
	    Actions act= new Actions(driver);
	    act.clickAndHold(Clickhold).perform();
	    
	    
	    //Click and release
	    WebElement Clickhold= driver.findElement(By.id("click-box"));
	    Actions act= new Actions(driver);
	    act.click(Clickhold).perform();
	    
	   
	    //Mouse hover actions
	    WebElement Linkclick1 = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[1]/button"));
	    Actions act= new Actions(driver);
	    act.moveToElement(Linkclick1).perform();
	    WebElement Linkclick11 = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[1]/div/a"));
	    Linkclick11.click();
	    Thread.sleep(2000);
	    */
	    
	    WebElement Linkclick3 = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[3]/button"));	  
	    Webdriveractions act= new Webdriveractions(driver);
	    act.moveToElement(Linkclick3).perform();
	    Thread.sleep(2000);
	    
	    WebElement Linkclick31 = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[3]/div/a[1]"));
	    Linkclick31.click();
	    Thread.sleep(2000);
	    
	    WebElement Linkclick32 = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[3]/div/a[2]"));
	    Linkclick32.click();
	    Thread.sleep(2000);
	    
	    
	    
	    
	    
	    
	   

	}

	private Actions moveToElement(WebElement linkclick3) {
		// TODO Auto-generated method stub
		return null;
	}

}
