# language: es


Característica:  Reproducir  una cancion de Spotify
  Yo como usuario quiero  buscar una cancion en Spotify y reproducirla

  @Reproducir
  Antecedentes: Inicio de sesion
    Dado que el usuario ingresa a la URL de Spotify
    Cuando el usuario da click en iniciar sesion
    Y ingresa las credeciales
    Y da click en iniciar sesion

  Escenario:  Reproduccion de cancion exitosa
    Cuando el usuario hace click buscar
    Y reproduce la cancion
    Entonces se podra visualizar la cancion buscada