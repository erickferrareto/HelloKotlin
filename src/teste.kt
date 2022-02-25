fun main() {
    val x = 3;
    var y = 10;
    y = 5;
    println(x + y);

    // Função que não retorna nada.
    fun function() {
        val result = 2 + 2;
        println(result);
    }
    function();

    // Função com returno
    fun function2(x: Int, y: Int): Int {
        val result = x + y;
        return result;
    }
    println(function2(2, 7))

    //Condições
    val idade = 18;
    val senha = 594428;
    val correto = 594428;
    if (idade >= 18 && senha == correto){
        println("Hello World");
    } else if (idade < 18 && senha == correto){
        println("Error World")
    } else if (idade == 18 && senha != correto){
        println("Hello Error")
    } else if (idade < 18 && senha != correto){
        println("Error Error")
    }

    //Condição WHEN
    val celular = "Samsung"
    when(celular){
        "Samsung", "Motorola" -> println("Android")
        else -> println("IOS")
    }

    //Loopins
    var numero = 0
    while(numero < 10){
        println(numero)
        numero += 1
    }

    //Functions
    fun car(year: Int){
        if (year >= 18){
            println("You can drive")
        } else {
            println("You can't drive")
        }
    }
    car(17)

    fun age(x: Int, y: Int) : Int{
        return x + y
    }
    println(age(10, 22))

    //Arrays e Lists
    val numbersof = arrayOf(1, 2, 3, 4);
    println(numbersof[3])

    //Lista não mutável
    val names = listOf("Erick", "Tayná", "Pedro")
    print(names[1])

    //Listas mutáveis
    val name = mutableListOf<String>("Erick", "Tayna", "Pedro")
    name.add("Alessandra")
    name += "Haroldo"
    println(name)

    val map = mapOf(
        "Apple" to "IOS",
        "Samsung" to "Android"
    )
    println(map["Apple"])

    //Lambdas
    val firstLambda = { x:  Int, y: Int -> Int
        x + y
    }
    println(firstLambda(2, 8))
    //Ou...
    val secondLambda: (Int) -> Int = {
        it + it
    }
    println(secondLambda(8))
}