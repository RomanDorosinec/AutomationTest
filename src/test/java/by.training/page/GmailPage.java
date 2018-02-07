package by.training.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GmailPage extends AbstractPage {
    private static final String WRITE_EMAIL_MENU = "//*[@role='dialog']";

    @FindBy(xpath = "//*[@class='T-I J-J5-Ji T-I-KE L3']")
    private WebElement composeEmailButton;

    @FindBy(xpath = "//*[@role='combobox']")
    private WebElement recipients;

    @FindBy(xpath = "//*[@role='textbox']")
    private WebElement textBox;

    @FindBy(xpath = "//*[@class='T-I J-J5-Ji aoO T-I-atl L3']")
    private WebElement sendButton;

    @FindBy(xpath = "//*[@class='aim ain']")
    private WebElement inbox;

    public GmailPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void openPage() {
        PageFactory.initElements(this.driver, this);
    }

    public void clickWriteEmailButton() {
        composeEmailButton.click();
    }

    public void setMailer(String mailer) {
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(WRITE_EMAIL_MENU)));
        recipients.sendKeys(mailer);
    }

    public void setText(String text) {
        textBox.sendKeys(text);
    }

    public void clickSendButton() {
        sendButton.click();
    }

    public void clickInbox() {
        inbox.click();
    }
}
