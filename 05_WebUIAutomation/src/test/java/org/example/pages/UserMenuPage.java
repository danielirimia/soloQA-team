package org.example.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class UserMenuPage extends PageObject {
    @FindBy(css="button[data-test-id=\"header-member-menu-logout\"]")
    WebElement logoutButton;

    public void clickOnLogoutButton(){
        logoutButton.click();
    }
}
