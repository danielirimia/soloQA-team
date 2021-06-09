package org.example.features.login;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.example.steps.serenity.HeaderSteps;
import org.example.steps.serenity.LoginSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("loginValidData.csv")
public class LoginTestValid {

    @Managed
    public WebDriver webdriver;

    @Steps
    public LoginSteps loginSteps;

    @Steps
    public HeaderSteps headerSteps;

    String username, password;
    @Test
    public void loginTestSuccessful() {
        webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginSteps.login(username, password);
        headerSteps.checkYouAreLoggedIn();
    }
}
