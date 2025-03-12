
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage {

    private WebDriver driver;
    private By cardNumberField = By.xpath("//input[@formcontrolname='creditCard']");
    private By expirationDateField = By.xpath("//input[@formcontrolname='expirationDate']");
    private By cvcField = By.xpath("//input[@formcontrolname='cvc']");
    private By holderField = By.xpath("//input[@formcontrolname='holder']");

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
    }

    public String enterCardNumber() {
        return driver.findElement(cardNumberField).getText();
    }

    public String enterExpirationDate() {
        return driver.findElement(expirationDateField).getText();
    }

    public String enterCVC() {
        return driver.findElement(cvcField).getText();
    }

    public String enterHolderName() {
       return driver.findElement(holderField).getText();
    }

}
