import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

@SuppressWarnings("unused")
public class Flights_Android_EB_Flow {

	WebDriver driver;


	@SuppressWarnings("rawtypes")
	@Test

	public void flights_EBF_Flow() throws MalformedURLException, InterruptedException {

		System.out.println("@@@@@@@@   Hello, Welcome to Expedia Group  @@@@@@@@@@@");

		System.out.println("  @@@ Automation Testing for Flights Application  @@@");

		System.out.println("Testing on Android Version 12, intiated Expedia App 22.37 in VD   ");

		System.out.println("Testing on Android Version 12, intiated Expedia App 22.37 in VD   ");

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
		WebDriverWait wait = new WebDriverWait(driver,30);

	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc='Next']")));

		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Next']")).click();

		System.out.println("Clicked the Next Arrow");

		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Next']")).click();

		System.out.println("Clicked the lets go Button");

		driver.findElement(By.id("com.expedia.bookings:id/button_final")).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")));

		System.out.println("Now its clicking on While Using App");
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"))
				.click();
		System.out.println("Its close the signin popup");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageButton[@content-desc='Close']")));

		driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Close']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[1]/android.view.View[2]/android.widget.Button")));
		//android.view.View[@text='Flights']
		//(//android.view.View)[9]
		//android.view.View[1]/android.view.View[2]/android.widget.Button

		driver.findElement(By.xpath("//android.view.View[1]/android.view.View[2]/android.widget.Button")).click();

		System.out.println("Clicked on the Flights Tab in Home page");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.LinearLayout[@content-desc='One way Tab']/android.widget.TextView")));

		// Click One Way tab

		// android.widget.LinearLayout[@content-desc="One way
		// Tab"]/android.widget.TextView
		System.out.println("Selecting the One Way route");
		driver.findElement(
				By.xpath("//android.widget.LinearLayout[@content-desc='One way Tab']/android.widget.TextView"))
				.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.LinearLayout[@content-desc='Flying from. Button']/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView")));

		// click flying from
		System.out.println("Clicked on Flying From tab in Search form");
		driver.findElement(By.xpath(
				"//android.widget.LinearLayout[@content-desc='Flying from. Button']/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView"))
				.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.expedia.bookings:id/search_src_text")));

		System.out.println("Entered SEA");

		driver.findElement(By.id("com.expedia.bookings:id/search_src_text")).sendKeys("SEA");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@content-desc='Seattle (SEA - Seattle-Tacoma Intl.)']")));
		System.out.println("Selected the flight Option in FSR Page");
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Seattle (SEA - Seattle-Tacoma Intl.)']"))
				.click();

wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.expedia.bookings:id/search_src_text")));
		System.out.println("Enterd SFO as Flying To ");
		driver.findElement(By.id("com.expedia.bookings:id/search_src_text")).sendKeys("SFO");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@content-desc='San Francisco (SFO - San Francisco Intl.)']")));

		System.out.println("Selecting SFO option in search ");
		driver.findElement(
				By.xpath("//android.widget.TextView[@content-desc='San Francisco (SFO - San Francisco Intl.)']"))
				.click();

wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@content-desc='Thu, Sep 22, Not Selected']")));

		System.out.println("Selected the flying date in Calender");
		                             
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Thu, Sep 22, Not Selected']")).click();
		
		//android.widget.TextView[@content-desc='Wed, Jul 20, Not Selected']

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.expedia.bookings:id/confirmButton")));

		System.out.println("Clicked on date confirmation button");

		driver.findElement(By.id("com.expedia.bookings:id/confirmButton")).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.FrameLayout[@content-desc='Search Button']")));

		System.out.println("Clicked on Search button for flights");
		driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc='Search Button']")).click();

	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.expedia.bookings:id/bargainFareDesc")));

		System.out.println("Selected the EBF Card in FSR");

		driver.findElement(By.id("com.expedia.bookings:id/bargainFareDesc")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.FrameLayout[@content-desc='Continue Button']/android.view.ViewGroup")));

		System.out.println("Clicked on Continue Button");
		driver.findElement(
				By.xpath("//android.widget.FrameLayout[@content-desc='Continue Button']/android.view.ViewGroup"))
				.click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.expedia.bookings:id/expando_rotation_icon")));
		System.out.println("For FD page landing varification Clicked on Policies expand icon");
		driver.findElement(By.id("com.expedia.bookings:id/expando_rotation_icon")).click();

	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.LinearLayout[@content-desc='View price summary Button']/android.widget.TextView")));

		System.out.println("Verifing the Price summury page");
		driver.findElement(By.xpath(
				"//android.widget.LinearLayout[@content-desc='View price summary Button']/android.widget.TextView"))
				.click();

	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageButton[@content-desc='close']")));

		System.out.println("Closing price summary page and verify Checkout Button in FD Page");

		driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='close']")).click();

	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.expedia.bookings:id/check_out_button")));

		System.out.println("Click on Checkout Button");

		driver.findElement(By.id("com.expedia.bookings:id/check_out_button")).click();

	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.expedia.bookings:id/uds_toolbar_navigation_icon")));

		System.out.println("Click on back to FD page ");

		driver.findElement(By.id("com.expedia.bookings:id/uds_toolbar_navigation_icon")).click();

wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.expedia.bookings:id/expando_rotation_icon")));

		System.out.println("For Verification we are closing polici expand icon");

		driver.findElement(By.id("com.expedia.bookings:id/expando_rotation_icon")).click();



		System.out.println("------- ##  Script execution completed for EBF Card work flow, Application Working As Expected   ## --------");
		Thread.sleep(4000);

		driver.terminateApp("com.expedia.bookings");
	}

}
