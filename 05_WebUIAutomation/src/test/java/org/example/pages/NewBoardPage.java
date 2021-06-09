package org.example.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class NewBoardPage extends PageObject {
    @FindBy(css="h1[class=\"js-board-editing-target board-header-btn-text\"")
    WebElement boardTitle;

    @FindBy(css="div[class=\"board-canvas\"]")
    WebElement boardCanvas;

    public boolean isBoardTitleVisible() {
        return boardTitle.isDisplayed();
    }

    public boolean isBoardCanvasVisible() {
        return boardCanvas.isDisplayed();
    }
}
