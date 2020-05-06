package com.briteErp.pages;

import com.briteErp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractPageBase {

    protected WebDriver driver= Driver.getDriver();
    protected WebDriverWait wait=new WebDriverWait(driver,15);
    public AbstractPageBase(){
        PageFactory.initElements(driver,this);
    }

    public void navigateTo( String moduleName) {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Notes')]")));
        String moduleXpath = "//span[contains(text(),'"+moduleName+"')]";
        WebElement moduleElement = driver.findElement(By.xpath(moduleXpath));
          moduleElement.click();
    }




git
}
