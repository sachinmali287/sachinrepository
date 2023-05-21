 package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Netflix {

	public static void main(String[] args) throws InterruptedException {
		//Netflix login
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
       co.addArguments("--remote-allow-origins=*");
       	
       WebDriver driver=new ChromeDriver(co);
       driver.manage().window().maximize();
      
       driver.get("https://www.netflix.com/in/login");
       Thread.sleep(2000);
       driver.findElement(By.id("id_userLoginId")).sendKeys("sachin",Keys.ENTER);
       driver.findElement(By.name("password")).sendKeys("admin213522",Keys.ENTER);
       driver.findElement(By.xpath("//button[text()='Sign In']")).click();
       
	}

}
