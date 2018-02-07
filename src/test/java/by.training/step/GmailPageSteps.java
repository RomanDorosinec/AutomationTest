package by.training.step;

import by.training.driver.DriverSingleton;
import by.training.page.GmailPage;

public class GmailPageSteps {
    private final GmailPage gmailPage;

    public GmailPageSteps() {
        gmailPage = new GmailPage(DriverSingleton.getDriver());
        gmailPage.openPage();
    }

    public void writeEmailAndSend(String mailer, String text) {
        gmailPage.clickWriteEmailButton();
        gmailPage.setMailer(mailer);
        gmailPage.setText(text);
        gmailPage.clickSendButton();
    }

    public void openInbox() {
        gmailPage.clickInbox();
    }
}
