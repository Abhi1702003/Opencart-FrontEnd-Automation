package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;

import pages.LandingPage;

public class Base {

	public static WebDriver driver;
	Properties prop=null;

	public Base() {
		
	}
	
	public void intiDriver() {
		prop = new Properties();
		FileInputStream file;
		try {
			file = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\config.properties");
			try {
				prop.load(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		String browser = prop.getProperty("browser");
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	public LandingPage openUrl() {
		driver.get(prop.getProperty("url"));
		return PageFactory.initElements(driver, LandingPage.class);
	}
	
	public void closeDriver() {
		driver.quit();
	}
	
	public static String getTitl() {
		return driver.getTitle();
	}

}
