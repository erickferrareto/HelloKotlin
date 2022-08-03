//Porgramção Orientada a Objetos em Kotlin
class Carro(var portas : Int, var cor : String, ){
    //Trabalhando com classes internas e aninhamentos
    inner class Motor{
        var motor = "mitsubish"
        fun ligando() = println("Ligando o carro com o motor $motor, da cor $cor, de $portas")
    }
}
fun main(){
    val carro1 = Carro(2, "Vermelho")
    println(carro1.cor)
    println(carro1.portas)
    val carro2 = Carro(4, "cinza")
    println(carro2.portas)
    println(carro2.cor)

    val carro3 = Carro(3, "azul")
    carro3.Motor().ligando()

}

