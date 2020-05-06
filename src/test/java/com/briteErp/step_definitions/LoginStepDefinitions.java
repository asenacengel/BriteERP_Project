package com.briteErp.step_definitions;

import com.briteErp.pages.LoginPage;
import com.briteErp.utilities.ConfigurationReader;
import com.briteErp.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {
    LoginPage loginPage=new LoginPage();

    @When("User is on the landing page")
    public void user_is_on_the_landing_page() {
        System.out.println("Open login page");
        String URL= ConfigurationReader.getProperty("url");
        Driver.getDriver().get(URL);

    }

    @When("User logs in with valid credentials")
    public void user_logs_in_with_valid_credentials() {
        System.out.println("Login....");
        loginPage.login();

    }


    @Then("verifies the username")
    public void verifiesTheUsername() {
        Assert.assertEquals(loginPage.getUserName(),"EventsCRMManager45");
    }
}
