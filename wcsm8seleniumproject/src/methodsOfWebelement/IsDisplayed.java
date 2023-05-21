package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class IsDisplayed {

	public static void main(String[] args) {

		// It is used to verify webelement is present on webpage or not   --  boolean 
		// if it is not displayed we will get Exception

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://www.netflix.com/in/login");
		
		WebElement usnTB = driver.findElement(By.name("userLoginId"));
		WebElement passTB = driver.findElement(By.name("password"));
		WebElement button = driver.findElement(By.xpath("//button[text()='Sign In']"));
		
		if(usnTB.isDisplayed())
		{
			usnTB.sendKeys("Sachin@123");
		}
		
		else
		{
			System.out.println("Will get Exception!!");
		}
		
		
		if(passTB.isDisplayed())
		{
			passTB.sendKeys("qwert123");
		}
		
		else
		{
			System.out.println("Will get Exception!!");
		}
		
		if(button.isDisplayed())
		{
			button.click();
		}
		
		else
		{
			System.out.println("Will get Exception!!");
		}
	}

}
