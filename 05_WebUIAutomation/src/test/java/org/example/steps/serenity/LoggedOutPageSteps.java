package org.example.steps.serenity;

import org.example.pages.LoggedOutPage;
import org.junit.Assert;

public class LoggedOutPageSteps {
    LoggedOutPage loggedOutPage;

    public void checkIfLoggedOut() {
        Assert.assertTrue(loggedOutPage.checkIfLoginButtonIsVisible());
    }
}
