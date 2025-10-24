# projeto-kotlin



\# LanchoneteDozeApp



Este é um MVP (Produto Mínimo Viável) de um aplicativo mobile para pedidos em lanchonete, desenvolvido em Kotlin para Android. O app permite ao usuário adicionar produtos ao pedido, visualizar um resumo e confirmar o pedido, retornando à tela inicial com o estoque atualizado.



\## Funcionalidades



\- Visualização de produtos disponíveis e seus preços

\- Adição de produtos ao pedido com feedback visual

\- Resumo do pedido mostrando itens e valor total

\- Confirmação e finalização do pedido

\- Atualização do estoque após confirmação

\- Testes unitários para as principais regras de negócio



\## Tecnologias Utilizadas



\- Android (Kotlin)

\- Android Studio

\- JUnit (para testes unitários)



\## Como Rodar o Projeto



1\. Clone este repositório:

git clone https://github.com/seuusuario/lanchonetedozeapp.git

2\. Abra o projeto no Android Studio.

3\. Execute o app em um emulador Android ou dispositivo físico.

4\. Para rodar os testes unitários:

\- Via Android Studio: clique com o direito na pasta `test` e escolha "Run Tests"

\- Ou via terminal:

&nbsp; ```

&nbsp; ./gradlew test

&nbsp; ```



\## Estrutura do Projeto



app/

└─ src/

├─ main/

│ └─ java/com/example/lanchonetedozeapp/

│ ├─ MainActivity.kt

│ ├─ PedidoAtual.kt

│ ├─ Produto.kt

│ └─ ...

└─ test/

└─ java/com/example/lanchonetedozeapp/

└─ PedidoAtualTest.kt





\## Capturas de Tela



\*Inclua aqui algumas imagens do app funcionando para ilustrar suas telas principais.\*



\## Testes



O projeto contém testes unitários essenciais para a lógica de pedidos (`PedidoAtualTest.kt`). Para ampliar a cobertura, adicione mais testes para fluxos diferentes e validações.



\## Autor



Desenvolvido por Leonardo.





