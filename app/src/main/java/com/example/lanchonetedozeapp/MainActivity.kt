package com.example.lanchonetedozeapp// Dentro de MainActivity.kt (certifique-se de importar suas classes de modelo e o adapter)
// Substitua "com.exemplo.lanchonetedozeapp" pelo seu nome de pacote real

import Produto
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. Sua lista fictícia (COMO EU JÁ TE PASSEI)
        val listaDeProdutosFicticia = listOf(
            Produto("1", "X-Bacon", 15.0, mapOf("pao" to 1, "carne" to 1, "bacon" to 2)),
            Produto("2", "Suco de Laranja", 7.0, mapOf("laranja" to 3)),
            Produto("3", "Batata Frita", 10.0, mapOf("batata" to 1))
        )

        // 2. Encontre o RecyclerView no seu layout
        val recyclerView: RecyclerView = findViewById(R.id.recycler_view_produtos)

        // 3. Configure o LayoutManager (obrigatório para o RecyclerView saber como se organizar)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // 4. Crie e configure o Adapter
        val adapter = ProdutoAdapter(listaDeProdutosFicticia)
        recyclerView.adapter = adapter

        // Dentro do onCreate da MainActivity.kt

        recyclerView.adapter = adapter

// 1. Encontre o botão "Ver Pedido"
        val botaoVerPedido: Button = findViewById(R.id.button_ver_pedido) // Certifique-se que o ID está correto no seu activity_main.xml

// 2. Configure o clique para abrir a nova Activity
        botaoVerPedido.setOnClickListener {
            val intent = Intent(this, PedidoActivity::class.java)
            startActivity(intent)
        }

    }
}