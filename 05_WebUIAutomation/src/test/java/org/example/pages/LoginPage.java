package org.example.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://trello.com/login")
public class LoginPage extends PageObject {
    @FindBy(id="user")
    private WebElement userInput;

    @FindBy(css="#login")
    private WebElement loginWithAttlasianButton;

    @FindBy(css="#password")
    private WebElement passwordInput;

    @FindBy(id="login-submit")
    private WebElement loginButton;

    @FindBy(id="login-error")
    private WebElement loginErrorMessage;

    public void typeUser(String username) {
        userInput.sendKeys(username);
    }

    public void clickLoginWithAtlassianButton(){
        loginWithAttlasianButton.click();
    }

    public void inputPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton(){
        loginButton.click();
    }

    public boolean isLoginErrorMessageVisible(){
        return loginErrorMessage.isDisplayed();
    }
}
