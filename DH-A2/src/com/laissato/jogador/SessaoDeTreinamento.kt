package com.laissato.jogador

class SessaoDeTreinamento
    {
    fun treinarA(jogador: Jogador){
        jogador.correr()
        jogador.fazerGol()
        jogador.correr()

        val experienciaInicial = jogador.experiencia
        jogador.experiencia ++

        println("A experiencia inicial era de $experienciaInicial e subiu para ${jogador.experiencia}")
        }
    }
