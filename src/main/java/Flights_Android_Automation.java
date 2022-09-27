import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

@SuppressWarnings("unused")
public class Flights_Android_Automation {

	WebDriver driver;
	// WebDriverWait wait = new WebDriverWait(driver,30);

	@SuppressWarnings("rawtypes")
	@Test

	public void flights_EBF_Flow() throws MalformedURLException, InterruptedException {

		System.out.println("@@@@@@@@   Hello, Welcome to Expedia Group  @@@@@@@@@@@");

		System.out.println("  @@@ Automation Testing for Flights Application  @@@");

		System.out.println("Testing on Android Version 12, intiated Expedia App 22.37 in VD   ");

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "android");
		capabilities.setCapability("appium:platformVersion", "12");
		capabilities.setCapability("appium:deviceName", "sdk_gphone64_arm64");
		capabilities.setCapability("appium:automationName", "UiAutomator2");
		capabilities.setCapability("appium:app", "/Users/A-202121/Desktop/GHA-expedia-release-22.37_RC2.apk");
		capabilities.setCapability("appPackage", "com.expedia.bookings");
		capabilities.setCapability("appActivity", "com.expedia.bookings.activity.SearchActivity");

		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		System.out.println(
				"#####   Android Vertual device Activeted, Expedia 22.37 App install Sucussfully. Testing started for one way EBF Card Flow   ####");

		// driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),
		// capabilities);

		Thread.sleep(3000);

		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Next\"]")).click();

		System.out.println("Clicked the Next Arrow");

		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Next\"]")).click();

		System.out.println("Clicked the lets go Button");

		driver.findElement(By.id("com.expedia.bookings:id/button_final")).click();

		Thread.sleep(2000);

		System.out.println("Now its clicking on While Using App");
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"))
				.click();
		System.out.println("Its close the signin popup");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Close\"]")).click();

		WebDriverWait wait = new WebDriverWait(driver,30);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[1]/android.view.View[2]/android.widget.Button")));
		//android.view.View[@text='Flights']
		//(//android.view.View)[9]
		//android.view.View[1]/android.view.View[2]/android.widget.Button

		driver.findElement(By.xpath("//android.view.View[1]/android.view.View[2]/android.widget.Button")).click();

		System.out.println("Clicked on the Flights Tab in Home page");
		Thread.sleep(3000);

		// Click One Way tab

		// android.widget.LinearLayout[@content-desc="One way
		// Tab"]/android.widget.TextView
		System.out.println("Selecting the One Way route");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[@content-desc=\"One way Tab\"]/android.widget.TextView"))
				.click();
		Thread.sleep(2000);

		// click flying from
		System.out.println("Clicked on Flying From tab in Search form");
		driver.findElement(By.xpath(
				"//android.widget.LinearLayout[@content-desc=\"Flying from. Button\"]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView"))
				.click();
		Thread.sleep(2000);

		System.out.println("Entered SEA");

		driver.findElement(By.id("com.expedia.bookings:id/search_src_text")).sendKeys("SEA");
		Thread.sleep(2000);
		System.out.println("Selected the flight Option in FSR Page");
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Seattle (SEA - Seattle-Tacoma Intl.)\"]"))
				.click();
		Thread.sleep(2000);
		//android.widget.TextView[@content-desc='Seattle (SEA - All Airports)']
		//android.widget.TextView[@content-desc="Seattle (SEA - Seattle-Tacoma Intl.)"]

		// flying TO

		// driver.findElement(By.xpath(
		// "//android.widget.LinearLayout[@content-desc=\"Flying to.
		// Button\"]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView"))
		// .click();
		Thread.sleep(2000);
		System.out.println("Enterd SFO as Flying To ");
		driver.findElement(By.id("com.expedia.bookings:id/search_src_text")).sendKeys("SFO");
		Thread.sleep(4000);

		System.out.println("Selecting SFO option in search ");
		driver.findElement(
				By.xpath("//android.widget.TextView[@content-desc='San Francisco (SFO - San Francisco Intl.)']"))
				.click();
		


		// Select Dates

		// driver.findElement(By.xpath(
		// "//android.widget.LinearLayout[@content-desc=\"Select travel dates. Button.
		// Opens
		// dialog\"]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView"))
		// .click();
		Thread.sleep(9000);

		System.out.println("Selected the flying date in Calender");
		                             
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Thu, Sep 22, Not Selected']")).click();
		
		//android.widget.TextView[@content-desc='Wed, Jul 20, Not Selected']

		Thread.sleep(2000);

		System.out.println("Clicked on date confirmation button");

		driver.findElement(By.id("com.expedia.bookings:id/confirmButton")).click();
		Thread.sleep(4000);

		System.out.println("Clicked on Search button for flights");
		driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Search Button\"]")).click();

		Thread.sleep(5000);

		System.out.println("Selected the EBF Card in FSR");

		driver.findElement(By.id("com.expedia.bookings:id/bargainFareDesc")).click();

		Thread.sleep(2000);

		System.out.println("Clicked on Continue Button");
		driver.findElement(
				By.xpath("//android.widget.FrameLayout[@content-desc=\"Continue Button\"]/android.view.ViewGroup"))
				.click();

		Thread.sleep(10000);
		System.out.println("For FD page landing varification Clicked on Policies expand icon");
		driver.findElement(By.id("com.expedia.bookings:id/expando_rotation_icon")).click();

		Thread.sleep(4000);

		System.out.println("Verifing the Price summury page");
		driver.findElement(By.xpath(
				"//android.widget.LinearLayout[@content-desc=\"View price summary Button\"]/android.widget.TextView"))
				.click();

		Thread.sleep(4000);

		System.out.println("Closing price summary page and verify Checkout Button in FD Page");

		driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"close\"]")).click();

		Thread.sleep(4000);

		System.out.println("Click on Checkout Button");

		driver.findElement(By.id("com.expedia.bookings:id/check_out_button")).click();

		Thread.sleep(25000);

		System.out.println("Click on back to FD page ");

		driver.findElement(By.id("com.expedia.bookings:id/uds_toolbar_navigation_icon")).click();

		Thread.sleep(4000);

		System.out.println("For Verification we are closing polici expand icon");

		driver.findElement(By.id("com.expedia.bookings:id/expando_rotation_icon")).click();

		Thread.sleep(4000);
		
		

		System.out.println("------- ##  Script execution completed for EBF Card work flow, Application Working As Expected   ## --------");

	}

}
