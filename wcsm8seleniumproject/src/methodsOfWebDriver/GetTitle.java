package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetTitle {

	public static void main(String[] args) throws InterruptedException {
		// it is used to get the title of current WebPage

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();

		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		String LoginPageTitle = driver.getTitle();
		System.out.println( LoginPageTitle);
	}
}
