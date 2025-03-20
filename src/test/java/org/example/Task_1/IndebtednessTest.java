package org.example.Task_1;

import org.example.WebDriverManadger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class IndebtednessTest extends WebDriverManadger {

    Indebtedness indebtedness;

    @Test
    public void testScorePlaceholder() {
        indebtedness = new Indebtedness(driver);
        indebtedness.selectIndebtedness();
        Assertions.assertEquals("Номер счета на 2073", indebtedness.getScorePlaceholder());
    }

    @Test
    public void testSumPlaseholder() {
        indebtedness = new Indebtedness(driver);
        indebtedness.selectIndebtedness();
        Assertions.assertEquals("Сумма", indebtedness.getSumPlaceholder());
    }

    @Test
    public void testEmailPlaseholder() {
        indebtedness = new Indebtedness(driver);
        indebtedness.selectIndebtedness();
        Assertions.assertEquals("E-mail для отправки чека", indebtedness.getEmailPlaceholder());
    }
}
