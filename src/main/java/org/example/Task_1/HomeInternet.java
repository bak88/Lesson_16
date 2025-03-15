package org.example.Task_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement header = wait.until(ExpectedConditions.visibilityOfElementLocated(selectHeader));
        header.click();

        WebElement option = wait.until(ExpectedConditions.elementToBeClickable(serviceOptionHomeInternet));
        option.click();
    }
}
