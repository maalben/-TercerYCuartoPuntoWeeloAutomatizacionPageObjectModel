package com.weelo.millionandup.pageobject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import java.text.ParseException;
import static org.junit.Assert.assertEquals;
import static com.weelo.millionandup.utilities.Utilities.*;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

@DefaultUrl("https://newdesign.millionandup.com/")
public class VideocallPageObject extends PageObject {

    WebDriverWait wait;

    @FindBy(xpath = "//i[@class='icon btn-icon icon-arrow-forward btn-white__icon']")
    public WebElementFacade btnSchedulePresentation;

    @FindBy(xpath = "//i[@class='icon-arrow-down']")
    public WebElementFacade btnCalendar;

    @FindBy(xpath = "//div[@class='type-schedule-section']//button[2]")
    public WebElementFacade btnZoomCall;

    @FindBy(xpath = "//form[@id='frmScheduleLeadModal']/div[@class='required-inputs-lead lead__container-popup']/div[2]//input[1]")
    public WebElementFacade txtEmail;

    @FindBy(id = "btnSendModal")
    public WebElementFacade btnAcceptSchedule;

    @FindBy(xpath = "//form[@id='frmScheduleLeadModal']/div[3]/div[3]/input")
    public WebElementFacade txtName;

    @FindBy(xpath = "//form[@id='frmScheduleLeadModal']/div[3]/div[4]//input[@name='phone']")
    public WebElementFacade txtphoneNumber;

    @FindBy(xpath = "//div[@class='d-flex schedule-response-text']")
    public WebElementFacade lblValidationMessage;

    @FindBy(xpath = "//span[@class='validation-msg-schedule schedule__validation-footer-text']")
    public WebElementFacade lblValidationErrorMessage;

    @FindBy(xpath = "//span[@class='validation-msg lead__validation-footer-text']")
    public WebElementFacade lblValidationEmailErrorMessage;

    public void goFinalSite() {
        moveScreen(this.getDriver(), "up");
        waitOwn(1);
        moveScreen(this.getDriver(), "up");
        waitOwn(1);
    }

    public void pressButtonScheduleVideocall() {
        btnSchedulePresentation.click();
    }

    public void pressButtonCalendar() {
        btnCalendar.click();
    }

    public void selectScheduleDateVideocall(String dateVideocall) throws ParseException {
        selectDateVideoCall(this.getDriver(),  dateVideocall);
    }

    public void selectScheduleTimeVideocall(String timeVideocall) {
        selectTimeVideoCall(this.getDriver(),  timeVideocall);
    }

    public void pressButtonZoomCall() {
        btnZoomCall.click();
    }

    public void sendEmail(String email) {
        //typeInField(txtEmail, email);
        txtEmail.sendKeys(email);
    }

    public void pressButtonAcceptSchedule() {
        btnAcceptSchedule.click();
    }

    public void sendName(String name) {
        //typeInField(txtName, name);
        txtName.sendKeys(name);
    }

    public void sendPhoneNumber(String mobilePhone) {
        //typeInField(txtphoneNumber, mobilePhone);
        txtphoneNumber.sendKeys(mobilePhone);
    }

    public void validateScheduleSuccess(String messageValidation) {
        wait = new WebDriverWait(this.getDriver(), 30);
        wait.until(visibilityOfElementLocated(By.xpath("//div[@class='d-flex schedule-response-text']")));
        //waitOwn(50);
        assertEquals(messageValidation, lblValidationMessage.getText());
    }

    public void validateScheduleError(String messageErrorValidation) {
        assertEquals(messageErrorValidation, lblValidationErrorMessage.getText());
    }

    public void validateEmailError(String messageErrorValidation) {
        assertEquals(messageErrorValidation, lblValidationEmailErrorMessage.getText());
    }
}
