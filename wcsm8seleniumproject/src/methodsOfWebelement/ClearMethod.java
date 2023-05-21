package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
	
	// It is used to Clear the checkbox, TextBox and SearchBox on a webPage   ==  void

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();

		//  Apply the implicit wait to webelement
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://127.0.0.1/login.do;jsessionid=33j13g3lvguhm");
		WebElement usernameTB = driver.findElement(By.name("username"));

		WebElement passwordTB = driver.findElement(By.name("pwd"));
		
		usernameTB.sendKeys("admin");
		passwordTB.sendKeys("manager");
		
		Thread.sleep(2000);
		
		usernameTB.clear();
		Thread.sleep(1000);
		passwordTB.clear();
	}

}
