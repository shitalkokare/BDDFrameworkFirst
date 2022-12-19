package BaseLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
protected static WebDriver driver;
protected static Properties prop;
	public Baseclass()
	{
		 prop=new Properties();
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\Shital Kokare\\eclipse-workspace\\BDDframework_Orangehrm\\src\\main\\java\\ConfigLayer\\config2.properties");
		prop.load(fis);
		} catch (Exception e) {
		e.printStackTrace();
		}
		}
	public static void initilization()
	{
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chromedriver.driver", "/BDDframework_Orangehrm/AllDriver/chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
	}
	
	
	
	
	
	
	
	
	
	
}
