package com.laissato.atletas

    fun main(){
        val atleta1 = Atleta("a", 50,5)
        val atleta2 = Atleta("b", 30,7)
        val p1 = Provas(10,5)
        val p2 = Provas(3,5)
        val p3 = Provas(5,6)

        println(p1.podeRealizar(atleta1))
        println(p2.podeRealizar(atleta1))
        println(p3.podeRealizar(atleta1))

        println(p1.podeRealizar(atleta2))
        println(p2.podeRealizar(atleta2))
        println(p3.podeRealizar(atleta2))
    }
