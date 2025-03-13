package org.example.Task_2;

import org.example.WebDriverManadger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CommunicationServicesTest extends WebDriverManadger {

    private CommunicationServices communicationServices;
    private PaymentPage paymentPage;
    private CardBrandsPage cardBrandsPage;

    @Test
    public void testFillBoxAndCheckButton() {

        communicationServices = new CommunicationServices(driver);
        communicationServices.fillFields("297777777", "20");
        communicationServices.clickContinue();

    }


    @Test
    public void testPlaceholderNumberCard() {
        testFillBoxAndCheckButton();

        WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@class='bepaid-iframe']")));
        driver.switchTo().frame(iframe);

        paymentPage = new PaymentPage(driver);
        String expectedNumberCard = "Номер карты";
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[contains(text(), 'Номер карты')]")));
        Assertions.assertEquals(expectedNumberCard, paymentPage.placeholderCardNumber());

    }

    @Test
    public void testPlaceholderExpirationDate() {
        testFillBoxAndCheckButton();

        WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@class='bepaid-iframe']")));
        driver.switchTo().frame(iframe);

        paymentPage = new PaymentPage(driver);
        String expectedNumberCard = "Срок действия";
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[contains(text(), 'Срок действия')]")));
        Assertions.assertEquals(expectedNumberCard, paymentPage.placeholderExpirationDate());

    }

    @Test
    public void testPlaceholderCVC() {
        testFillBoxAndCheckButton();

        WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@class='bepaid-iframe']")));
        driver.switchTo().frame(iframe);

        paymentPage = new PaymentPage(driver);
        String expectedNumberCard = "CVC";
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[contains(text(), 'CVC')]")));
        Assertions.assertEquals(expectedNumberCard, paymentPage.placeholderCVC());

    }

    @Test
    public void testPlaceholderHolderName() {
        testFillBoxAndCheckButton();

        WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@class='bepaid-iframe']")));
        driver.switchTo().frame(iframe);

        paymentPage = new PaymentPage(driver);
        String expectedNumberCard = "Имя держателя (как на карте)";
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[contains(text(), 'Имя держателя (как на карте)')]")));
        Assertions.assertEquals(expectedNumberCard, paymentPage.placeholderHolderName());

    }

    @Test
    public void testCheckSumHeader() {
        communicationServices = new CommunicationServices(driver);
        communicationServices.fillFields("297777777", "20");
        String actualSum = communicationServices.getSum() + ".00 BYN";
        communicationServices.clickContinue();

        WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@class='bepaid-iframe']")));
        driver.switchTo().frame(iframe);

        var expectedSum = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='20.00 BYN']"))).getAttribute("innerText");
        Assertions.assertEquals(actualSum, expectedSum);

    }

    @Test
    public void testCheckSumButton(){
        communicationServices = new CommunicationServices(driver);
        communicationServices.fillFields("297777777", "20");
        communicationServices.clickContinue();

        WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@class='bepaid-iframe']")));
        driver.switchTo().frame(iframe);

        String actualSum = "Оплатить 20.00 BYN";
        var expectedSum = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='colored disabled']"))).getAttribute("innerText");
        Assertions.assertEquals(actualSum, expectedSum);
    }

    @Test
    public void testCheckPhoneHeader() {

        communicationServices = new CommunicationServices(driver);
        communicationServices.fillFields("297777777", "20");
        communicationServices.clickContinue();

        WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@class='bepaid-iframe']")));
        driver.switchTo().frame(iframe);

        String actualPhone = "Оплата: Услуги связи Номер:375297777777";
        var expectedPhone = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='pay-description__text']"))).getAttribute("innerText");
        Assertions.assertEquals(actualPhone, expectedPhone);
    }

    @Test
    public void testVisaIconDisplayed() {

        testFillBoxAndCheckButton();
        WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@class='bepaid-iframe']")));
        driver.switchTo().frame(iframe);
        cardBrandsPage = new CardBrandsPage(driver);
        Assertions.assertTrue(cardBrandsPage.isVisaIconDisplayed());
    }

    @Test
    public void testMastercardIconDisplayed() {
        testFillBoxAndCheckButton();
        WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@class='bepaid-iframe']")));
        driver.switchTo().frame(iframe);
        cardBrandsPage = new CardBrandsPage(driver);
        Assertions.assertTrue(cardBrandsPage.isMastercardIconDisplayed());
    }

    @Test
    public void testBelkartIconDisplayed() {
        testFillBoxAndCheckButton();
        WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@class='bepaid-iframe']")));
        driver.switchTo().frame(iframe);
        cardBrandsPage = new CardBrandsPage(driver);
        Assertions.assertTrue(cardBrandsPage.isBelkartIconDisplayed());
    }

    @Test
    public void testMaestroIconDisplayed() {
        testFillBoxAndCheckButton();
        WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@class='bepaid-iframe']")));
        driver.switchTo().frame(iframe);
        cardBrandsPage = new CardBrandsPage(driver);
        Assertions.assertTrue(cardBrandsPage.isMaestroIconDisplayed());
    }


}
