package test_cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSwitchCommand {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

		// Open URL application
		String url = "http://demo.guru99.com/test/guru99home/";
		driver.get(url);
		driver.manage().window().maximize();

		driver.switchTo().frame("a077aa5e");
		System.out.println("*** We are switch to the iframe ***");

		driver.findElement(By.xpath("html/body/a/img")).click();
		System.out.println("*** We are done ***");

		// kill browser
		driver.close();
	}

}
