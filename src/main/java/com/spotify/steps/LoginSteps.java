package com.spotify.steps;

import com.spotify.PageObject.LoginPageObject;
import net.thucydides.core.annotations.Step;

public class LoginSteps {

    LoginPageObject login = new LoginPageObject();

    @Step("que el usuario ingresa a la URL de Spotify")
    public void abrirNavegador(){
        login.open();
    }

    @Step("el usuario da click en iniciar sesion")
    public void clicIniciarSesion(){
        login.getDriver().findElement(login.getBtnIniciarSesion()).click();

    }

    @Step("ingresa las credeciales")
    public void ingresarCredenciales(){
        login.getDriver().findElement(login.getTxtEmail()).clear();
        login.getDriver().findElement(login.getTxtEmail()).sendKeys("diegoa.ipialeso@uqvirtual.edu.co");
        login.getDriver().findElement(login.getTxtPassword()).clear();
        login.getDriver().findElement(login.getTxtPassword()).sendKeys("Alexaner1902.");

    }

    @Step("da click en iniciar sesion")
    public void clicInicioSesionLogin(){
        login.getDriver().findElement(login.getBtnInicioSesion()).click();

    }






}
