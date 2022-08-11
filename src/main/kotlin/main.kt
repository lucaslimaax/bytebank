fun main() {
    println("Bem vindo ao Bytebank!!")
    val contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.numero = 1000
    contaAlex.saldo = 100.0


    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 2000
    contaFran.saldo = 500.0

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    println("Depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)
    println("Depositando na conta da Fran")
    contaFran.deposita(40.0)
    println(contaFran.saldo)

    println("sancando da conta do alex")
    contaAlex.saca(40.0)
    println(contaAlex.saldo)

    println("sancando da conta da Fran")
    contaAlex.saca(3000.0) //saque em excesso
    println(contaFran.saldo)
}


class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0

    fun deposita(valor: Double){
        this.saldo += valor
    }

    fun saca(valor: Double){
        if(this.saldo >= valor){
            saldo -= valor
        }
    }

}

fun testaCopiasEReferencias(){
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("Numero X: $numeroX")
    println("Numero Y: $numeroY")

    val contaJoao = Conta()
    contaJoao.titular = "João"
    var contaMaria = contaJoao //vai referenciar o mesmo objeto Conta usado para joão // cuidado
    contaMaria.titular = "Maria"

    println("Titular conta joao: ${contaJoao.titular}")
    println("Titular conta Maria: ${contaMaria.titular}")
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

fun testaLacos(){
    //    var i = 0
//    while (i < 5) {
//        val titular: String = "Lucas $i"
//        val numeroConta: Int = 2000 + i
//        var saldo = i + 10.0
//
//        println("titular $titular")
//        println("numero da conta $numeroConta")
//        println("saldo da conta $saldo")
//        println()
//        i++
//    }

    for (i in 1..5) {
        if (i == 4) {
            break
        }
        val titular: String = "Lucas $i"
        val numeroConta: Int = 2000 + i
        var saldo = i + 10.0

        println("titular $titular")
        println("numero da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
    }
//
//    for (i in 5 downTo 1 step 2){
//        val titular: String = "Lucas $i"
//        val numeroConta: Int = 2000 + i
//        var saldo = i + 10.0
//
//        println("titular $titular")
//        println("numero da conta $numeroConta")
//        println("saldo da conta $saldo")
//        println()
//    }


    //usando breack e continue - e marcação de loop
    loop@ for (i in 1..100) {
        println("i $i")
        for (j in 1..100) {
            println("j $j")
            if (j == 5) break@loop
        }
    }
}