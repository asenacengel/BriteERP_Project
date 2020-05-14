package com.briteErp.step_definitions;

import com.briteErp.pages.CalenderPage;
import com.briteErp.pages.LoginPage;
import com.briteErp.utilities.BrowserUtilities;
import com.briteErp.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalenderStepDefinitions {

    LoginPage loginPage=new LoginPage();
    CalenderPage calenderPage=new CalenderPage();
    WebDriverWait wait=new WebDriverWait(Driver.getDriver(),15);

    @When("User navigates to {string} module")
    public void user_navigates_to_module(String moduleName) {
        loginPage.navigateTo(moduleName);
        BrowserUtilities.wait(2);
    }

    @And("User creates meeting at All day")
    public void userCreatesMeetingAtAllDay() {
        calenderPage.calenderBoxAll();
        calenderPage.clickOnCreateAllDayEvent();

    }

    @When("User summary should be {string}")
    public void user_summary_should_be(String string) {
        calenderPage.writeSummaryBox(string);
        BrowserUtilities.wait(2);

    }
    @And("User clicks on Create button")
    public void userClicksOnCreateButton() {
        calenderPage.clickOnCreateButton();
        BrowserUtilities.wait(2);
    }

    @Then("Verifies the meeting topic")
    public void verifies_the_meeting_topic() {
        Assert.assertEquals("Odoo Meeting",calenderPage.verificationAllDayText());
        calenderPage.clickOnCurrentDate();
        System.out.println(calenderPage.verificationAllDayText());
    }

}
