package com.laissato.atletas

class Provas (var dificuldade: Int,
              var energiaNecessaria: Int
) {

    fun podeRealizar(atleta: Atleta): Boolean {
        return atleta.nivel >= dificuldade && atleta.energia >= energiaNecessaria
    }
}