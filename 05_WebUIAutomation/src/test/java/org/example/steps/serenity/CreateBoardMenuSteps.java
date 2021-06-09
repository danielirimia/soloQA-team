package org.example.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.example.pages.CreateBoardMenuPage;

public class CreateBoardMenuSteps {
    CreateBoardMenuPage createBoardMenuPage;

    @Step
    public void clickOnCreateBoardMenuOption() {
        createBoardMenuPage.clickCreateBoardMenuOption();
    }
}
