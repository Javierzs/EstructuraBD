package my_first_package

fun main(){
    val s = Math.sqrt(Math.pow((5.0-4.0),2.0)/(3.0-1))

    //a. Realice una función que halle el área de un triángulo

    val base=0
    val altura=0
    val a = (base*altura)/2

    /*b. Si alquilar una bicicleta tiene cierto valor y puede transportar dos personas, determine cuántas bicicletas
necesito y cuánto dinero voy a gastar en alquilarlas, para transportar a todos los estudiantes de la
universidad.*/

    val alquiler=0
    val estudiantes=0

    val bicicletas = (estudiantes/2)
    val gastoTotal = bicicletas * alquiler


    /*c. Según el DANE, el número de desempleados corresponde al 8.15% de la población activa. Escriba una función
que permita determinar cuántas personas desempleadas hay actualmente en Colombia*/

    val poblacion=50374500
    val desempleo = poblacion * (8.15/100)

    //d. Se desea determinar cuántos dólares se puede adquirir con cierta cantidad de pesos colombianos.

    val cop=0
    val trm=3987

    val dolares = cop/trm

    /*e. Una empresa que contrata personal requiere determinar la edad de las personas que solicitan trabajo, pero
cuando se les realiza la entrevista sólo se les pregunta el año en que nacieron. Realice el algoritmo para
solucionar este problem.*/

    val anoNacimiento=0
    val anoActual=2022
    val edad = anoActual - anoNacimiento

    /* f. Un estacionamiento requiere determinar el cobro que debe aplicar a las personas que lo utilizan. Considere
que el cobro es con base en las horas que lo disponen y que las fracciones de hora se toman como completas y
realice una función que permita determinar el cobro.*/

    val baseHoras=0
    val tarifaHora=0

    val cobroEstacionamiento = baseHoras * tarifaHora

    /* g. Pinturas “La brocha gorda” requiere determinar cuánto cobrar por trabajos de pintura. Considere que se
cobra por m2 y realice una funciòn que le permita saber cuánto cobrar a un cliente.*/

    val areaPintada=0
    val preciom2=0
    val cobroPinturas = areaPintada * preciom2

    /* h. Se requiere determinar el tiempo que tarda una persona en llegar de una ciudad a otra en bicicleta,
considerando que lleva una velocidad constante. Realice una función para tal fin.*/

    val velocidad=100
    val distancia=0
    val tiempo=distancia/velocidad

    /* i. Realice un algoritmo para determinar cuánto pagará finalmente una persona por un artículo equis,
considerando que tiene un descuento de 5%, y debe pagar 19% de IVA (debe retornar el precio con descuento
y el precio final).*/

    val descuento=5
    val iva = 19
    val precioBase=100
    val pagar = precioBase + (precioBase * (descuento / 100)) + (precioBase * (iva / 100))

    /* j. Realice una función para determinar la nota final que obtendrá un alumno considerando que realiza
    tres exámenes, de los cuales el primero y el segundo tienen una ponderación de 25%, mientras que el
    tercero de 50%.*/

    val examen1=0
    val examen2=0
    val examen3=0

    val nota = (examen1*(25/100))+(examen2*(25/100))+(examen3*(50/100))

    /* k. Se tiene el nombre y la edad de tres personas. Se desea saber el nombre y la edad de la persona
    de menor edad.*/

    val nombre1="pepito"
    val edad1=10

    val nombre2="andres"
    val edad2=20

    val nombre3="felipe"
    val edad3=30

    var mayorEdad=0
    var mayorNombre=""

    if (edad3>edad2 && edad3>edad1){
        mayorEdad=edad3
        mayorNombre=nombre1
    } else if (edad2>edad3 && edad2>edad1){
        mayorEdad=edad2
        mayorNombre=nombre2
    } else if (edad1>edad3 && edad1>edad2){
        mayorEdad=edad1
        mayorNombre=nombre3
    }

    /* l. El presidente de la república ha decidido estimular a todos los estudiantes de una universidad mediante
    la asignación de becas mensuales, para esto se tomarán en consideración los siguientes criterios: Para alumnos
    mayores de 18 años con promedio mayor o igual a 90, la beca será de $2000.00; con promedio mayor o igual a 75,
    de$1000.00; para los promedios menores de 75 pero mayores o iguales a 60, de $500.00; a los demás se les enviará
    una carta de invitación incitándolos a que estudien más en el próximo ciclo escolar. A los alumnos de 18 años o
    menores de esta edad, con promedios mayores o iguales a 90, se les dará $3000; con promedios menores a 90
    pero mayores o iguales a 80, $2000; para los alumnos con promedios menores a 80 pero mayores o iguales a 60,
    se les dará $100, y a los alumnos que tengan promedios menores a 6 se les enviará carta de invitación.
    Realice la función correspondiente.*/

    val edadAlumno=0
    val promedio=0
    var beca=0

    if (edadAlumno>18){
        if (promedio>=90){beca=2000
        } else if (promedio >=75){beca=1000
        } else if (promedio>=60 && promedio<75) {beca = 500
        } else println("se les enviará una carta de invitación incitándolos a que estudien más en el próximo ciclo escolar")
    } else {
        if (promedio>=90){beca=3000
        } else if (promedio >=80 && promedio<90){beca=2000
        } else if (promedio>=60 && promedio<80) {beca = 100
        } else if (promedio<6){println("se les enviará una carta de invitación incitándolos a que estudien más en el " +
                "próximo ciclo escolar")}
    }

    // m. Escriba una función que halle el volumen de un cono

    val radio = 0.0
    val v = 1/3 * altura * Math.PI * (Math.pow(radio,2.0))

    /* n. En la universidad vamos a conectar los diversos computadores que hay en una sala de cómputo con cables.
    Se necesita un cable para conectar dos computadores, y debe haber conexión entre todos los computadores.
    Escriba una función que determine el número de cables a comprar a partir del número de computadores que hay
    en la sala. */

    val computadores=10.0
    val cables = Math.round((computadores/2))

    /* O. Se sabe que una batería de celular contamina 175 litros de agua. ¿Cuántos litros de agua serán
    contaminados por la población de una ciudad en un año si cada persona utiliza 2 baterías al semestre?*/

    val numeroPersonas=0
    val bateriaContamina=175
    val bateriaPersona=2*2

    val ContaminaPoblación = numeroPersonas * bateriaPersona * bateriaContamina

    /* p. Mi proveedor de Internet me asegura que mi conexión es de 4 megabytes por segundo. Escriba una función
    que permita determinar cuántos minutos y segundos debo esperar para descargar la última película de La Mujer
    Maravilla.*/

    val velInternet=4.0
    val pesoPelicula=0.0

    val tiempoDescarga = pesoPelicula/velInternet

    val minutosDescarga = Math.round(tiempoDescarga / 60)
    println(minutosDescarga.toString() + "minutos")

    val segundosDescarga = tiempoDescarga % 60
    println(segundosDescarga.toString() + "segundos")


    /* q. El valor presente de un cierto capital de dinero C a una tasa de interés de durante años se encuentra
    a partir de la fórmula:

    Escriba una función que determine el valor presente a partir de los datos de entrada dados.*/

    val vp=0
    val n=0.0
    val t=0.0

    val c = vp * (Math.pow((1+t),n))

}
