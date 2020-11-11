package com.laissato.aula1

fun main(){
    val cliente1 =Cliente("as","ab")
    val conta1 = Conta(1, 0.0, cliente1)

    conta1.deposito(100.00)
    conta1.saque(50.0)


}

