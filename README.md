# CDVS-LAB03
# Autores:
 - Edwin Yesid Rodriguez Maldonado
 - Henry Alejandro Sanchez Arevalo
## Comado para ejecutar las pruebas
'mvn test'

# Preguntas Laboratorio 3

- De acuerdo con lo indicado, y teniendo en cuenta que NO hay precondiciones, en qué casos se debería arrojar una excepción de tipo ExcepcionParametrosInvalidos?. Agregue esto a la especificación.
Deberia arrojar excepcion cuando:
1.	Se ingrese una edad invalida.
2.	Los días de antelacion sean invalidos.
3. Valor de la tarifa sea invalido.

- En la siguiente tabla enumere un conjunto de clases de equivalencia que -según usted- creen una
buena división del conjunto de datos de entrada de la función anterior:
# Tabla de conjuntos de equivalencia

|Número	|Clase de equivalencia (en lenguaje natural o matemático).|	Resultado correcto / incorrecto.|
|-----|-----|-----|
|1|	Que la edad este entre 1-17 y los dias de antelacion sean menores a 20 y la tarifa sea mayor a 1.|	Correcto con descuento del 5%|
|2|	Que la edad sea menor a 1 o mayor a 122 o los dias de antelacion sean menores a 1 o la tarifa sea menor a 1.| 	Incorrecto|
|3|	Que la edad este entre 18-65  y los dias de antelacion esten entre 1-20 y la tarifa sea mayor a 1.|	Correcto sin descuento.|
|4|	Que la edad 66-122 y los dias de antelacion esten entre 1-20 y la tarifa sea mayor a 1.|	Correcto con descuento de 8%|
|5|	Que la edad este entre 1-18 y los dias de antelacion sean mayores  a 20 y la tarifa sea mayor a 1.|	Correcto, con descuento de 20%|
|6|	Que la edad este entre 18-65 y los dias de antelacion sean mayores  a 20 y la tarifa sea mayor a 1.|	Correcto con descuento de 15%|
|7|	Que la edad este entre 66-122 y los dias de antelacion sean mayores  a 20 y la tarifa sea mayor a 1.|	Correcto con descuento de 23%.|

- Para cada clase de equivalencia, defina un caso de prueba específico, definiendo: parámetros de
entrada y resultados esperados.
Parametros de entrada:
# Tabla casos de prueba especificos
|Numero|	Edad|	Dias de antelacion|	Tarifa|
|-----|-----|-----|-----|
|1|	17|	19|	2000000|
|2	|0	|-1	|0|
|3	|18|	19|	1|
|4|	66|	1|	2000000|
|5|	1|	21|	2000000|
|6|	65|	21|	2000000|
|7|121|	21|	2000000|

# Resultados:
|Numero|	Resultado|
|-----|-----|
|1|	1900000|
|2|	Invalido|
|3|	1|
|4|	1840000|
|5|	1600000|
|6|	1700000|
|7|	1540000|


- A partir de las clases de equivalencia identificadas en el punto 2, identifique las condiciones límite o
de frontera de las mismas.
1.	Condiciones limite:                    
Edad : -1,0,1,17,18,19 – Dias: 19,20,21 – Tarifa: -1,0,1. 
2.	Condiciones limite:                   
	Edad: -1,0,1,121,122,123 – Dias: -1,0,1 – Tarifa: -1,0,1. 
3.	Condiciones limite:                      
	Edad: 17,18,19,64,65,66 – Dias: 0,1,19,20,21 – Tarifa:-1,0,1. 
4.	Condiciones limite:                     
	 Edad:64,65,66,121,122,123 – Dias: 0,1,19,20,21– Tarifa:-1,0,1. 
5.	Condiciones limite:                     
	Edad: -1,0,1,17,18,19 – Dias: 19,20,21– Tarifa:-1,0,1. 
6.	Condiciones limite:                     
	Edad:17,18,19,64,65,66 – Dias: 19,20,21– Tarifa:-1,0,1. 
7.	Condiciones limite:                     
	Edad: 64,65,66,121,122,123 – Dias: 19,20,21– Tarifa:-1,0,1. 

-	Para cada una de las condiciones de frontera anteriores, defina casos de prueba específicos
# Casos de prueba
|Numero|Edad|Dias de antelacion|Tarifa|
|-----|-----|-----|-----|
|1|-1|19|-1|
|2|0|0|0|
|3|18|19|1|
|4|66|21|1|
|5|19|20|0|
|6|64|19|1|
|7|121|21|1|

# Resultados:
|Numero|	Resultado|
|-----|-----|
|1|	Invalido por edad y tarifa negativa|
|2|	Invalido por edad, dias y tarifa en cero.|
|3|	1|
|4|	0.77|
|5|	Invalido por tarifa 0|
|6|	1|
|7|	0.77|

