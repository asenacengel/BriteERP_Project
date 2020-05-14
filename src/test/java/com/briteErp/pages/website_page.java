package com.briteErp.pages;

import com.briteErp.utilities.BrowserUtilities;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class website_page extends AbstractPageBase{

    @FindBy(xpath = "//a[@href='/web#menu_id=382&action=']")
    private WebElement website_button;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-default js_date_range active']")
    private WebElement lastWeek;

    @FindBy(className = "btn btn-sm btn-default js_date_range active")
    private WebElement lastMonth;

    @FindBy(className = "btn btn-sm btn-default js_date_range active")
    private WebElement lastYear;

    @FindBy(name = "website.action_website")
    private WebElement webSiteLink;

    @FindBy(tagName = "h2")
    private WebElement webSiteLinkText;



    public void web_site_module(){


        BrowserUtilities.waitForPageToLoad(10);
        wait.until(ExpectedConditions.elementToBeClickable(website_button)).click();
    }

    public void lastWeekModule(){

        wait.until(ExpectedConditions.elementToBeClickable(lastWeek)).isDisplayed();
        System.out.println(lastWeek.isDisplayed());

    }

    public void lastMonthModule(){
        driver.findElement((By) lastMonth).click();
        Assert.assertTrue(lastWeek.isDisplayed());
    }

    public void lastYearModule(){
        driver.findElement((By) lastYear).click();
        Assert.assertTrue(lastYear.isDisplayed());
    }


    public void webSiteLink() {
      wait.until(ExpectedConditions.elementToBeClickable(webSiteLink)).click();
        BrowserUtilities.wait(3);

    }

    public String webSiteLinkText(){
       return webSiteLinkText.getText();
    }

}
