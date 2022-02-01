package my_first_package

/*b. Si alquilar una bicicleta tiene cierto valor y puede transportar dos personas, determine cuántas bicicletas
necesito y cuánto dinero voy a gastar en alquilarlas, para transportar a todos los estudiantes de la
universidad.*/


/*D.E
alquiler --> alquiler --> Int
estudiantes --> estudiantes --> Int
D.S
Gasto Total --> gastoTotal --> Int
* */

fun main(){

    var alquiler:Int=0
    var estudiantes:Int=0
    
    print("Ingrese el valor del alquiler de una Bici: ")
    alquiler= readLine()!!.toInt()
    print("Ingrese el número de estudiantes: ")
    estudiantes= readLine()!!.toInt()
    println("El gasto total es de: ${gasto_total(alquiler,estudiantes)}")
}

fun gasto_total(alquiler:Int,estudiantes:Int):Int{

    val bicicletas = estudiantes/2
    val gastoTotal = bicicletas*alquiler
    return gastoTotal
}
