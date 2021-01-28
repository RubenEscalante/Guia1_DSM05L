fun Ejercicio2() {
    println("Ejercicio 2 - Solicitar 10 notas de alumno\n")
    val notasArray = IntArray(10)
    var notasmenores = 0
    var notasmayores = 0
    var i = 0
    while (i < 10) {
        try {
            println("Ingrese nota " + (i + 1) + ": ")
            notasArray[i] = readLine()!!.toInt()
        } catch (e: NumberFormatException) {
            print("\nSolamente ingrese numeros ${e.localizedMessage}\n")
            continue
        }

        if (notasArray[i] in 7..10) notasmayores++
        if (notasArray[i] in 0..6) notasmenores++
        if (notasArray[i] !in 0..10) {
            println("\nEl valor debe estar entre 0 y 10")
            continue
        }
        i++
    }
    println(" $notasmayores alumnos tienen notas mayores a 7")
    println(" $notasmenores alumnos tienen notas menores a 7")
    print("\nENTER para regresar al menu")
    readLine()
    return main()
}