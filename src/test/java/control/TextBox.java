package control;

import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class TextBox extends AppiumControl {
    public TextBox(By locator) {
        super(locator);
    }

    public void type(String value) throws MalformedURLException {
        this.findControl();
        this.control.sendKeys(value);
    }
}
