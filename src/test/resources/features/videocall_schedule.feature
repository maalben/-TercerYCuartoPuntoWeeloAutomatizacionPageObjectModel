Feature: Realizar programacion de videollamadas en millionandup.com

  Description:
  Yo como automatizador de pruebas
  Necesito automatizar el flujo de programacion de videollamadas
  Para validar que se realice de manera exitosa

  Background:
    Given Yo Ingreso a la pagina de programacion de videollamadas millionandup


  @CP001
  Scenario: Validar agendamiento exitoso de videollamada
    When Yo desplazo el sitio hasta el final de la pagina
    And Yo presiono el boton para programar nueva videollamada
    And Yo presiono el boton del calendario
    And Yo agendo la videollamada en la fecha "22-02-2022"
    And Yo selecciono la hora de la videollamada "1 PM"
    And Yo selecciono la opcion de Zoom Call
    And Yo diligencio el email "pedro@correo.com"
    And Yo presiono el boton de programar presentacion
    And Yo diligencio el nombre "Pedro Pablo"
    And Yo diligencio el numero celular "3003121223"
    And Yo presiono el boton de programar presentacion
    Then Yo verifico que se muestre el mensaje "Your Project presentation was scheduled successfully. One of our agents will contact you shortly to provide details."


  @CP002
  Scenario: Validar mensaje de error al seleccionar fecha antes de la actual para agendar videollamada
    When Yo desplazo el sitio hasta el final de la pagina
    And Yo presiono el boton para programar nueva videollamada
    And Yo presiono el boton del calendario
    And Yo agendo la videollamada en la fecha "10-12-2021"
    And Yo selecciono la opcion de Zoom Call
    And Yo diligencio el email "pedro@correo.com"
    And Yo presiono el boton de programar presentacion
    Then Yo deberia ver el mensaje de error "Tour time is required"


  @CP003
  Scenario: Validar mensaje de error cuando no se diligencie el email para agendar videollamada
    When Yo desplazo el sitio hasta el final de la pagina
    And Yo presiono el boton para programar nueva videollamada
    And Yo presiono el boton del calendario
    And Yo agendo la videollamada en la fecha "15-01-2022"
    And Yo selecciono la hora de la videollamada "1 PM"
    And Yo selecciono la opcion de Zoom Call
    And Yo presiono el boton de programar presentacion
    Then Yo deberia ver el mensaje de error referente al email "Register to enter site"