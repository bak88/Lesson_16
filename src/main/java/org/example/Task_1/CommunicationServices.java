package org.example.Task_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CommunicationServices extends BasePage {

    private By phoneId = By.id("connection-phone");
    private By sumId = By.id("connection-sum");
    private By emailId = By.id("connection-email");


    public CommunicationServices(WebDriver driver) {
        super(driver);
    }

    public String getPhonePlaceholder() {
        return getPlaceholder(phoneId);
    }

    public String getSumPlaceholder() {
        return getPlaceholder(sumId);
    }

    public String getEmailPlaceholder() {
        return getPlaceholder(emailId);
    }
}
