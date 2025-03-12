package org.example.Task_2;

import org.example.WebDriverManadger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CommunicationServicesTest extends WebDriverManadger {

    private CommunicationServices communicationServices;


    @Test
    public void testFillBoxAndCheckButton() {
        communicationServices = new CommunicationServices(driver);
        communicationServices.fillFields("297777777", "20");
        communicationServices.clickContinue();
        //WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='payment-page__container']")));


    }

    @Test
    public void testPaymentPage() {

    }


}
