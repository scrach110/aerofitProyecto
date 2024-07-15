### Ideas del proyecto

- Simula una aerolinia llamada "AeroFit"
- Preparada para recibir multiples hilos, ejecutando a 5 de forma simultanea.
- Lenguaje principal: Java
- En la base de datos están predefinidos los vuelos con los siguientes IDs: 2001, 2313, 69.
.Capacidad de vuelo con ID: 2001 es 100.
.Capacidad de vuelo con ID: 2313 es 15.
.Capacidad de vuelo con ID:  69 es 14.


####Ejemplos de request en PostMan:

```javascript
GET: http://localhost:8080/aerofit/infoVuelo/{idVuelo}
//Retorna la informacion del vuelo del ID pertinente

PUT: http://localhost:8080/aerofit/procesarCompra
//Se intenta una compra, un ejemplo del Json podria ser:

{
    "idVuelo": 2001,
    "nombreApellido": "Peter Capusotto",
    "cantidadPasajes": 9
}
//Se necesitan los parametros "idVuelo","nombreApellido" y "cantidadPasajes" 
//de forma obligatoria, donde idVuelo es un Int, nombreApellido un String, y 
//cantidadPasajes un Int.
//EL resultado de la compra se muestra en pantalla como un String, siendo:
// "La compra se ha procesado con exito" si la compra fué exitosa.
//"La compra no es valida, capacidad insuficiente." si la compra no se pudo procesar.
```

####Ejemplos de request en Jmetter

- Se puede probar con 100 hilos si así se quisiera.
.Parar hacer un GET seria:


```javascript
Nombre de servidor o IP: localhost 
Puerto: 8080
Peticion HTTP: GET
Ruta: aerofit/infoVuelo/{idDeVuelo}
```

.Para hacer un PUT seria:
```javascript
Nombre de servidor o IP: localhost 
Puerto: 8080
Peticion HTTP: PUT
Ruta: aerofit/procesarCompra

Ejemplos de Json en el apartado body Data:
{
   "idVuelo": 2313,
    "nombreApellido": "Di Maria",
    "cantidadPasajes": 2
}
```
