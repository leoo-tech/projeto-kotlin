package com.example.lanchonetedozeapp

import Produto

// Em Estoque.kt
object Estoque {

    // Nosso estoque inicial. Note que as chaves (ex: "pao") são as mesmas
    // que você definiu nos ingredientes da sua classe 'Produto'. Isso é crucial.
    val itens = mutableMapOf(
        "pao" to 100,
        "carne" to 50,
        "bacon" to 75,
        "laranja" to 200,
        "batata" to 30
    )

    fun verificarDisponibilidade(produto: Produto): Boolean {
        for ((ingrediente, quantidadeNecessaria) in produto.ingredientes) {
            val quantidadeEmEstoque = itens[ingrediente] ?: 0 // Se não existir, tem 0
            if (quantidadeEmEstoque < quantidadeNecessaria) {
                return false // Não temos o suficiente de UM ingrediente
            }
        }
        return true // Temos tudo!
    }

    fun darBaixa(produto: Produto) {
        // Isso assume que você JÁ VERIFICOU a disponibilidade
        for ((ingrediente, quantidadeUsada) in produto.ingredientes) {
            val quantidadeAtual = itens[ingrediente] ?: 0
            itens[ingrediente] = quantidadeAtual - quantidadeUsada

            println("Estoque de '$ingrediente' atualizado: ${itens[ingrediente]}")
        }
    }

    // Função bônus para ver o estoque (você pode fazer uma tela para isso depois)
    fun getEstoqueAtual(): Map<String, Int> {
        return itens
    }
}