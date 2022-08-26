fun <T> numeroDeApariciones(objeto: T, lista: List<T>): Int{
    val x: T
    return lista.count{it == objeto}
}

val  <T> List<T>.penultimo: T
    get() = this[size -2]