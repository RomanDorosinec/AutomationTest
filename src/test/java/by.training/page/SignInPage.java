package by.training.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignInPage extends AbstractPage {
    @FindBy(xpath = "//*[@type='email']")
    private WebElement login;

    @FindBy(xpath = "//*[@id='identifierNext']")
    private WebElement nextLoginButton;

    @FindBy(xpath = "//*[@type='password']")
    private WebElement password;

    @FindBy(xpath = "//*[@id='passwordNext']")
    private WebElement nextPasswordButton;

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void openPage() {
        PageFactory.initElements(this.driver, this);
    }

    public void setLogin(String userName) {
        login.sendKeys(userName);
    }

    public void clickNextButton() {
        nextLoginButton.click();
    }

    public void setPassword(String usersPassword) {
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@type='password']")));
        password.sendKeys(usersPassword);
    }

    public void clickButton() {
        nextPasswordButton.click();
    }
}
