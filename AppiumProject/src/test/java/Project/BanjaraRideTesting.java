package Project;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class BanjaraRideTesting extends BanjaraRide {
	
	AndroidDriver<AndroidElement> driver;
	@BeforeMethod
	public void SetUp() throws IOException, InterruptedException {
		service = startServer();
		driver = Capabilities(deviceName,platformName,appPackage,appActivity);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	

	@Test(priority = 1)
	public void Hire_Bike() throws InterruptedException {//One bike has been booked in this class
		
		Thread.sleep(10000);
//		OK 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"OK\")")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
//		BOOK NOW
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"BOOK NOW\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		Hire Bike
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Hire Bike\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
        
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Shine SP 125\"))");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Shine SP 125\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(MobileBy.className("android.widget.ImageView")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		7 days 0 hr
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"7 days 0 hr\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup")).click();
		driver.findElement(MobileBy.AccessibilityId("25 February 2024")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"OK\")")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
	
//     	Continue
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Continue\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		Complete Booking
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Complete Booking\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		View Details
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"View Details\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Write Comment\"))");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		Write Comment
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Write Comment\")")).sendKeys("I am Trying to automate your application Please don't take this booking seriously.Thank you !");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		Send Cancel Request
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Send Cancel Request\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		Yes
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Yes\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		View Details
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"View Details\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
       }
	
	@Test(priority = 2)
	public void activa() throws InterruptedException {//One activa has been booked in this class
		Thread.sleep(10000);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"OK\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		My Tools
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"My Tools\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		Bookings
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Bookings\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//		Search
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Search\")")).sendKeys("Activa");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		
//		3hrs
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"3hrs\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		3 days 0 hr
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"7 days 0 hr\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//		Book Now
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Book Now\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Book Now\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));

		
	}
	
	@Test(priority = 3)
	public void FeedBack() throws InterruptedException {//All other Major functionalities has been tested 
		Thread.sleep(10000);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"OK\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		Call Us
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Call Us\")")).click();
		Thread.sleep(2000);
		
		driver.activateApp("com.forbinary.banjararide");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		Queries $ Complaints
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Queries $ Complaints\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Send Now\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		Title
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Title\")")).sendKeys("Yak or Bike?");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Description\")")).sendKeys("Testing Your App So You Don't End Up Riding a Yak Instead of a Bike!");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		Send to
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Send to\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		QUERY
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"QUERY\")")).click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Send Report\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		Back to Home
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Back to Home\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		Terms & Conditions
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Terms & Conditions\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		Terms & Condition
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Terms & Condition\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		Banjara_20Ride_20_20LLP_20T_26C-converted.pdf
	    AndroidElement PDF = driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Banjara_20Ride_20_20LLP_20T_26C-converted.pdf\"))");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PDF.click();
		
		
	} 
	
	@Test(priority = 4)
	public void Form() throws InterruptedException {
		Thread.sleep(10000);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"OK\")")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"My Tools\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		Forms
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Forms\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		Upload id
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Upload id\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		  // Add Photo 
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Add Photo\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  // Choose from Phone 
		  driver.findElement(MobileBy. AndroidUIAutomator("UiSelector().text(\"Choose from Phone\")")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  // 20231123_185435.jpg 
		  AndroidElement FrontSide = driver. findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"20231123_185435.jpg\"))" );
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  FrontSide.click(); 
		  Thread.sleep(5000);
		  
		  // CROP
		  driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"CROP\")")).click(); 
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")).click(); 
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Choose from Phone\")")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  AndroidElement Backside = driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"20231123_185634.jpg\"))"); 
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  Backside.click(); 
		  Thread.sleep(5000);
		  
		  driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"CROP\")")).click(); 
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		
//   	Capture Image
    	driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Capture Image\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(4000);
		driver.findElement(MobileBy.id("com.android.camera2:id/shutter_button")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		Thread.sleep(4000);
		driver.findElement(MobileBy.id("com.android.camera2:id/done_button")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);// Assuming driver is your Appium driver instance

		// Get the dimensions of the screen
		Dimension size = driver.manage().window().getSize();

		// Coordinates for scroll starting point (top-middle of the screen)
		int startX = size.width / 2;
		int startY = (int) (size.height * 0.8); // 80% from top

		// Coordinates for scroll ending point (bottom-middle of the screen)
		int endX = size.width / 2;
		int endY = (int) (size.height * 0.2); // 20% from top

		// Perform scroll using TouchAction
		new TouchAction(driver)
		    .press(PointOption.point(startX, startY))
		    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
		    .moveTo(PointOption.point(endX, endY)).release().perform();
		
//		Select Option
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Select Option\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RadioButton/android.view.ViewGroup")).click();
		
//		Add
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Add\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Submit\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		Back to Home
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Back to Home\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.pressKey(new KeyEvent(AndroidKey.HOME));

	}
	@AfterMethod
	public void last() {
		
		service.stop();
	}
	
	
	
}

