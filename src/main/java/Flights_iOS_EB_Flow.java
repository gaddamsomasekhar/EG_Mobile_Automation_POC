import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

@SuppressWarnings("unused")
public class Flights_iOS_EB_Flow {

	WebDriver driver;


	@SuppressWarnings("rawtypes")
	@Test

	public void flights_iOS_Flow() throws MalformedURLException, InterruptedException {

		System.out.println("@@@@@@@@   Hello, Welcome to Expedia Group  @@@@@@@@@@@");

		System.out.println("  @@@ Automation Testing for Flights Application  @@@");

		System.out.println("Testing on iOS 13 & Version 15.0 , intiated Expedia App 22.37 in VD   ");

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("appium:deviceName", "iPhone 13");
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("appium:platformVersion", "15.0");
		capabilities.setCapability("appium:appPackage", "com.expedia.booking.debug");
		capabilities.setCapability("appium:noReset", true);
		capabilities.setCapability("appium:automationName", "XCUITest");
		capabilities.setCapability("appium:app", "/Users/A-202121/Desktop/ExpediaBookings.app");
		IOSDriver driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		WebDriverWait wait = new WebDriverWait(driver,30);
		System.out.println(
				"#####   iOS Vertual device Activeted, Expedia 22.37 App install Sucussfully. Testing started for FSR Page   ####");


		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeButton[@name='Flights']")));

		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"account_tab_button\"]")).click();

		driver.findElement(By.xpath("//XCUIElementTypeCell[@name=\"debug_settings\"]")).click();

		driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"AB Tests\"]")).click();

		driver.findElement(By.xpath("//XCUIElementTypeSearchField[@name=\"Search\"]")).sendKeys("44028");

		driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Use SharedUI based Flights Search Results\"]")).click();


		driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Variant1: Enable SharedUI based Flights Search Results\"]")).click();

		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"AB Tests\"]")).click();

		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Close\"]")).click();

		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Close\"]")).click();

		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"shop_tab_button\"]")).click();



		driver.findElement(By.xpath("//XCUIElementTypeButton[@name='Flights']")).click();

		System.out.println("Click on Flights option");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeButton[@name='One way']")));

		driver.findElement(By.xpath("//XCUIElementTypeButton[@name='One way']")).click();
		System.out.println("Click on One Way Tab");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeButton[@name='originSearchField']")));

		driver.findElement(By.xpath("//XCUIElementTypeButton[@name='originSearchField']")).click();

		System.out.println("Click on Origen Search field");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeOther[@name='locationSuggestionTextField']")));
		driver.findElement(By.xpath("//XCUIElementTypeOther[@name='locationSuggestionTextField']")).sendKeys("SEA");

		System.out.println(" Enter SEA in Textbox ");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeCell[@label='Seattle (SEA - Seattle-Tacoma Intl.),Washington, United States']")));

		driver.findElement(By.xpath("//XCUIElementTypeCell[@label='Seattle (SEA - Seattle-Tacoma Intl.),Washington, United States']"))
				.click();

		System.out.println("Click the search option ");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeButton[@name='destinationSearchField']")));

		driver.findElement(By.xpath("//XCUIElementTypeButton[@name='destinationSearchField']")).click();

		System.out.println("Click Destination Field ");
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeOther[@name='locationSuggestionTextField']")));

		driver.findElement(By.xpath("//XCUIElementTypeOther[@name='locationSuggestionTextField']")).sendKeys("SFO");

		System.out.println(" Enter SFO ");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeStaticText[@name='California, United States']")));
		driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='California, United States']")).click();

		System.out.println("Select the search option ");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeButton[@name='travelDateField']")));

		driver.findElement(By.xpath("//XCUIElementTypeButton[@name='travelDateField']")).click();

		System.out.println(" Click on Date field ");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeStaticText[@name='date_cell_date_label'])[24]")));

		driver.findElement(By.xpath("(//XCUIElementTypeStaticText[@name='date_cell_date_label'])[24]")).click();

		System.out.println("Select the date  ");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeButton[@name='advancementButton'])[2]")));

		driver.findElement(By.xpath("(//XCUIElementTypeButton[@name='advancementButton'])[2]")).click();

		System.out.println("Click button  ");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='advancementButton']")));

		driver.findElement(By.xpath("//*[@name='advancementButton']")).click();

		System.out.println(" Click Search Button");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeOther[contains(@name,'Expedia bargain fare.')]")));

		System.out.println(" FSR Page loaded ");
		// XCUIElementTypeTable[@name="searchResultsTableView"]/XCUIElementTypeCell[1]
		// XCUIElementTypeOther[contains(@name,'Expedia bargain fare.')]
		driver.findElement(By.xpath("//XCUIElementTypeOther[contains(@name,'Expedia bargain fare.')]")).click();

	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeButton[@name='applyButton']")));
		System.out.println(" Selected Expedia bargain fare in FSR page ");

		driver.findElement(By.xpath("//XCUIElementTypeButton[@name='applyButton']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeImage[@name='icon_expandMore']")));

		System.out.println("Page navigated to FD page");

		driver.findElement(By.xpath("//XCUIElementTypeImage[@name='icon_expandMore']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeStaticText[@label='View price summary']")));

		System.out.println("Click on Policies Expand button");

		driver.findElement(By.xpath("//XCUIElementTypeStaticText[@label='View price summary']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeButton[@name='closeButton']")));

		System.out.println("Click on Price summary link ");

		driver.findElement(By.xpath("//XCUIElementTypeButton[@name='closeButton']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeImage[@name='icon_expandLess']")));
		System.out.println("Click on price summary close ");

		driver.findElement(By.xpath("//XCUIElementTypeImage[@name='icon_expandLess']")).click();
		System.out.println("Click on policies expand less ");

		System.out.println(
				"------- ##  Script execution completed for EBF Card work flow, Application Working As Expected   ## --------");
		Thread.sleep(4000);

		driver.terminateApp("com.expedia.booking.debug");




	}

}
