package com.briteErp.pages;

import com.briteErp.utilities.BrowserUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EventsPage  extends AbstractPageBase{

    @FindBy(xpath="//*[@class='btn btn-primary btn-sm o-kanban-button-new btn-default']")
    private WebElement createBtn;

    @FindBy(css="[placeholder='Event Name']")
    private WebElement eventName;

    @FindBy(xpath="//*[@name='date_begin']/input")
    private WebElement date_begin;

    @FindBy(xpath="//*[@name='date_end']/input")
    private WebElement date_end;

    @FindBy(xpath="//button[@class='btn btn-primary btn-sm o_form_button_save']")
    private WebElement saveBtn;

    @FindBy(xpath="//p[contains(text(),'Event created')]")
    private WebElement message;


    public void clickCreate(){
        BrowserUtilities.wait(5);
        createBtn.click();
    }
    public void setEventName(String string) {
        BrowserUtilities.waitForPageToLoad(5);
        wait.until(ExpectedConditions.visibilityOf(eventName));
        eventName.sendKeys(string);
    }

    public void setBeginDate(String string) {
        wait.until(ExpectedConditions.visibilityOf(date_begin));
        date_begin.sendKeys(string);
    }

    public void setEndDate(String string) {
        wait.until(ExpectedConditions.visibilityOf(date_end));
        date_end.sendKeys(string);
    }

    public void clickToSave(){
        BrowserUtilities.wait(3);
        wait.until(ExpectedConditions.elementToBeClickable(saveBtn)).click();
    }
    public String confirmMessage(){
        wait.until(ExpectedConditions.visibilityOf(message));
        return message.getText();
    }
}
