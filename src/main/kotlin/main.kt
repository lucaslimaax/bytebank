fun main(){
    println("Bem vindo ao Bytebank!!")
    val titular: String = "Lucas"
    val numeroConta: Int = 2000
    var saldo = 0.0
    saldo = 100 + 2.5
    saldo -= 200

    println("titular $titular")
    println("número da conta $numeroConta")
    println("saldo da conta $saldo")

    println("\n IF:")
    if(saldo > 0){
        println("Conta eh Positiva")
    } else if(saldo == 0.0){
        println("Conta eh Neutra")
    } else{
        println("Conta eh Negativa")
    }
    println("\n When:")
    when {
        saldo > 0.0 -> println("conta eh positiva")
        saldo == 0.0 -> println("conta eh neutra")
        else -> println("conta eh negativa")
    }
}