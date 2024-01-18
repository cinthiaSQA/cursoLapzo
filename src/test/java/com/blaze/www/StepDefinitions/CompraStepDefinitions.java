package com.blaze.www.StepDefinitions;

import Step.AgregarCarritoStep;
import Step.CarritoComprasStep;
import Step.InicioSesionStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.thucydides.core.annotations.Steps;

public class CompraStepDefinitions {

    @Steps
    InicioSesionStep inicioSesionStep;
    @Steps
    AgregarCarritoStep agregarCarritoStep;

    @Steps
    CarritoComprasStep carritoComprasStep;

    @Cuando("^selecciono el producto adicionandolo al carrito de compras$")
    public void seleccionoElProductoAdicionandoloAlCarritoDeCompras() throws InterruptedException {
        inicioSesionStep.abrirNavegador();
        inicioSesionStep.clicLink();
        agregarCarritoStep.clicBtnAdd();
        agregarCarritoStep.clicAlerta();
        agregarCarritoStep.cLicCarritoCompra();
    }

    @Y("^completo la informacion de compra$")
    public void completoLaInformacionDeCompra() {
        carritoComprasStep.clickPlaceOrder();
        carritoComprasStep.ingresarName();
        carritoComprasStep.ingresarCountry();
        carritoComprasStep.ingresarCity();
        carritoComprasStep.ingresarCard();
        carritoComprasStep.ingresarMonth();
        carritoComprasStep.ingresarYear();
        carritoComprasStep.clickPurchase();



    }

    @Entonces("^visualizo el mensaje de compra exitoso$")
    public void visualizoElMensajeDeCompraExitoso() throws InterruptedException {
        carritoComprasStep.validarMensajeCompra();
        carritoComprasStep.clickOk();


    }

}


