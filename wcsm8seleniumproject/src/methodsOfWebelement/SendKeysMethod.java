package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SendKeysMethod {

	public static void main(String[] args) throws InterruptedException {
		
		// it is used to send the input for a TextBox,SearchBox and ActiveElement   ===   void

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("http://127.0.0.1/login.do");
		
		//driver.findElement(By.name("username")).sendKeys("admin");
		//driver.findElement(By.name("pwd")).sendKeys("manager");

		WebElement userNameTB = driver.findElement(By.name("username"));
		userNameTB.sendKeys("admin123");
		
		
		WebElement passwordTB = driver.findElement(By.name("pwd"));
		passwordTB.sendKeys("manager123");
		Thread.sleep(2000);
		driver.navigate().refresh();
		userNameTB.sendKeys("manager123");
		Thread.sleep(2000);
		passwordTB.sendKeys("admin123");
        
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
		WebElement submitButton = driver.findElement(By.id("Check"));

		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();	
		
	}

}
