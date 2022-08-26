fun main (){
   val mesaTipo1 = Mesa("Futuro", Dimension(1.8, 2.1, 1.5))
   val mesaTipo2 = Mesa("Brisa", Dimension(2.5, 2.5, 1.7))
   val sofaTipo1 = Sofa( "Praga", 3, Dimension(6.1, 1.8, 1.6))
   val sofaTipo2 = Sofa( "Lisboa", 4, Dimension(6.1, 1.6, 1.7))
   val inventario = listOf(mesaTipo1, mesaTipo2, sofaTipo1, sofaTipo2, mesaTipo1, sofaTipo2)
   val numeroDeMesasTipo1 = numeroDeApariciones(mesaTipo1, inventario)
   println(inventario.penultimo)

}