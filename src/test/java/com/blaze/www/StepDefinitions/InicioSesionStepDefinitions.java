package com.blaze.www.StepDefinitions;

import Models.Datos;
import Step.InicioSesionStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class InicioSesionStepDefinitions {

    @Steps
    InicioSesionStep inicioSesionStep;

    @Dado("^que el usuario esta en la pagina de inicio$")
    public void queElUsuarioEstaEnLaPaginaDeInicio() {
        inicioSesionStep.abrirNavegador();

    }

    @Cuando("^da clic en la opcion iniciar sesion$")
    public void daClicEnLaOpcionIniciarSesion() {
        inicioSesionStep.clickLogin();

    }

    @Cuando("^escribe las cedenciales$")
    public void escribeLasCedenciales(List <Datos> datos ) {
        inicioSesionStep.ingresarUserName(datos.get(0).getUsuario());
        inicioSesionStep.ingresarPassword(datos.get(0).getClave());
        inicioSesionStep.clickBoton();

    }

    @Entonces("^el usuario podra ver el incio de la sesion exitasamente$")
    public void elUsuarioPodraVerElIncioDeLaSesionExitasamente() throws InterruptedException {
        inicioSesionStep.validarMensaje();

    }
}
