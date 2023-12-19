package Cross_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowser_3 
{
	static WebDriver driver=null;

	public static void main(String[] args) throws InterruptedException 
	{
		
		//chrome 
		System.setProperty("webdriver.chrome.driver", "E:\\manjula\\Eclipsefiles\\Selenium\\Software\\chromedriver.exe");
		driver= new ChromeDriver();   //upcasting
		FBLogin();
		
		// firefox 
//		System.setProperty("webdriver.gecko.driver", "E:\\manjula\\Eclipsefiles\\Selenium\\Software\\chromedriver.exe");
//		driver= new FirefoxDriver();  
//		FBLogin();
		
		//edge
		System.setProperty("webdriver.edge.driver", "E:\\manjula\\Eclipsefiles\\Selenium\\Software\\msedgedriver.exe");
		driver= new EdgeDriver(); 
		FBLogin();
	}	
//get url
		public static void FBLogin() throws InterruptedException
		{
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
//		email textbox
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
		Thread.sleep(2000);
//		password textbox
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12345");
		Thread.sleep(2000);
//		log in
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(2000);
		driver.close();
		}
	}