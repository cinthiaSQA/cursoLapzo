package Step;

import PageObjects.AgregarCarritoPageObjects;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.Alert;

public class AgregarCarritoStep {

    AgregarCarritoPageObjects agregarCarritoPageObjects = new AgregarCarritoPageObjects();

    @Step
    public void  clicBtnAdd(){
        agregarCarritoPageObjects.getDriver().findElement(agregarCarritoPageObjects.getBtnAddCart()).click();
    }

    @Step
     public void clicAlerta() throws InterruptedException {
        Thread.sleep(5000);
        Alert alert = agregarCarritoPageObjects.getDriver().switchTo().alert();
        alert.accept();

    }

    @Step
    public void cLicCarritoCompra(){
        agregarCarritoPageObjects.getDriver().findElement(agregarCarritoPageObjects.getLnkCarritoCompras()).click();

    }


}
