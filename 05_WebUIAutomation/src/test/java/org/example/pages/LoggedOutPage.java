package org.example.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class LoggedOutPage extends PageObject {
    @FindBy(css="a[href=\"/login\"]")
    private WebElement loginButton;

    public boolean checkIfLoginButtonIsVisible() {
        return loginButton.isDisplayed();
    }
}
