package Utils;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

//import com.pp.utilities.DriverFactory;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	
	public TestBase()
	{
		try {
			prop=new Properties();
			FileInputStream fis = new FileInputStream("D:\\seWS\\SeCucumber\\src\\main\\java\\Config\\config.properties");
			prop.load(fis);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void initialization(){
		String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "D:\\seWS\\SeCucumber\\src\\main\\java\\executables\\chromedriver.exe");
		}
			else if(browserName.equals("firefox")){
				System.setProperty("webdriver.chrome.driver", "D:\\seWS\\SeCucumber\\src\\main\\java\\executables\\geckodriver.exe");
				
			}
				else if (browserName.equalsIgnoreCase("edge")) {
					System.out.println("Lunching Browser" + prop.getProperty("browser"));
					System.setProperty("webdriver.edge.driver", "");
					driver = new InternetExplorerDriver();
					System.out.println("Set Browser" + prop.getProperty("browser"));
					
				}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.PAGE_LOAD_TIME, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
		
		
		
		
		
		
			
		}
		
	
		
		
			
	

}
