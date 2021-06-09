package org.example.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.example.pages.UserMenuPage;

public class UserMenuSteps {
    UserMenuPage userMenuPage;

    @Step
    public void clickOnLogoutButton() {
        userMenuPage.clickOnLogoutButton();
    }
}
