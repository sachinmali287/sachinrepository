package selectMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOption {

	public static void main(String[] args) throws InterruptedException {

		// It is used to get the firstselected option from the dropdown  ===   webelement

		System.setProperty("webdriver.chromedriver.driver","./drivers/chromedriver.exe");

		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///D:/Software/SeleniumNotes/Web%20Element/MultipleselectDropdown.html");

		// to identify dropdown 

		WebElement dropDown = driver.findElement(By.name("menu"));

		//To select Multiple Options

		Select sel = new Select(dropDown);

		for (int i=3; i<6; i++)
		{
			Thread.sleep(3000);
			sel.selectByIndex(i);
		}

		Thread.sleep(2000);
		WebElement firstOptions = sel.getFirstSelectedOption();
		String value = firstOptions.getText();
		System.out.println(value);


	}

}
