package org.example.Task_1;

import org.example.WebDriverManadger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CommunicationServicesTest extends WebDriverManadger {
    private CommunicationServices communicationServices;

    @Test
    public void testPhonePlaceholder() {
        communicationServices = new CommunicationServices(driver);
        Assertions.assertEquals("Номер телефона", communicationServices.getPhonePlaceholder());

    }

    @Test
    public void testSumPlaseholder() {
        communicationServices = new CommunicationServices(driver);
        Assertions.assertEquals("Сумма", communicationServices.getSumPlaceholder());
    }

    @Test
    public void testEmailPlaseholder() {
        communicationServices = new CommunicationServices(driver);
        Assertions.assertEquals("E-mail для отправки чека", communicationServices.getEmailPlaceholder());
    }
}
