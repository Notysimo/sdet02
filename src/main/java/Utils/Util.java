package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util {
    /**
     * method that wait an element
     * @param element
     * @param webDriver
     * @return webElement
     */
    static public WebElement WaitElement(By element, WebDriver webDriver){
        return new WebDriverWait(webDriver, 10)
                .until(ExpectedConditions.elementToBeClickable(element));
    }

    /**
     * Method that creates an email
     * @param fullName
     * @return email
     */
    static public String CreateAnEMail(String fullName){
        fullName.replace(" ",".");
        return fullName.replace(" ",".")+"@fake.com";
    }

    /**
     * Method that obtain a name
     * @param fullName
     * @return name
     */
    static public String ObtainName(String fullName){
        String[] parts = fullName.split(" ");
        return parts[0];
    }
}
