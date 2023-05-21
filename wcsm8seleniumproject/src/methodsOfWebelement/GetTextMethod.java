package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {

	public static void main(String[] args) {
		
		// it is used to get the text of the webelement   === String

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		String button = driver.findElement(By.xpath("//button[text()=' Login ']")).getText();
		System.out.println(button);

		String forgotPassword = driver.findElement(By.xpath("//p[text()='Forgot your password? ']")).getText();
		System.out.println(forgotPassword);

	}

}
