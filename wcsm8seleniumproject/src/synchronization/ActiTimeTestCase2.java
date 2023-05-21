package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeTestCase2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();

		//  Apply the implicit wait to webelement
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://127.0.0.1/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		@SuppressWarnings("unused")
		String loginPageTitle = driver.getTitle();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		
		
		if(wait.until(ExpectedConditions.titleContains("actiTIME - Login")))
				
		{
			System.out.println("Login Page Title is matched !!, Test Case is passed!!");
		}
		else 
		{
			System.out.println("Home Page Title is not matched !!, Test Case is failed!!");

		}
		if(wait.until(ExpectedConditions.titleContains("actiTIME - Enter Time-Track")))
		{
			System.out.println("Login Page Title is matched !!, Test Case is passed!!");
		}
		else
		{
			System.out.println("Home Page Title is not matched !!, Test Case is failed!!");
		}


		wait= new WebDriverWait(driver,Duration.ofSeconds(50));
		WebElement HomePageTitle = driver.findElement(By.id("login"));

		wait.until(ExpectedConditions.elementToBeClickable(HomePageTitle)).click();

		


	}

}
