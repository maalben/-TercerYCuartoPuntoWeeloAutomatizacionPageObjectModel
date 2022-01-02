package com.weelo.millionandup.definitions;

import com.weelo.millionandup.steps.VideocallScheduleSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import java.text.ParseException;

public class VideocallScheduleDefinitions {

    @Steps
    VideocallScheduleSteps start;

    @Given("^Yo Ingreso a la pagina de programacion de videollamadas millionandup$")
    public void yoIngresoALaPaginaDeProgramacionDeVideollamadasMillionandup() {
        start.openBrowser();
    }

    @When("^Yo desplazo el sitio hasta el final de la pagina$")
    public void yoDesplazoElSitioHastaElFinalDeLaPagina() {
        start.movePagFinal();
    }

    @When("^Yo presiono el boton para programar nueva videollamada$")
    public void yoPresionoElBotonParaProgramarNuevaVideollamada() {
        start.scheduleVideocall();
    }

    @When("^Yo presiono el boton del calendario$")
    public void yoPresionoElBotonDelCalendario() {
        start.openCalendar();
    }

    @When("^Yo agendo la videollamada en la fecha \"([^\"]*)\"$")
    public void yoAgendoLaVideollamadaEnLaFecha(String dateVideocall) throws ParseException {
        start.selectDate(dateVideocall);
    }

    @When("^Yo selecciono la hora de la videollamada \"([^\"]*)\"$")
    public void yoSeleccionoLaHoraDeLaVideollamada(String timeVideocall) {
        start.selectTime(timeVideocall);
    }

    @When("^Yo selecciono la opcion de Zoom Call$")
    public void yoSeleccionoLaOpcionDeZoomCall() {
        start.selectZoomCall();
    }

    @When("^Yo diligencio el email \"([^\"]*)\"$")
    public void yoDiligencioElEmail(String email) {
        start.writeEmail(email);
    }

    @When("^Yo presiono el boton de programar presentacion$")
    public void yoPresionoElBotonDeProgramarPresentacion() {
        start.acceptSchedule();
    }

    @When("^Yo diligencio el nombre \"([^\"]*)\"$")
    public void yoDiligencioElNombre(String name) {
        start.writeName(name);
    }

    @When("^Yo diligencio el numero celular \"([^\"]*)\"$")
    public void yoDiligencioElNumeroCelular(String mobilePhone) {
        start.writePhoneNumber(mobilePhone);
    }

    @Then("^Yo verifico que se muestre el mensaje \"([^\"]*)\"$")
    public void yoVerificoQueSeMuestreElMensaje(String messageValidation) {
        start.validationMessageSuccess(messageValidation);
    }

    @Then("^Yo deberia ver el mensaje de error \"([^\"]*)\"$")
    public void yoDeberiaVerElMensajeDeError(String messageErrorValidation) {
        start.validationMessageError(messageErrorValidation);
    }

    @Then("^Yo deberia ver el mensaje de error referente al email \"([^\"]*)\"$")
    public void yoDeberiaVerElMensajeDeErrorReferenteAlEmail(String messageErrorEmail) {
        start.validationMessageEmailError(messageErrorEmail);
    }

}
