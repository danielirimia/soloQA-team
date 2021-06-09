package org.example.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.example.pages.ConfirmLogoutPage;
import org.example.pages.CreateBoardConfirmPage;

public class ConfirmLogoutSteps {
    ConfirmLogoutPage confirmLogoutPage;

    @Step
    public void clickConfirmLogout() {
        confirmLogoutPage.clickConfirmLogoutButton();
    }
}
