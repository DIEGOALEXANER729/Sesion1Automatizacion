package com.spotify.stepsDefinitions;

import com.spotify.steps.LoginSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class ReproducirCancionStepsDefinitions {


    @Steps
    LoginSteps loginSteps;


    @Dado("que el usuario ingresa a la URL de Spotify")
    public void queElUsuarioIngresaALaURLDeSpotify() {

        loginSteps.abrirNavegador();

    }

    @Cuando("el usuario da click en iniciar sesion")
    public void elUsuarioDaClickEnIniciarSesion() {

    loginSteps.clicIniciarSesion();

    }
    @Cuando("ingresa las credeciales")
    public void ingresaLasCredeciales() {

    loginSteps.ingresarCredenciales();

    }
    @Cuando("da click en iniciar sesion")
    public void daClickEnIniciarSesion() {

    loginSteps.clicIniciarSesion();

    }
    @Cuando("el usuario hace click buscar")
    public void elUsuarioHaceClickBuscar() {



    }
    @Cuando("reproduce la cancion")
    public void reproduceLaCancion() {



    }
    @Entonces("se podra visualizar la cancion buscada")
    public void sePodraVisualizarLaCancionBuscada() {




    }

}
