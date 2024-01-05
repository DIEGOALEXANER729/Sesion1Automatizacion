package com.spotify.PageObject;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
@DefaultUrl("https://open.spotify.com/")
public class LoginPageObject extends PageObject {

    By btnInicioSesion = By.xpath("//span[@class=\"ButtonInner-sc-14ud5tc-0 bzuYkS encore-inverted-light-set\"]");
    By txtEmail = By.id("login-username");
    By txtPassword = By.id("login-password");
    By btnIniciarSesion = By.xpath("//span[@class=\"ButtonInner-sc-14ud5tc-0 cJdEzG encore-bright-accent-set\"]");

    public By getBtnInicioSesion() {
        return btnInicioSesion;
    }

    public By getTxtEmail() {
        return txtEmail;
    }

    public By getTxtPassword() {
        return txtPassword;
    }

    public By getBtnIniciarSesion() {
        return btnIniciarSesion;
    }
}
