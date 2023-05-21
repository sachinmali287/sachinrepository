package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirAsia {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.airasia.co.in/home");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[contains(text(),'PN')]")).sendKeys("PNQ");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='flight-search-source-field-read-only'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='flight-search-source-code' and text()='COK']")).sendKeys("COK");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Special Fares']")).click();
		
		
	}

}
