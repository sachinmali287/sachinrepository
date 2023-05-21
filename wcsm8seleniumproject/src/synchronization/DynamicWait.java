package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DynamicWait {

	public static void main(String[] args) {
		// Dynamic Wait
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		
		//Applay the Impliciti Wait to apare the webelement
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.instagram.com/");
        
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("sachin",Keys.ENTER);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123",Keys.ENTER);
        driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();


	}

}
