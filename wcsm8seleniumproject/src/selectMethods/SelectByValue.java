package selectMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValue {

	public static void main(String[] args) throws InterruptedException {

		// it is used to select option from dropdown by using value of option  ===  void

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///D:/Software/SeleniumNotes/Web%20Element/MultipleselectDropdown.html");

		// to identify dropdown 

		WebElement dropDown = driver.findElement(By.name("menu"));

		// to select the multiple option
		
		Select sel = new Select(dropDown);
		Thread.sleep(2000);
		sel.selectByValue("v4");

	}

}
