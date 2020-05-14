package com.briteErp.step_definitions;

import com.briteErp.pages.EventsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class CreateEventStepDefinitions {
    EventsPage eventsPage = new EventsPage();

    @When("User  navigates to {string} module")
    public void user_navigates_to_module(String string) {
         eventsPage.navigateTo(string);
    }
    @When("User clicks create")
    public void user_clicks_create() {
      eventsPage.clickCreate();
    }

    @When("enter  following info")
    public void enter_following_info(List<Map<String,String>> dataTable) {
        for (Map<String, String> row : dataTable) {
             eventsPage.setEventName( row.get("Event Name") );
             eventsPage.setBeginDate(row.get("Begin date"));
             eventsPage.setEndDate(row.get("End date"));
        }
    }
    @Then("create event")
    public void create_event() {
       eventsPage.clickToSave();
    }
    @Then("confirm event is created")
    public void confirm_event_is_created() {
        Assert.assertEquals( eventsPage.confirmMessage(), "Event created");
    }



}
