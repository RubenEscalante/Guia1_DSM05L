fun Ejercicio3() {
    println("Ejercicio 3 - Calcular cuandos pares e impares hay\n")
    var pares = 0
    var impares = 0
    val arreglonumeros = ArrayList<Int>()
    var cantidadnumeros = 0
    do {
        var validate = false
        try {
            println("Ingrese cuantos numeros seran analizados")
            cantidadnumeros = readLine()!!.toInt()
            if (cantidadnumeros < 1){ println("\nIngrese numeros mayores que 0"); continue}
            validate = true
        } catch (e: NumberFormatException) {
            print("\nSolamente ingrese numeros ${e.localizedMessage}\n")
        }
    } while (!validate)

    for (i in 0 until cantidadnumeros) {
        do {
            var validate = false
            try {
                println("Ingrese numero " + (i + 1))
                arreglonumeros.add(readLine()!!.toInt())
                validate = true
            } catch (e: NumberFormatException) {
                print("\nSolamente ingrese numeros ${e.localizedMessage}\n")
            }
        } while (!validate)
    }

    for (i in arreglonumeros) {
        if (i % 2 == 0) pares++ else impares++
    }
    println("\nCantidad de numeros pares $pares")
    println("Cantidad de numeros impares $impares")

    print("\nENTER para regresar al menu")
    readLine()

    return main()
}

