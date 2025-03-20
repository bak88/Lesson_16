package org.example.Task_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Indebtedness  extends BasePage{

    private By scoreId = By.id("score-arrears");
    private By sumId = By.id("arrears-sum");
    private By emailId = By.id("arrears-email");
    private By selectHeader = By.xpath("//button[@class='select__header']");
    private By serviceOptionInstallment = By.xpath("//p[text()='Задолженность']");


    public Indebtedness(WebDriver driver) {
        super(driver);
    }

    public String getScorePlaceholder(){
        return getPlaceholder(scoreId);
    }

    public String getSumPlaceholder(){
        return getPlaceholder(sumId);
    }

    public String getEmailPlaceholder(){
        return  getPlaceholder(emailId);
    }

    public void selectIndebtedness(){
        clickElement(selectHeader);
        clickElement(serviceOptionInstallment);
    }
}
