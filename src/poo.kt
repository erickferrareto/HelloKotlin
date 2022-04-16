//Porgramção Orientada a Objetos em Kotlin
open class Person(var name : String, var old : Int){

}
class Man(name : String, old : Int) : Person(name, old){
    init {
        println("O $name possui $old anos e é homem")
    }
}

class Woman(name : String, old : Int) : Person(name, old){
    init {
        println("A $name possui $old anos e é mulher")
    }
}

fun main(){
    var pessoa1 = Man("Erick", 22)
    var pessoa2 = Woman("Tayna", 24)
    var pessoa3 = Person("Pedro", 14)
}