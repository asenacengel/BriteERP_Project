package com.briteErp.pages;

import com.briteErp.utilities.BrowserUtilities;
import com.briteErp.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends AbstractPageBase {

    @FindBy(id = "login")
    private WebElement email;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(css = "[class='alert alert-danger']")
    private WebElement warningMessage;

    @FindBy(className = "oe_topbar_name")
    private WebElement userName;

    public String getUserName() {
        return userName.getText().toString();
    }

    public String getWarningMessageText() {
        return warningMessage.getText();
    }

    public void login() {
        email.sendKeys(ConfigurationReader.getProperty("email"));
        password.sendKeys(ConfigurationReader.getProperty("password"), Keys.ENTER);
        BrowserUtilities.waitForPageToLoad(10);
        BrowserUtilities.wait(3);
    }

    public void login(String validEmail, String validPassword) {
        email.sendKeys(validEmail);
        password.sendKeys(validPassword,Keys.ENTER);
        BrowserUtilities.waitForPageToLoad(10);
        BrowserUtilities.wait(3);
    }


}
