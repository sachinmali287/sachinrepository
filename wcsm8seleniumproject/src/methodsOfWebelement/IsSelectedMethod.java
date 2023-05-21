package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

	public static void main(String[] args) {
		
		// It is used to verify the webelement is selected or not ---- boolean
		// If it is selected output is True
		// If it is not selected output is False

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do;jsessionid=33j13g3lvguhm");
		
		WebElement checkBox = driver.findElement(By.name("remember"));
		boolean verify = checkBox.isSelected();

		System.out.println(verify);
		checkBox.click();
		boolean verify1 = checkBox.isSelected();
		System.out.println(verify1);
			
	}

}
