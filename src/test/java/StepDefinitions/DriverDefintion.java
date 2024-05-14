package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * This class is used to define the drivers of the browsers.
 */


public class DriverDefintion {
	
	protected static WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	String browser = System.getProperty("browser", "chrome");
	protected WebDriver getDriver() {

		if(browser.contains("chrome")){
            System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }else
        if(browser.contains("firefox")){
            System.setProperty("webdriver.driver.gecko",projectPath+"/src/test/resources/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        return driver;
        
		
	}
	
}


