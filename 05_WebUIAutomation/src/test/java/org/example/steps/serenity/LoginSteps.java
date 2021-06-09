package org.example.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.example.pages.LoginPage;
import org.junit.Assert;

public class LoginSteps {
    LoginPage loginPage;

    @Step
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Step
    public void clickLoginWithAtlassianButton() {
        loginPage.clickLoginWithAtlassianButton();
    }

    @Step
    public void typeUser(String user) {
        loginPage.open();
        loginPage.typeUser(user);
    }

    @Step
    public void inputPassword(String password) {
        loginPage.inputPassword(password);
    }

    @Step
    public void checkYouAreNotLoggedIn() {
        Assert.assertTrue("You are logged in", loginPage.isLoginErrorMessageVisible());
    }

    @Step
    public void login(String username, String password) {
        typeUser(username);
        clickLoginWithAtlassianButton();
        inputPassword(password);
        clickLoginButton();
    }
}
