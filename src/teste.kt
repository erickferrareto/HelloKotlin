fun main(){
    val x = 3;
    var y = 10;
    y = 5;
    print(x + y);

    // Função que não retorna nada.
    fun function(): Unit {
        val result = 2 + 2;
        print(result);
    }
    function();

    // Função com returno
    fun function2(x: Int , y: Int): Int{
        val result = x + y;
        return result;
    }
    print(function2(2, 7))

}
