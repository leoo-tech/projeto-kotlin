package com.example.lanchonetedozeapp

// Dentro de ProdutoAdapter.kt

// Substitua "com.exemplo.lanchonetedozeapp" pelo seu nome de pacote real
import Produto
import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class ProdutoAdapter(private val listaProdutos: List<Produto>) : RecyclerView.Adapter<ProdutoAdapter.ViewHolder>() {

    // 'ViewHolder' descreve a view de cada item e seus componentes
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nomeProduto: TextView = view.findViewById(R.id.text_view_nome_produto)
        val precoProduto: TextView = view.findViewById(R.id.text_view_preco_produto)
        val botaoAdicionar: Button = view.findViewById(R.id.button_adicionar)

    }

    // Cria novas views (invocado pelo layout manager)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_produto, parent, false)
        return ViewHolder(view)
    }

    // Substitui o conteúdo de uma view (invocado pelo layout manager)
    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val produto = listaProdutos[position]

        holder.nomeProduto.text = produto.nome
        holder.precoProduto.text = "R$ ${"%.2f".format(produto.preco)}" // Formatação básica

        // Lógica do clique (AGORA FUNCIONA)
        holder.botaoAdicionar.setOnClickListener {
            PedidoAtual.adicionarItem(produto)
            // Dê um feedback visual, mude o texto do botão, sei lá
            holder.botaoAdicionar.text = "Adicionado!"
            // Ou use um Toast, se quiser parecer profissional
            Toast.makeText(holder.itemView.context, "${produto.nome} adicionado", Toast.LENGTH_SHORT).show()
        }

    }

    // Retorna o tamanho da sua lista (invocado pelo layout manager)
    override fun getItemCount() = listaProdutos.size
}