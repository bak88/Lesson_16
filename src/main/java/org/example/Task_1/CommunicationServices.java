package org.example.Task_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommunicationServices {

    private WebDriver driver;
    private By phoneId = By.id("connection-phone");
    private By sumId = By.id("connection-sum");
    private By emailId = By.id("connection-email");


    public CommunicationServices(WebDriver driver) {
        this.driver = driver;
    }

    public String getPhonePlaceholder() {
        return driver.findElement(phoneId).getAttribute("placeholder");
    }

    public String getSumPlaceholder(){
        return driver.findElement(sumId).getAttribute("placeholder");
    }

    public String getEmailPlaceholder(){
        return driver.findElement(emailId).getAttribute("placeholder");
    }


}
