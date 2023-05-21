package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chromedriver.driver","./drivers/chromedriver.exe");

		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/");
		driver.findElement(By.xpath("//span[.='Downloads']")).click();
		WebElement target = driver.findElement(By.linkText("4.9.0"));
		
		// to perform Mouse Action we need to create a object 
		Actions act = new Actions(driver);
		
		// to use Right Click Actions....
		//act.contextClick(target).build().perform();  //......way 1
		act.contextClick(target).perform();    // way 2
		
		
		//  Difference between build(); and perform();
		
		// Build();
		// It is used to compile all the listed action into single step 
		// act.contextClick(target).build().perform();
		
		// Perform();
		// A convince method is used to perform actions without calling build first
		// act.contextClick(target).perform(); 
	}

}
