package com.example.lanchonetedozeapp

// Em PedidoAdapter.kt
import Produto
import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Nota: Estou usando o mesmo 'list_item_produto.xml', mas escondendo o botão.
// Seria MELHOR criar um novo layout de item, mas vamos ser preguiçosos e eficientes.

class PedidoAdapter(private val listaItens: List<Produto>) : RecyclerView.Adapter<PedidoAdapter.ViewHolder>() {

    // Usando o mesmo ViewHolder do ProdutoAdapter, mas vamos precisar do ID do botão
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nomeProduto: TextView = view.findViewById(R.id.text_view_nome_produto)
        val precoProduto: TextView = view.findViewById(R.id.text_view_preco_produto)
        // Precisamos do botão para escondê-lo
        val botaoAdicionar: View = view.findViewById(R.id.button_adicionar)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // REUTILIZANDO o layout do item do produto
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_produto, parent, false)
        return ViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val produto = listaItens[position]

        holder.nomeProduto.text = produto.nome
        holder.precoProduto.text = "R$ ${"%.2f".format(produto.preco)}"

        // A MÁGICA: Esconda o botão "Adicionar" que não faz sentido aqui
        holder.botaoAdicionar.visibility = View.GONE
    }

    override fun getItemCount() = listaItens.size
}