package Project;

import org.testng.annotations.AfterTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SimpleRide extends BanjaraRide {
	
	AndroidDriver<AndroidElement> driver;
	
	@AfterTest
	public void last() {
		
		service.stop();
	}

}
