package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StaticWait {
         //Static Wait
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
        driver.get("https://www.instagram.com/");
        
        Thread.sleep(2000); // it will stop the execution of 2ec.
        
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("sachin",Keys.ENTER);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123",Keys.ENTER);
        driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
  
	}

} 
