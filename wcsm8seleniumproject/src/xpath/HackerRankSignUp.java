package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HackerRankSignUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.hackerrank.com/auth/signup");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='First & Last name']")).sendKeys("sachinmali");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("sachin@123654");
		driver.findElement(By.xpath("//input[@placeholder='Your password']")).sendKeys("1563247896");
		driver.findElement(By.name("tos_accepted")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Create An Account']")).click();

	}

}
