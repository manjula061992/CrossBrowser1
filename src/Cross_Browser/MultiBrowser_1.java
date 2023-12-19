package Cross_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowser_1 
{
public static void main(String[] args) throws InterruptedException 
{
//	    // chrome
//		System.setProperty("webdriver.chrome.driver","E:\\manjula\\Eclipsefiles\\Selenium\\Software\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
		
		 // firefax
	     System.setProperty("webdriver.gecko.driver","E:\\manjula\\Eclipsefiles\\Selenium\\Software\\geckodriver.exe");
	     WebDriver driver = new FirefoxDriver();
	     Thread.sleep(2000);
		
//		// edge
//		System.setProperty("webdriver.edge.driver","E:\\manjula\\Eclipsefiles\\Selenium\\Software\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
//		Thread.sleep(2000);
		
		//get URL
		driver.get("https://www.facebook.com/ ");
				
	    //enter email field
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("manjula@gmail.com");
		Thread.sleep(3000);
				
		// enter password
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("manjulamadhu");
		Thread.sleep(3000);
				
		//click on login button
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(3000);
		driver.close();
		
				
}
}
