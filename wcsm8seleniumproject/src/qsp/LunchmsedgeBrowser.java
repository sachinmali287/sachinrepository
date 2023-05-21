package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LunchmsedgeBrowser {

	public static void main(String[] args) throws InterruptedException {

		// To lunch edge browser

		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		// maximize the browser

		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
        
	}

}
