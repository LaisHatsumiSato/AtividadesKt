package com.laissato.aula1

class Conta(val numConta: Int, var saldo: Double, cliente: Cliente){

    fun deposito(valor:Double) {
        if (valor > 0) {
            saldo += valor
            println("Deposito feito com sucesso, saldo atual $saldo")
        } else {
            println("Valor invalido")
        }

    }
    fun saque (valor: Double){
        if (valor > 0 && valor <= saldo){
            saldo -= valor
            println("Saque feito com sucesso, valor de $valor")
        }else{
            println("Saldo Insuficiente")
        }

    }


}