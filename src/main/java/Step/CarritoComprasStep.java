package Step;

import PageObjects.CarritoComprasPageObjects;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;

import static org.junit.Assert.assertThat;

public class CarritoComprasStep {

     CarritoComprasPageObjects carritoComprasPageObjects= new CarritoComprasPageObjects();
    @Step
    public void  clickPlaceOrder(){
        carritoComprasPageObjects.getDriver().findElement(carritoComprasPageObjects.getBntPlaceOrder()).click();
    }

    @Step
    public void ingresarName() {
        carritoComprasPageObjects.getDriver().findElement(carritoComprasPageObjects.getTxtName()).sendKeys("Cinthia");

    }

    @Step
    public void ingresarCountry() {
        carritoComprasPageObjects.getDriver().findElement(carritoComprasPageObjects.getTxtCountry()).sendKeys("Colombia");

    }

    @Step
    public void ingresarCity() {
        carritoComprasPageObjects.getDriver().findElement(carritoComprasPageObjects.getTxtCity()).sendKeys("Medellin");

    }

    @Step
    public void ingresarCard() {
        carritoComprasPageObjects.getDriver().findElement(carritoComprasPageObjects.getTxtCard()).sendKeys("123456978");

    }
    @Step
    public void ingresarMonth() {
        carritoComprasPageObjects.getDriver().findElement(carritoComprasPageObjects.getTxtMonth()).sendKeys("Enero");

    }
    @Step
    public void ingresarYear() {
        carritoComprasPageObjects.getDriver().findElement(carritoComprasPageObjects.getTxtYear()).sendKeys("2024");

    }
    @Step
    public void clickPurchase() {
        carritoComprasPageObjects.getDriver().findElement(carritoComprasPageObjects.getBtnPurchase()).click();

    }

    @Step
    public void validarMensajeCompra() throws InterruptedException {
        assertThat(carritoComprasPageObjects.getDriver().findElement(carritoComprasPageObjects.getMensajeCompra()).isDisplayed(), Matchers.is(true));
        Thread.sleep(5000);
    }


    @Step
    public void clickOk() throws InterruptedException {
        carritoComprasPageObjects.getDriver().findElement(carritoComprasPageObjects.getBtnOk()).click();
        Thread.sleep(5000);
    }


}
