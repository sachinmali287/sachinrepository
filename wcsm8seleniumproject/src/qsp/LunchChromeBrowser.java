package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// To avoid IllegatSteoExeception
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		// To avoid ConnectionFailedException
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		// to lunch chromeBrowser
		new ChromeDriver();


	}

}
