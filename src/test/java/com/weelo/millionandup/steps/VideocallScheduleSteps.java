package com.weelo.millionandup.steps;

import com.weelo.millionandup.pageobject.VideocallPageObject;
import net.thucydides.core.annotations.Step;
import java.text.ParseException;

public class VideocallScheduleSteps {

    VideocallPageObject videocallPageObject;

    @Step
    public void openBrowser() {
        videocallPageObject.open();
    }

    @Step
    public void movePagFinal() {
        videocallPageObject.goFinalSite();
    }

    @Step
    public void scheduleVideocall() {
        videocallPageObject.pressButtonScheduleVideocall();
    }

    @Step
    public void openCalendar() {
        videocallPageObject.pressButtonCalendar();
    }

    @Step
    public void selectDate(String dateVideocall) throws ParseException {
        videocallPageObject.selectScheduleDateVideocall(dateVideocall);
    }

    @Step
    public void selectTime(String timeVideocall) {
        videocallPageObject.selectScheduleTimeVideocall(timeVideocall);
    }

    @Step
    public void selectZoomCall() {
        videocallPageObject.pressButtonZoomCall();
    }

    @Step
    public void writeEmail(String email) {
        videocallPageObject.sendEmail(email);
    }

    @Step
    public void acceptSchedule() {
        videocallPageObject.pressButtonAcceptSchedule();
    }

    @Step
    public void writeName(String name) {
        videocallPageObject.sendName(name);
    }

    @Step
    public void writePhoneNumber(String mobilePhone) {
        videocallPageObject.sendPhoneNumber(mobilePhone);
    }

    @Step
    public void validationMessageSuccess(String messageValidation) {
        videocallPageObject.validateScheduleSuccess(messageValidation);
    }

    @Step
    public void validationMessageError(String messageErrorValidation) {
        videocallPageObject.validateScheduleError(messageErrorValidation);
    }

    @Step
    public void validationMessageEmailError(String messageErrorEmail) {
        videocallPageObject.validateEmailError(messageErrorEmail);
    }
}
