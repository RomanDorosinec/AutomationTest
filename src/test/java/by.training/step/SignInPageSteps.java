package by.training.step;

import by.training.driver.DriverSingleton;
import by.training.page.SignInPage;

public class SignInPageSteps {
    private final SignInPage signInPage;

    public SignInPageSteps() {
        signInPage = new SignInPage(DriverSingleton.getDriver());
        signInPage.openPage();
    }

    public void setUserName(String userName) {
        signInPage.setLogin(userName);
        signInPage.clickNextButton();
    }

    public void setUsersPassword(String usersPassword) {
        signInPage.setPassword(usersPassword);
        signInPage.clickButton();
    }
}