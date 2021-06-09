package org.example.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class CreateBoardConfirmPage extends PageObject {
    @FindBy(css="input[data-test-id=\"create-board-title-input\"]")
    WebElement createBoardInput;

    @FindBy(css="button[data-test-id=\"create-board-submit-button\"]")
    WebElement createBoardButton;

    public void inputBoardName(String boardName) {
        createBoardInput.sendKeys(boardName);
    }

    public void clickCreateBoardButton() {
        createBoardButton.click();
    }

}
