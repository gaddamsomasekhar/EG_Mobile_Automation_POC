import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

@SuppressWarnings("unused")
public class Flights_iOS_Automation {

	WebDriver driver;
	// WebDriverWait wait = new WebDriverWait(driver,30);

	@SuppressWarnings("rawtypes")
	@Test

	public void flights_iOS_Flow() throws MalformedURLException, InterruptedException {

		System.out.println("@@@@@@@@   Hello, Welcome to Expedia Group  @@@@@@@@@@@");

		System.out.println("  @@@ Automation Testing for Flights Application  @@@");

		System.out.println("Testing on iOS 13 & Version 15.0 , intiated Expedia App 22.37 in VD   ");

		DesiredCapabilities capabilities = new DesiredCapabilities();

		// capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,
		// AutomationName.ANDROID_UIAUTOMATOR2);

		capabilities.setCapability("appium:deviceName", "iPhone 13");
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("appium:platformVersion", "15.0");
		capabilities.setCapability("appium:appPackage", "com.expedia.booking.debug");
		capabilities.setCapability("appium:noReset", true);
		capabilities.setCapability("appium:automationName", "XCUITest");
		capabilities.setCapability("appium:app", "/Users/A-202121/Desktop/ExpediaBookings.app");

		IOSDriver driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		System.out.println(
				"#####   iOS Vertual device Activeted, Expedia 22.37 App install Sucussfully. Testing started for FSR Page   ####");

		// driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),
		// capabilities);

		// Thread.sleep(3000);

		// System.out.println("Click on App not to Track option");

		// driver.findElement(By.xpath("//XCUIElementTypeButton[@label=\"Ask App Not to
		// Track\"]")).click();

		Thread.sleep(3000);

		// driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"corner_button\"]")).click();

		Thread.sleep(3000);

		// System.out.println("Click on SKip or get Started");

		// driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"backOrDismiss\"]")).click();
		// WebElement explore =
		// driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Start
		// exploring\"]"));

		// Thread.sleep(3000);

		// WebElement exploring =
		// driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Start
		// exploring\"]"));

		// exploring.click();

		// System.out.println("Click on Start Exploring");
		Thread.sleep(3000);

		// System.out.println("Click on Allow While Using App");

		// driver.findElement(By.xpath("//XCUIElementTypeButton[@label='Allow While
		// Using App']")).click();
		WebElement flights = driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Flights\"]"));
		flights.click();

		System.out.println("Click on Flights option");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"One way\"]")).click();
		System.out.println("Click on One Way Tab");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"originSearchField\"]")).click();

		System.out.println("Click on Origen Search field");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"locationSuggestionTextField\"]")).sendKeys("SEA");

		System.out.println(" Enter SEA in Textbox ");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//XCUIElementTypeCell[@name=\"locationSuggestionTableView_section0_row0\"]"))
				.click();

		System.out.println("Click the search option ");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"destinationSearchField\"]")).click();

		System.out.println("Click Destination Field ");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"locationSuggestionTextField\"]")).sendKeys("SFO");

		System.out.println(" Enter SFO ");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"California, United States\"]")).click();

		System.out.println("Select the search option ");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"travelDateField\"]")).click();

		System.out.println(" Click on Date field ");
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//XCUIElementTypeStaticText[@name=\"date_cell_date_label\"])[22]")).click();

		System.out.println("Select the date  ");
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//XCUIElementTypeButton[@name=\"advancementButton\"])[2]")).click();

		System.out.println("Click button  ");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@name='advancementButton']")).click();

		System.out.println(" Click Search Button");

		Thread.sleep(10000);

		System.out.println(" FSR Page loaded ");
		// XCUIElementTypeTable[@name="searchResultsTableView"]/XCUIElementTypeCell[1]
		// XCUIElementTypeOther[contains(@name,'Expedia bargain fare.')]
		driver.findElement(By.xpath("//XCUIElementTypeOther[contains(@name,'Expedia bargain fare.')]")).click();

		Thread.sleep(2000);

		Thread.sleep(2000);
		System.out.println(" Selected Expedia bargain fare in FSR page ");

		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"applyButton\"]")).click();

		Thread.sleep(2000);

		System.out.println("Page navigated to FD page");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//XCUIElementTypeImage[@name='icon_expandMore']")).click();
		Thread.sleep(3000);

		System.out.println("Click on Policies Expand button");

		driver.findElement(By.xpath("//XCUIElementTypeStaticText[@label='View price summary']")).click();
		Thread.sleep(2000);

		System.out.println("Click on Price summary link ");

		driver.findElement(By.xpath("//XCUIElementTypeButton[@name='closeButton']")).click();
		Thread.sleep(2000);
		System.out.println("Click on price summary close ");

		driver.findElement(By.xpath("//XCUIElementTypeImage[@name='icon_expandLess']")).click();
		Thread.sleep(2000);

		System.out.println("Click on policies expand less ");

		System.out.println(
				"------- ##  Script execution completed for EBF Card work flow, Application Working As Expected   ## --------");

	}

}
