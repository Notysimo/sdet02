package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    protected WebDriver webDriver;

    private By accountAndListHeaderMenu = By.cssSelector("#nav-link-accountList > span.nav-line-2.nav-long-width");
    private By createAccountButton = By.id("createAccountSubmit");
    private By headerSearchInput = By.id("twotabsearchtextbox");

    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public SignInPage LocateUpperRightMenu(){
        webDriver.findElement(accountAndListHeaderMenu).click();
        webDriver.findElement(createAccountButton).click();
        return new SignInPage(webDriver);
    }

    public SignInPage SearchAValueInHeaderSearch(String value){
        webDriver.findElement(headerSearchInput).sendKeys(value);
        return new SignInPage(webDriver);
    }
}
