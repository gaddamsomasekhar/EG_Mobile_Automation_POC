import java.net.MalformedURLException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Expedia_Web_EBF {

	WebDriver driver;

	@Test

	public void flights_ebf_flow() throws InterruptedException, MalformedURLException {

		System.setProperty("webdriver.chrome.driver", "//Users/A-202121/Desktop/chromedriver");

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});

		driver = new ChromeDriver(options);

		WebDriverWait wait = new WebDriverWait(driver, 30);

		driver.manage().window().maximize();

		driver.get("https://www.expedia.com/");

		driver.findElement(By.xpath("//a/span[contains(text(),'Flights')]")).click();

		driver.findElement(By.xpath("//a/span[contains(text(),'Cars')]")).click();

		driver.findElement(By.xpath("//a/span[contains(text(),'Flights')]")).click();

		driver.findElement(By.xpath("//a/span[contains(text(),'One-way')]")).click();

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label='Leaving from']")));

		driver.findElement(By.xpath("//button[@aria-label='Leaving from']")).click();

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='location-field-leg1-origin']")));

		driver.findElement(By.xpath("//input[@id='location-field-leg1-origin']")).sendKeys("sea");

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@class='uitk-typeahead-results']/descendant::strong")));

		driver.findElement(By.xpath("//div[@class='uitk-typeahead-results']/descendant::strong")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label='Going to']")));

		driver.findElement(By.xpath("//button[@aria-label='Going to']")).click();

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@id='location-field-leg1-destination']")));

		driver.findElement(By.xpath("//input[@id='location-field-leg1-destination']")).sendKeys("sfo");

		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[@id='location-field-leg1-destination-menu']/descendant::strong[1]")));

		driver.findElement(By.xpath("//div[@id='location-field-leg1-destination-menu']/descendant::strong[1]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//button[@id='d1-btn']")));
		driver.findElement(By.xpath("//button[@id='d1-btn']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[@class='uitk-layout-flex uitk-layout-flex-justify-content-space-between uitk-date-picker-menu-pagination-container']//button[1]")));

		driver.findElement(By.xpath("//div[@class='uitk-layout-flex uitk-layout-flex-justify-content-space-between uitk-date-picker-menu-pagination-container']//button[1]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//button[@aria-label='Sep 22, 2022']")));
		driver.findElement(By.xpath("//button[@aria-label='Sep 22, 2022']")).click();

		driver.findElement(By.id("wizardMainRegionV2")).click();


		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//button[normalize-space()='Search']")));

		driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();

		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//h4[contains(text(),'Expedia Bargain Fare')]/ancestor::li[@class='ebf-module']")));

		driver.findElement(By.xpath("//h4[contains(text(),'Expedia Bargain Fare')]/ancestor::li[@class='ebf-module']")).click();

		driver.navigate().to("https://www.expedia.com/Flight-Information?journeyContinuationId=AQrGAQqzAXY1LXNvcy0wMGJhNzZmYzEwNjFmMDE1NmZiNDM2NzkwYTc2MTc1ZC0zLTE2fjIuU35BUW9DQ0FFU0J3alVCQkFCR0FFb0FsZ0JjQUF-QVFvdENpc0l4SmdCRWdReU16TTVHSklCSUxKeEtPMlBtQUl3NjVDWUFqaEZRQUJZQVdvSlFrRlRTVU5GUTA5T0Vnb0lDUkFDR0FJcUFrUk1HQUVpQkFnQkVBRW9CeWdES0FRd0FREQrXo3A92l9AKgUSAwoBMRInChYKCjIwMjItMDktMjISA1NFQRoDU0ZPEgcSBUNPQUNIGgIQASABMgIIAQ%3D%3D");

		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//span[normalize-space()='Check out']")));

		driver.findElement(By.xpath("//span[normalize-space()='Check out']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//h1[contains(text(),'Secure booking - only takes a few minutes!')]")));


		driver.close();
	}
}
