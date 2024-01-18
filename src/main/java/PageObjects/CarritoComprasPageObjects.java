package PageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CarritoComprasPageObjects extends PageObject {

    By bntPlaceOrder = By.xpath("//button[text()='Place Order']");
    By txtName = By.id("name");

    By txtCountry = By.id("country");

    By txtCity = By.id("city");


    By txtCard = By.id("card");

    By txtMonth = By.id("month");

    By txtYear = By.id("year");

    By btnPurchase = By.xpath("//button[text()='Purchase']");

    By MensajeCompra = By.xpath("//h2[text()='Thank you for your purchase!']");

    By btnOk = By.xpath("//button[text()='OK']");


    public By getTxtCity() {
        return txtCity;
    }

    public By getTxtName() {
        return txtName;
    }

    public By getTxtCountry() {
        return txtCountry;
    }

    public By getTxtCard() {
        return txtCard;
    }

    public By getTxtYear() {
        return txtYear;
    }

    public By getBtnPurchase() {
        return btnPurchase;
    }

    public By getBntPlaceOrder() {
        return bntPlaceOrder;
    }

    public By getTxtMonth() {
        return txtMonth;
    }

    public By getBtnOk() {
        return btnOk;
    }

    public By getMensajeCompra() {
        return MensajeCompra;
    }
}
