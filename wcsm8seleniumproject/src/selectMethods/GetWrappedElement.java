package selectMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElement {

	public static void main(String[] args) {

		// It is used to get the options from the dropdown of single webelement   === webelement

		System.setProperty("webdriver.chromedriver.driver","./drivers/chromedriver.exe");

		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///D:/Software/SeleniumNotes/Web%20Element/MultipleselectDropdown.html");

		// to identify dropdown 

		WebElement dropDown = driver.findElement(By.name("menu"));

		//To select Multiple Options

		Select sel = new Select(dropDown);

		WebElement options = sel.getWrappedElement();
		String values = options.getText();
		System.out.println(values);

	}

}
