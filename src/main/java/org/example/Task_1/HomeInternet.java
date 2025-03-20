package org.example.Task_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeInternet extends BasePage {

    private By phoneId = By.id("internet-phone");
    private By sumId = By.id("internet-sum");
    private By emailId = By.id("internet-email");
    private By selectHeader = By.xpath("//button[@class='select__header']");
    private By serviceOptionHomeInternet = By.xpath("//p[text()='Домашний интернет']");


    public HomeInternet(WebDriver driver) {
        super(driver);
    }

    public String getPhonePlaceholder() {
        return getPlaceholder(phoneId);
    }

    public String getSumPlaceholder(){
        return getPlaceholder(sumId);
    }

    public String getEmailPlaceholder(){
        return getPlaceholder(emailId);
    }

    public void selectHomeInternet(){
        clickElement(selectHeader);
        clickElement(serviceOptionHomeInternet);
    }
}
