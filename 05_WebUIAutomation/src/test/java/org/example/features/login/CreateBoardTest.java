package org.example.features.login;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.example.pages.NewBoardPage;
import org.example.pages.UserMenuPage;
import org.example.steps.serenity.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CreateBoardTest {
    @Managed
    public WebDriver webdriver;

    @Steps
    public LoginSteps loginSteps;

    @Steps
    public HeaderSteps headerSteps;

    @Steps
    public CreateBoardMenuSteps menuSteps;

    @Steps
    CreateBoardConfirmSteps confirmSteps;

    @Steps
    NewBoardSteps newBoardSteps;

    @Steps
    UserMenuSteps userMenuSteps;

    @Steps
    ConfirmLogoutSteps confirmLogoutSteps;

    @Steps
    LoggedOutPageSteps loggedOutPageSteps;

    @Test
    public void createBoardSucessTest() {
        loginSteps.login("testvvss2021@gmail.com", "TestVVSS2021");
        headerSteps.clickCreateBoardButton();
        menuSteps.clickOnCreateBoardMenuOption();
        confirmSteps.inputBoardName("test");
        confirmSteps.clickCreateBoardButton();
        newBoardSteps.checkBoardIsCreated();
        headerSteps.clickOnAccountButton();
        userMenuSteps.clickOnLogoutButton();
        confirmLogoutSteps.clickConfirmLogout();
        loggedOutPageSteps.checkIfLoggedOut();
    }
}
