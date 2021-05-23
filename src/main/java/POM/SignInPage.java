package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
    protected WebDriver webDriver;

    private By nameInput = By.id("ap_customer_name");
    private By emailInput = By.id("ap_email");
    private By conditionsOfUseLink = By.cssSelector("#legalTextRow > a:nth-child(1)");

    public SignInPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public SignInPage FillUpForm(String name, String email){
        webDriver.findElement(nameInput).sendKeys(name);
        webDriver.findElement(emailInput).sendKeys(email);
        return new SignInPage(webDriver);
    }

    public MainPage ClickOnConditionsOfUseLink(){
        webDriver.findElement(conditionsOfUseLink).click();
        return new MainPage(webDriver);
    }
}
