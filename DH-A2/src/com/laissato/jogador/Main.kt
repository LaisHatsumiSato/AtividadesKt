package com.laissato.jogador

fun main (){
    var jogador1 = Jogador("KK", 100,50,0)
    var jogador2 = Jogador("August", 100,30,0)
    val sessaoDeTreinamento = SessaoDeTreinamento()

    sessaoDeTreinamento.treinarA(jogador1)
    sessaoDeTreinamento.treinarA(jogador2)
}