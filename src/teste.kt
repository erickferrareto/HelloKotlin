fun main() {
    val x = 3;
    var y = 10;
    y = 5;
    println(x + y);

    // Função que não retorna nada.
    fun function(): Unit {
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
}