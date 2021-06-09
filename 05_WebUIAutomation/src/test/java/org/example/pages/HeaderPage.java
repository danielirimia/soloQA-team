package org.example.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class HeaderPage extends PageObject {
    @FindBy(css="button[data-test-id=\"header-member-menu-button\"]")
    private WebElement accountButton;

    @FindBy(css="button[data-test-id=\"header-create-menu-button\"]")
    private WebElement createBoardButton;

    public boolean isAccountButtonVisible(){
        return accountButton.isDisplayed();
    }

    public void clickOnAccountButton(){
        accountButton.click();
    }

    public void clickCreateBoardButton() {
        createBoardButton.click();
    }
}


