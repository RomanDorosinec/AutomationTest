package by.training.step;

import by.training.driver.DriverSingleton;
import by.training.page.MainPage;

public class MainPageSteps {
    private final MainPage mainPage;

    public MainPageSteps() {
        mainPage = new MainPage(DriverSingleton.getDriver());
        mainPage.openPage();
    }

    public void openMail() {
        mainPage.clickAppsButton();
        mainPage.clickGmailButton();
    }
}
