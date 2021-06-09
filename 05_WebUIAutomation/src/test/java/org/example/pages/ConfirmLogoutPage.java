package org.example.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfirmLogoutPage extends PageObject {
    @FindBy(id="logout-submit")
    private WebElement confirmLogoutButton;

    public void clickConfirmLogoutButton() {
        confirmLogoutButton.click();
    }
}
