data class Produto(
    val id: String = "",
    val nome: String = "",
    val preco: Double = 0.0,
    val ingredientes: Map<String, Int> = emptyMap() // Ex: {"pao" to 1, "carne" to 1}
)