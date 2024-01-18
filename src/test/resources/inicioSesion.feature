#language: es

Característica: iniciar sesion


@inicioSesion
Escenario:inicio de sesion
Dado que el usuario esta en la pagina de inicio
Cuando da clic en la opcion iniciar sesion
Y escribe las cedenciales
| usuario   | clave     |
| Cinthia123 | Zeus123 |
Entonces el usuario podra ver el incio de la sesion exitasamente
