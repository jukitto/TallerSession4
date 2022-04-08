package control;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import session.Session;

import java.net.MalformedURLException;

public class AppiumControl {
    protected By locator;
    protected WebElement control;

    public AppiumControl(By locator){
        this.locator=locator;
    }

    public void findControl() throws MalformedURLException {
        this.control = Session.getInstance().getDriver().findElement(this.locator);
    }

    public void click() throws MalformedURLException {
        this.findControl();
        this.control.click();
    }

    public String getValue() throws MalformedURLException {
        this.findControl();
        return this.control.getText();
    }

    public boolean getExistence(){
        boolean existence = true;
        try {
            this.findControl();
            System.out.println("el valor de existence es : " + existence);
            return existence;
        }catch (NoSuchElementException | MalformedURLException e){
            existence = false;
            System.out.println("el valor de existence es : " + existence);
            return  existence;
        }
    }
}
