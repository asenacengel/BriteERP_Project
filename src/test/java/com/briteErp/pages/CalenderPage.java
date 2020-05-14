package com.briteErp.pages;


import com.briteErp.utilities.BrowserUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.*;

public class CalenderPage extends AbstractPageBase {


    @FindBy(xpath = "//*[starts-with(@id,'dp')]/div/table/tbody/tr[3]/td[5]")
    private WebElement currentDate;

    public void clickOnCurrentDate() {
        BrowserUtilities.clickWithJS(currentDate);
        BrowserUtilities.wait(3);
    }

    public void calenderBoxAll() {
        WebElement calenderBox = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']"));
        List<WebElement> columns = calenderBox.findElements(By.tagName("td"));
        for (WebElement cell : columns) {
            if (cell.getText().equals("14")) {
                cell.findElement(By.linkText("14")).click();
                break;
            }

        }

    }


    @FindBy(xpath = "(//tbody//td[@class='fc-day fc-widget-content fc-thu fc-today fc-state-highlight'])[1]")
    private WebElement createAllDayEvent;

    public void clickOnCreateAllDayEvent() {
        createAllDayEvent.click();
        BrowserUtilities.wait(3);
    }

    @FindBy(xpath = "//input[@class='o_input']")
    private WebElement summaryBox;

    public void writeSummaryBox(String summary) {
        summaryBox.sendKeys(summary);
    }

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
    private WebElement createButton;

    public void clickOnCreateButton() {
        createButton.click();
    }

    @FindBy(xpath = "//div[@class='o_field_name o_field_type_char']")
    private WebElement allDayText;

    public String verificationAllDayText() {
        return allDayText.getText().trim();

    }


}