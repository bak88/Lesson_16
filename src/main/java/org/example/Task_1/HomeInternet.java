package org.example.Task_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomeInternet {

    private WebDriver driver;
    private By phoneId = By.id("internet-phone");
    private By sumId = By.id("internet-sum");
    private By emailId = By.id("internet-email");
    private By selectHeader = By.xpath("//button[@class='select__header']");
    private By serviceOptionHomeInternet = By.xpath("//p[text()='Домашний интернет']");

    public HomeInternet(WebDriver webDriver) {
        this.driver = webDriver;
    }

    public String getPhonePlaceholder(){
        return driver.findElement(phoneId).getAttribute("placeholder");
    }

    public String getSumPlaceholder(){
        return driver.findElement(sumId).getAttribute("placeholder");
    }

    public String getEmailPlaceholder(){
        return driver.findElement(emailId).getAttribute("placeholder");
    }

    public void selectHomeInternet() {
        Actions actions = new Actions(driver);

        WebElement header = driver.findElement(selectHeader);
        actions.moveToElement(header).click().build().perform();

        WebElement option = driver.findElement(serviceOptionHomeInternet);
        actions.moveToElement(option).click().build().perform();
    }
}
