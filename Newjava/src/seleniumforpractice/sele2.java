package seleniumforpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class sele2 {
	WebDriver driver;

	@Test
	public void Shubham(String username, String password) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Suraj\\eclipse-workspace\\Newjava\\drivers\\chromedriver.exe");
		
		{ 
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			
			WebElement wb = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
			wb.sendKeys("tech mahindra share price");
			String A = wb.getAttribute("value");
			System.out.println(A);
			
			driver.navigate().forward();
			driver.get("https://ui.cogmento.com/");
			driver.findElement(By.name("email")).sendKeys("username");
			driver.findElement(By.name("password")).sendKeys("password");
			Thread.sleep(3000);
			
			
			driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
			String B = driver.findElement(By.xpath("//span[@class='user-display']")).getText();

			System.out.println("logged username is" + B);
		}
	}

	@DataProvider(name = "mumbai")
	public Object[][] getData() {

		ExcelReader obj = new ExcelReader("C:\\Users\\Suraj\\Desktop\\Test NG HRM data.xlsx");

		int rows = obj.rowsCount(3);

		Object[][] data = new Object[rows][2];

		for (int i = 0; i < rows; i++) {
			data[i][0] = obj.getData(3, i, 0);
			data[i][1] = obj.getData(3, i, 1);
		}

		return data;

	}

}
