package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoperStackAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();

		//  Apply the implicit wait to webelement
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.xpath("//div[@class='featuredProducts_cardBody__MDlEh']/descendant::img[@src='https://m.media-amazon.com/images/I/61br13t0jtL._SX679_.jpg']")).click();
		driver.findElement(By.id("Check Delivery")).sendKeys("580023");

		// apply the Explicit wait to webelement

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
		WebElement checkButton = driver.findElement(By.id("Check"));

		wait.until(ExpectedConditions.elementToBeClickable(checkButton)).click();


	}

	  
}

