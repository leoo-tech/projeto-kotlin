package com.example.lanchonetedozeapp
import Produto

object PedidoAtual {
    // Make the list private to prevent outside modification
    private val _itens = mutableListOf<Produto>()

    // Expose a read-only version of the list for safe access
    val itens: List<Produto>
        get() = _itens

    fun adicionarItem(produto: Produto) {
        _itens.add(produto)
        println("Item adicionado: ${produto.nome}. Total de itens: ${_itens.size}")
    }

    fun limparPedido() {
        _itens.clear()
    }

    // You can now remove the getItens() function entirely.
    // The 'itens' property above handles this.

    fun calcularTotal(): Double {
        return _itens.sumOf { it.preco }
    }
}
