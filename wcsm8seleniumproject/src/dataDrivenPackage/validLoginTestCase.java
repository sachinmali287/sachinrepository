package dataDrivenPackage;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class validLoginTestCase extends Flib {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do");

		// to read the data from external files create the obj of flib 

		Flib flib = new Flib();

		driver.findElement(By.name("username")).sendKeys( flib.readexceldata("./data/ActiTimeTestData.xlsx","ValidCrd",1, 0));
		Thread.sleep(2000);

		driver.findElement(By.name("pwd")).sendKeys(flib.readexceldata("./data/ActiTimeTestData.xlsx","ValidCrd",1, 1));

		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}
