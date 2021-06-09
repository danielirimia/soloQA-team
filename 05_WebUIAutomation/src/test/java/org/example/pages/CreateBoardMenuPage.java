package org.example.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class CreateBoardMenuPage extends PageObject {
    @FindBy(css="button[data-test-id=\"header-create-board-button\"]")
    private WebElement createBoardMenuOption;

    public void clickCreateBoardMenuOption() {
        createBoardMenuOption.click();
    }
}
