package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeTestCase1 {

	public static void main(String[] args)  {

		// TO Apply implicit wait

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();

		//  Apply the implicit wait to webelement
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://127.0.0.1/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

		if(driver.getTitle().equals("actiTIME - Login"))
		{
			System.out.println("Login Page Title is matched !!, Test Case is passed!!");
		}
		else 
		{
			System.out.println("Home Page Title is not matched !!, Test Case is failed!!");

		}
		if(driver.getTitle().equals("actiTIME - Enter Time-Track"))
		{
			System.out.println("Login Page Title is matched !!, Test Case is passed!!");
		}
		else
		{
			System.out.println("Home Page Title is not matched !!, Test Case is failed!!");
		}


		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
		WebElement loginButton = driver.findElement(By.id("loginButton"));

		wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();

		driver.quit();

	}

}

