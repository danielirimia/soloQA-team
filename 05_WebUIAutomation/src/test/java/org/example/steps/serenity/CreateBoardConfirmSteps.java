package org.example.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.example.pages.CreateBoardConfirmPage;

public class CreateBoardConfirmSteps {
    CreateBoardConfirmPage confirmPage;

    @Step
    public void inputBoardName(String boardname) {
        confirmPage.inputBoardName(boardname);
    }

    @Step
    public void clickCreateBoardButton() {
        confirmPage.clickCreateBoardButton();
    }
}
