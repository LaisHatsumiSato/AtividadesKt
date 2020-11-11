package com.laissato.jogador

class Jogador (
    val nome: String = " ",
    var energia: Int = 100,
    var alegria: Int = 0 ,
    var experiencia: Int = 0) {
    var gols: Int= 0


    fun fazerGol() {
         energia -= 5
         alegria += 10
         gols += 1
        println("Goool")

    }
    fun correr(){
            energia-=10
            println("Cansei")
    }

}