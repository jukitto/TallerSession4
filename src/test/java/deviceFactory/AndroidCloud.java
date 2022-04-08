package deviceFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidCloud implements IDevice {
    @Override
    public AppiumDriver create() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        // Set your access credentials
        caps.setCapability("browserstack.user", "ta que sapo causa");
        caps.setCapability("browserstack.key", "nop aui no vas a encontrar mis credenciales >.<");

        // Set URL of the application under test
        caps.setCapability("app", "bs://3d9908b70acc009f1d5b1c213d01dc3a7030cd77");

        // Specify device and os_version for testing
        caps.setCapability("device", "Google Pixel 3");
        caps.setCapability("os_version", "9.0");

        // Set other BrowserStack capabilities
        caps.setCapability("project", "JBGroup");
        caps.setCapability("build", "Appium");
        caps.setCapability("name", "WhenDo");


        // Initialise the remote Webdriver using BrowserStack remote URL
        // and desired capabilities defined above
        AndroidDriver<AndroidElement> driver = null;
        try {
            driver = new AndroidDriver<AndroidElement>(
                    new URL("http://hub.browserstack.com/wd/hub"), caps);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        // Write your test case statements here

        // Invoke driver.quit() after the test is done to indicate that the test is completed.
        return driver;
    }
}
