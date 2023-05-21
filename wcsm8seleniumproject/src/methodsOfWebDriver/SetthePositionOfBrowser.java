package methodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SetthePositionOfBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		
		// set window size of browser 
		Dimension targetSize = new Dimension(350, 450);
		Thread.sleep(2000);
		driver.manage().window().setSize(targetSize);
		
		// set Window position of browser 
		Point targetSetPosition = new Point(450, 350);
		Thread.sleep(2000);
		driver.manage().window().setPosition(targetSetPosition);

	}

}
