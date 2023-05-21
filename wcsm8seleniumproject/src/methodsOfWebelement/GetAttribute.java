package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) {

		// it is used to get the attribute value from HTML document for a particular webelement.  -  String()
		// if the attribute is not present it will get default value

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.selenium.dev/downloads/");
		WebElement value = driver.findElement(By.xpath("//h1[text()='Downloads']"));

		String ClassValue = value.getAttribute("class");
		System.out.println(ClassValue);


	}

}
