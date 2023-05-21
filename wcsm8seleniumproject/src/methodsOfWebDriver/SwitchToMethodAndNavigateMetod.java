package methodsOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SwitchToMethodAndNavigateMetod {

	public static void main(String[] args) throws InterruptedException {
		// it is used to swtich the control

		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// we lunch webappliction by using navigate method

		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);

		//switch the control active element
		driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);

		// use back operation
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("Automation Testing",Keys.ENTER);
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.quit();

	}

}
