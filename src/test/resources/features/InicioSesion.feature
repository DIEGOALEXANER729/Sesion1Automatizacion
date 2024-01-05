# language: es

Característica:  Inicio de sesion exitoso en Spotify
  Yo como usuario quiero  iniciar sesion en la pagina de Spotify

  @InicioSesion
  Escenario:  Inicio de sesion exitoso
    Dado que el usuario ingresa a la URL de Spotify
    Cuando el usuario da click en iniciar sesion
    Y ingresa las credeciales
    Y da click en iniciar sesion
    Entonces visualizara perfil


