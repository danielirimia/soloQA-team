package org.example.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.example.pages.HeaderPage;
import org.junit.Assert;

public class HeaderSteps {
    HeaderPage headerPage;

    @Step
    public void checkYouAreLoggedIn() {
        Assert.assertTrue("You are not logged in", headerPage.isAccountButtonVisible());
    }

    @Step
    public void clickCreateBoardButton() {
        headerPage.clickCreateBoardButton();
    }

    @Step
    public void clickOnAccountButton(){
        headerPage.clickOnAccountButton();
    }
}
