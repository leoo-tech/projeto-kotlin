package com.example.lanchonetedozeapp

// Importe o Button
// Importe o Toast
import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PedidoActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pedido)

        // 1. Encontre os componentes do layout
        val recyclerView: RecyclerView = findViewById(R.id.recycler_view_pedido)
        val textViewTotal: TextView = findViewById(R.id.text_view_total)

        // ENCONTRE O NOVO BOTÃO
        val botaoConfirmar: Button = findViewById(R.id.button_confirmar_pedido)

        // 2. Busque os dados do seu "cérebro" (Singleton)
        val itensDoPedido = PedidoAtual.itens // Acesso direto à propriedade, como você corrigiu
        val totalDoPedido = PedidoAtual.calcularTotal()

        // 3. Configure o RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = PedidoAdapter(itensDoPedido)
        recyclerView.adapter = adapter
        textViewTotal.text = "Total: R$ ${"%.2f".format(totalDoPedido)}"

        // A LÓGICA DO BOTÃO
        botaoConfirmar.setOnClickListener {
            // Vamos verificar o estoque para CADA item no carrinho
            var podeVender = true
            for (item in itensDoPedido) {
                if (!Estoque.verificarDisponibilidade(item)) {
                    podeVender = false
                    Toast.makeText(this, "Erro: Estoque insuficiente para ${item.nome}!", Toast.LENGTH_LONG).show()
                    break // Para o loop se um item falhar
                }
            }

            // Se, e somente se, pudemos vender TUDO...
            if (podeVender) {
                // Dê baixa em cada item
                for (item in itensDoPedido) {
                    Estoque.darBaixa(item)
                }

                Toast.makeText(this, "Pedido confirmado! Estoque atualizado.", Toast.LENGTH_LONG).show()

                PedidoAtual.limparPedido()

                // (Opcional) Feche esta tela e volte para o menu principal
                finish()
            }
        }
    }
}


