package by.training.test;

import by.training.driver.DriverSingleton;
import by.training.step.GmailPageSteps;
import by.training.step.MainPageSteps;
import by.training.step.SignInPageSteps;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AutomationTest {
    private static final String USER_LOGIN = "rr0665391@gmail.com";
    private static final String USER_PASSWORD = "1122334455667788";
    private static final String TEXT_EMAIL = "Hello, world!";

    private MainPageSteps mainPageSteps;
    private SignInPageSteps signInPageSteps;
    private GmailPageSteps gmailPageSteps;

    @BeforeClass
    public void initData() {
        mainPageSteps = new MainPageSteps();
        signInPageSteps = new SignInPageSteps();
        gmailPageSteps = new GmailPageSteps();
    }

    @Test
    public void testClick() {
        mainPageSteps.openMail();
        signInPageSteps.setUserName(USER_LOGIN);
        signInPageSteps.setUsersPassword(USER_PASSWORD);
        gmailPageSteps.writeEmailAndSend(USER_LOGIN, TEXT_EMAIL);
        gmailPageSteps.openInbox();
        Assert.assertEquals(gmailPageSteps.getSendersEmail(), USER_LOGIN);
        gmailPageSteps.openEmail();
        Assert.assertEquals(gmailPageSteps.getEmailTextContent(), TEXT_EMAIL);
    }

    @AfterClass
    public void driverRelease() {
        gmailPageSteps.deleteEmail();
        DriverSingleton.closeDriver();
    }
}