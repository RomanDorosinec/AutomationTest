package by.training.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends AbstractPage {
    private final String PAGE_URL = "https://www.google.com";
    private static final String MENU = "//*[@aria-label='Приложения Google']";

    @FindBy(xpath = "//*[@title='Приложения Google']")
    private WebElement appsButton;

    @FindBy(xpath = "//*[@id='gb23']")
    private WebElement gmailButton;


    public MainPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void openPage() {
        driver.navigate().to(PAGE_URL);
        PageFactory.initElements(this.driver, this);
    }

    public void clickAppsButton() {
        appsButton.click();
    }

    public void clickGmailButton() {
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(MENU)));
        gmailButton.click();
    }
}
