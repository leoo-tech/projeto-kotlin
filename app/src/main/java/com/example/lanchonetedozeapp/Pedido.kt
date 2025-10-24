data class Pedido(
    val id: String = "",
    val itens: List<Produto> = emptyList(),
    val total: Double = 0.0,
    val timestamp: Long = System.currentTimeMillis()
)