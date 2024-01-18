package Step;

import PageObjects.InicioSesionPageObjects;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.openqa.selenium.Alert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class InicioSesionStep {

    InicioSesionPageObjects inicioSesionPageObjects= new InicioSesionPageObjects();


    @Step
    public void  abrirNavegador(){
        inicioSesionPageObjects.open();
    }

    @Step
    public void clickLogin() {
        inicioSesionPageObjects.getDriver().findElement(inicioSesionPageObjects.getLlblogin()).click();

    }

    @Step
    public void ingresarUserName(String nombre) {
        inicioSesionPageObjects.getDriver().findElement(inicioSesionPageObjects.getTxtUserName()).sendKeys(nombre);

    }

    @Step
    public void ingresarPassword(String clave) {
        inicioSesionPageObjects.getDriver().findElement(inicioSesionPageObjects.getTxtPassword()).sendKeys(clave);

    }

    @Step
    public void clickBoton() {
        inicioSesionPageObjects.getDriver().findElement(inicioSesionPageObjects.getBtnLogin()).click();

    }

    @Step
    public void validarMensaje() throws InterruptedException {
        assertThat(inicioSesionPageObjects.getDriver().findElement(inicioSesionPageObjects.getMsjCategories()).isDisplayed(), Matchers.is(true));

    }



    @Step
    public void clicLink() throws InterruptedException {
        Thread.sleep(10000);
        inicioSesionPageObjects.getDriver().findElement(inicioSesionPageObjects.getLnkCelular()).click();

    }
}
