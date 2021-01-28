fun main() {
    var itemsmenu = 0;
    loop@ do {
        println("\n1. Ejercicio 1")
        println("2. Ejercicio 2")
        println("3. Ejercicio 3")
        println("4. Ejercicio 4")
        println("5. Salir")
        println("\nIngrese una opcion del menu: ")
        try {
            itemsmenu = readLine()!!.toInt();
        } catch (e: NumberFormatException) {
            print("\nSolamente ingrese numeros ${e.localizedMessage}\n")
            continue@loop
        }
        when (itemsmenu) {
            1 -> Ejercicio1()
            2 -> Ejercicio2()
            3 -> Ejercicio3()
            4 -> Ejercicio4()
            5 -> break@loop
        }
    } while (itemsmenu !in 1..5);
}

