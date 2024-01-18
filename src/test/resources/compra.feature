#language: es
Característica: Realizar compra

Antecedentes:
Escenario:inicio de sesion
Dado que el usuario esta en la pagina de inicio
Cuando da clic en la opcion iniciar sesion
Y escribe las cedenciales
| usuario   | clave     |
| Cinthia123 | Zeus123 |
Entonces el usuario podra ver el incio de la sesion exitasamente


@Compra
Escenario: realizar compra de producto
Cuando selecciono el producto adicionandolo al carrito de compras
Y completo la informacion de compra
Entonces visualizo el mensaje de compra exitoso