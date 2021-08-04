package testProjectDemo;

import io.appium.java_client.MobileElement;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.ios.IOSDriver;


public class AppiumTest {
	 public IOSDriver<IOSElement> driver;

	  @Before
	  public void setUp() throws MalformedURLException {
	    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("device", "iPhone 12 Pro");
	    desiredCapabilities.setCapability("os_version", "14");
	    desiredCapabilities.setCapability("app", "<BROWSERSTACK_APP_ID>");
	    desiredCapabilities.setCapability("browserstack.networkLogs", "true");

	    driver = new IOSDriver<IOSElement>(new URL("http://<BROWSERSTACK_USERNAME>:<BROWSERSTACK_ACCESS_KEY>@hub-cloud.browserstack.com/wd/hub"), desiredCapabilities);
	  }

	  @Test
	  public void sampleTest() {
	    MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Text Button");
	    el1.click();
	    MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Text Input");
	    el2.click();
	    el2.sendKeys("BrowserStack POC Call");
	    MobileElement el3 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Sample iOS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther");
	    el3.click();
	    MobileElement el4 = (MobileElement) driver.findElementByXPath("(//XCUIElementTypeButton[@name=\"UI Elements\"])[1]");
	    el4.click();
	  }

	  @After
	  public void tearDown() {
	    driver.quit();
	  }

}
