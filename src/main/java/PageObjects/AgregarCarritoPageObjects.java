package PageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class AgregarCarritoPageObjects extends PageObject {

    By btnAddCart= By.xpath("//a[text()='Add to cart']");

    By lnkCarritoCompras= By.id("cartur");

    public By getLnkCarritoCompras() {
        return lnkCarritoCompras;
    }

    public By getBtnAddCart() {
        return btnAddCart;
    }
}
