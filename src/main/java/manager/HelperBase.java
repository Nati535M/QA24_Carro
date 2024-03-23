package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HelperBase {
    WebDriver wd;

    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }

//    public void type (By locator, String text){
//
//        WebElement element = wd.findElement(locator);
//
//        element.click();
//        element.clear();
//        if(text != null)
//
//        element.sendKeys(text);
//    }

    // loginTab.click();
    public void click(By locator) {

        //
        // WebElement element = wd.findElement(locator);
        // element.click();
        wd.findElement(locator).click();

    }

    public void type(By locator, String text) {
        WebElement el = wd.findElement(locator);
        el.click();
        el.clear();
        if (text != null) {
            el.sendKeys(text);
        }
    }

    public void pause(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }


    //    public void fillLoginRegistrationForm(String email, String password){
//
//    WebElement emailInput = wd.findElement(By.name("email"));
//
//    emailInput.click();
//    emailInput.clear();
//    emailInput.sendKeys(email);
//    WebElement passwordInput = wd.findElement(By.xpath("//input[last()]"));
//        passwordInput.click();
//        passwordInput.clear();
//        passwordInput.sendKeys(password);
//}
    public boolean isElementPresent(By locator) {

       //return wd.findElements(locator).size() > 0;
        List<WebElement>list = wd.findElements(locator);
        return wd.findElements(locator).size()>0;



    }
    public boolean isYallaButtonNotActive() {
        boolean res = isElementPresent(By.cssSelector("button[disabled]"));

        WebElement el = wd.findElement(By.cssSelector("button[type='submit']"));
        boolean result = el.isEnabled();
        return res && !result;

    }

}
