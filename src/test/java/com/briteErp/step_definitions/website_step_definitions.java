package com.briteErp.step_definitions;

import com.briteErp.pages.LoginPage;
import com.briteErp.pages.website_page;
import com.briteErp.utilities.BrowserUtilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class website_step_definitions {

    website_page websitePage = new website_page();

    @Then("User  navigates to {string} module")
    public void user_navigates_to_module(String string) {
        websitePage.web_site_module();

    }

    @Then("User verifies that {string} sales are displayed:")
    public void user_verifies_that_sales_are_displayed(String string) {
        websitePage.lastWeekModule();


    }

    @Then("User  navigates to website module")
    public void userNavigatesToWebsiteModule() {
        websitePage.web_site_module();

    }

    @And("User  click to the {string} module")
    public void userClickToTheModule(String arg0)  {
        websitePage.webSiteLink();
    }


    @Then("User verifies following message {string}")
    public void user_verifies_following_message(String message) {

        Assert.assertEquals(message, websitePage.webSiteLinkText());

    }


}
