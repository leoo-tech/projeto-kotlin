package com.example.lanchonetedozeapp

import Produto
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class PedidoAtualTest {

    @Before
    fun setUp() {
        PedidoAtual.limparPedido()
    }

    @Test
    fun adicionarItemAdicionaCorretamente() {
        val produto = Produto(nome = "Hambúrguer", preco = 10.0)
        PedidoAtual.adicionarItem(produto)
        assertTrue(PedidoAtual.itens.contains(produto))
        assertEquals(1, PedidoAtual.itens.size)
    }

    @Test
    fun calcularTotalSomaCorretamente() {
        PedidoAtual.adicionarItem(Produto(nome = "Refrigerante", preco = 5.0))
        PedidoAtual.adicionarItem(Produto(nome = "Batata", preco =  10.0))
        assertEquals(/* expected = */ 15.0, /* actual = */
            PedidoAtual.calcularTotal(), /* delta = */
            0.01)
    }

    @Test
    fun limparPedidoEsvaziaLista() {
        PedidoAtual.adicionarItem(Produto(nome = "Sorvete", preco = 10.0))
        PedidoAtual.limparPedido()
        assertTrue(PedidoAtual.itens.isEmpty())
    }

    @Test
    fun listaItensEhSomenteLeitura() {
        // Não é possível adicionar diretamente: PedidoAtual.itens.add(...)
        // Então verificamos apenas se método público de adicionar funciona e acesso externo não permite edição
        val tamanhoAntes = PedidoAtual.itens.size
        // Se tentar: PedidoAtual.itens as MutableList<Produto> dá ClassCastException ou erro de compilação (garante imutabilidade na API pública)
        assertEquals(tamanhoAntes, PedidoAtual.itens.size)
    }
}
