fun main() {
    println("Bem vindo ao Bytebank!!")
    var i = 0
    while (i < 5) {
        val titular: String = "Lucas $i"
        val numeroConta: Int = 2000 + i
        var saldo = i + 10.0

        println("titular $titular")
        println("numero da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
        i++
    }

//    for (i in 5 downTo 1 step 5) {
//        if(i == 4){
//            break
//        }
//        val titular: String = "Lucas $i"
//        val numeroConta: Int = 2000 + i
//        var saldo = i + 10.0
//
//        println("titular $titular")
//        println("numero da conta $numeroConta")
//        println("saldo da conta $saldo")
//        println()
//    }

//    testaCondicoes(saldo)
}


fun testaCondicoes(saldo: Double) {

    println("\n IF:")
    if (saldo > 0) {
        println("Conta eh Positiva")
    } else if (saldo == 0.0) {
        println("Conta eh Neutra")
    } else {
        println("Conta eh Negativa")
    }
    println("\n When:")
    when {
        saldo > 0.0 -> println("conta eh positiva")
        saldo == 0.0 -> println("conta eh neutra")
        else -> println("conta eh negativa")
    }

}