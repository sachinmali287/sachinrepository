package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("hp laptop");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='Core i7')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='HP']")).click();
		Thread.sleep(2000);         
		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='Windows 11']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='4★ & above')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='SSD Capacity']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling:: div[text()='512 GB']")).click();
		
		String priceOfFirstSuggestion = driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[10]")).getText();
        System.out.println(priceOfFirstSuggestion);                   
        
       // Thread.sleep(2000);
       // String nameOfFirstSuggestion = driver.findElement(By.xpath("//div[@class='_30jeq3 _1_WHN1']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_4rR01T']")).getText();
       // System.out.println(nameOfFirstSuggestion);
    	Thread.sleep(2000);
    	driver.quit();
	}

}
 