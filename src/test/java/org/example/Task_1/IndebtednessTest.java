package org.example.Task_1;

import org.example.WebDriverManadger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class IndebtednessTest extends WebDriverManadger {

    Indebtedness indebtedness;

    @Test
    public void testScorePlaceholder() throws InterruptedException {
        indebtedness = new Indebtedness(driver);
        indebtedness.selectIndebtedness();
        String expectedPlaceholder = "Номер счета на 2073";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("score-arrears")));
        Assertions.assertEquals(expectedPlaceholder, indebtedness.getScorePlaceholder());
    }

    @Test
    public void testSumPlaseholder() throws InterruptedException {
        indebtedness = new Indebtedness(driver);
        indebtedness.selectIndebtedness();
        String expectedPlaceholder = "Сумма";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("arrears-sum")));
        Assertions.assertEquals(expectedPlaceholder, indebtedness.getSumPlaceholder());
    }

    @Test
    public void testEmailPlaseholder() throws InterruptedException {
        indebtedness = new Indebtedness(driver);
        indebtedness.selectIndebtedness();
        String expectedPlaceholder = "E-mail для отправки чека";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("arrears-email")));
        Assertions.assertEquals(expectedPlaceholder, indebtedness.getEmailPlaceholder());
    }
}
