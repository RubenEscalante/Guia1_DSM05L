fun Ejercicio1() {
    println("Ejercicio 1 - Saber si dos numeros son divisibles entre si\n")
    var num1 = 0
    var num2 = 0
    do{
        var validate = false
        try {
            println("Ingrese numero 1: ")
            num1 = readLine()!!.toInt()
            println("Ingrese numero 2: ")
            num2 = readLine()!!.toInt()
            validate = true
        }catch (e: NumberFormatException){
            print("\nSolamente ingrese numeros ${e.localizedMessage}\n")
        }
    }while (!validate)


    if(numDivisibles(num1, num2)) println("\nLos numeros $num1 y $num2 son divisibles") else println("No son divisibles")

    print("\nENTER para regresar al menu")
    readLine()

    return main()
}

private fun numDivisibles(num1: Int, num2: Int): Boolean {
    return (num1 % num2) == 0
}