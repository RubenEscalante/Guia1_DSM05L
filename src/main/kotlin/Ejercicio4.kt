fun Ejercicio4() {
    println("Ejercicio 4 - Ingresar Coordenadas\n")
    var cuad1 = 0;
    var cuad2 = 0;
    var cuad3 = 0;
    var cuad4 = 0;
    var x = 0;
    var y = 0;
    var cant = 0

    do {
        var validate = false
        try {
            println("Ingrese la cantidad de puntos que procesara: ")
            cant = readLine()!!.toInt()
            if (cant < 1) {
                println("\nIngrese numeros mayores que 0")
                continue
            }
            validate = true
        } catch (e: NumberFormatException) {
            print("\nSolamente ingrese numeros ${e.localizedMessage}\n")
        }
    } while (!validate)

    for (i in 1..cant) {
        do {
            var validate = false
            try {
                print("\nIngrese coordenada en X$i: ")
                x = readLine()!!.toInt()
                print("Ingrese coordenada en Y$i: ")
                y = readLine()!!.toInt()
                validate = true
            } catch (e: NumberFormatException) {
                print("\nSolamente ingrese numeros ${e.localizedMessage}\n")
            }

        } while (!validate)

        if (x > 0 && y > 0) cuad1++
        if (x < 0 && y > 0) cuad2++
        if (x < 0 && y < 0) cuad3++
        if (x > 0 && y < 0) cuad4++
    }
    println("\nCantidad de puntos ingresados en el primer cuadrante: $cuad1")
    println("Cantidad de puntos ingresados en el segundo cuadrante: $cuad2")
    println("Cantidad de puntos ingresados en el tercer cuadrante: $cuad3")
    println("Cantidad de puntos ingresados en el cuarto cuadrante: $cuad4")

    print("\nENTER para regresar al menu")
    readLine()
    return main()
}