package selectMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectAllMethod {

	public static void main(String[] args) throws InterruptedException {
		
		// It is used to deselect the all options from dropdown   ===  void

		System.setProperty("webdriver.chromedriver.driver","./drivers/chromedriver.exe");

		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///D:/Software/SeleniumNotes/Web%20Element/MultipleselectDropdown.html");

		// to identify dropdown 

		WebElement dropDown = driver.findElement(By.name("menu"));

		//To select Multiple Options

		Select sel = new Select(dropDown);

		for(int i=0;i<7;i++)
		{
			Thread.sleep(2000);
			sel.selectByIndex(i);	
		}

		Thread.sleep(2000);
		// to deselect all the option

		sel.deselectAll();

	}

}
