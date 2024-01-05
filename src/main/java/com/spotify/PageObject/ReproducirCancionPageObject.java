package com.spotify.PageObject;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ReproducirCancionPageObject extends PageObject {

    By btnBuscar = By.xpath("//a[@class=\"link-subtle UYeKN11KAw61rZoyjcgZ\"]");
    By txtBuscar = By.xpath("//input[@class=\"Type__TypeElement-sc-goli3j-0 ieTwfQ QO9loc33XC50mMRUCIvf\"]");

    By btnCancion = By.xpath("(//a[@class=\"t_yrXoUO3qGsJS4Y6iXX\"])[1]");
    By txtValidarCancion = By.xpath("(//span/a[contains(text(),\"Fuego del Olvido - (Versión Original)\")])[1]");

    public By getBtnBuscar() {
        return btnBuscar;
    }

    public By getTxtBuscar() {
        return txtBuscar;
    }

    public By getBtnCancion() {
        return btnCancion;
    }

    public By getTxtValidarCancion() {
        return txtValidarCancion;
    }
}
