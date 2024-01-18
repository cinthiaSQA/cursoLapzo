package PageObjects;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.demoblaze.com/index.html")
public class InicioSesionPageObjects extends PageObject {

    By llblogin = By.id("login2");
    By txtUserName = By.id("loginusername");

    By txtPassword = By.id("loginpassword");

    By btnLogin = By.xpath("//button[text()='Log in']");

    By msjCategories=By.id("cat");

    By lnkCelular= By.xpath("//h4/a[contains(.,'Samsung galaxy s6')]");

    public By getLnkCelular() {
        return lnkCelular;
    }

    public By getMsjCategories() {
        return msjCategories;
    }

    public By getLlblogin() {
        return llblogin;
    }

    public By getTxtUserName() {
        return txtUserName;
    }

    public By getTxtPassword() {
        return txtPassword;
    }

    public By getBtnLogin() {
        return btnLogin;
    }
}
