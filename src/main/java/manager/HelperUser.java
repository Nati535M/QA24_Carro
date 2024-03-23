package manager;

import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelperUser extends HelperBase {


    public HelperUser(WebDriver wd) {
        super(wd);
    }

//public void openRegistrationForm(){
        //click(By.cssSelector("a[href='/login']"));
//    public void fillLoginRegistrationForm(String email, String password){
//
//        WebElement emailInput = wd.findElement(By.name("email"));
//
//        emailInput.click();
//        emailInput.clear();
//        emailInput.sendKeys(email);
//        WebElement passwordInput = wd.findElement(By.xpath("//input[last()]"));
//        passwordInput.click();
//        passwordInput.clear();
//        passwordInput.sendKeys(password);


   // click(By.cssSelector("a[href='/login']"));


//    public void fillLoginRegistrationForm(String email, String password){
//        type(By.name("email"), email);
//        type(By.xpath("//input[last()]"), password);

//        WebElement emailInput = wd.findElement(By.name("email"));
//
//        emailInput.click();
//        emailInput.clear();
//        emailInput.sendKeys(email);
//        WebElement passwordInput = wd.findElement(By.xpath("//input[last()]"));
//        passwordInput.click();
//        passwordInput.clear();
//        passwordInput.sendKeys(password);



    public void openLoginForm() {
    click(By.xpath("//a[text()=' Log in ']"));

    }

    public void fillLoginForm(String email, String password) {
        type(By.id("email"), email);
        type(By.id("password"), password);
        

    }
    //overloading
    public void fillLoginForm(User user) {
        type(By.id("email"), user.getEmail());
        type(By.id("password"), user.getPassword());


    }



    public void submitLogin() {

        //click(By.xpath("//button[text() = 'Y'lla!']");
        click(By.xpath("//button[@type='submit']"));

    }

    public String getMessage() {
        //return wd.findElement(By.cssSelector(".dialog-container>h2")).getText();
//        WebElement el = wd.findElement(By.cssSelector(".dialog-container>h2"));
//        String text = el.getText();
//
//        return text;

      //pause(2000);
        return wd.findElement(By.cssSelector(".dialog-container>h2")).getText();


    }

    public void clickOkButton() {
        if(isElementPresent(By.xpath("//button[text()='Ok']")))
   click(By.xpath("//button[text()='Ok']"));

    }

    public boolean isLogged() {
        return isElementPresent(By.xpath("//*[text()=' Logout ']"));
    }


    public void logOut() {
        click(By.xpath("//*[.=' Logout ']"));

    }


    public String getErrorText() {
        return wd.findElement(By.cssSelector("div.error")).getText();
    }
}
