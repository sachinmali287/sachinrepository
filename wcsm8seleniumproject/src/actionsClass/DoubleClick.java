package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {

		// it is used to perform double click action on webelement

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do;jsessionid=33j13g3lvguhm");


		// Handle login page with valid inputs
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

		// HOME PAGE

		// click on Setting 

		driver.findElement(By.xpath("//div[text()='Settings']/following-sibling::img")).click();

		//click on logo & color
		driver.findElement(By.xpath("//a[contains(.,'Logo &')]")).click();

		Thread.sleep(2000);
		// click on radio button
		driver.findElement(By.xpath("//label[@for='uploadNewLogoOption']")).click();

		// click on choose file button
		WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));

		// create obj of Actions Class
		Actions act = new Actions(driver);

		//  Use this method for DoubleClick....
		act.doubleClick(target).perform();
		Thread.sleep(2000);


		// close the browser
		driver.quit();

	}

}
