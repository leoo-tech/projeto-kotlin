# LanchoneteDozeApp

Este é um MVP (Produto Mínimo Viável) de um aplicativo mobile para pedidos em lanchonete, desenvolvido em Kotlin para Android. O app permite ao usuário adicionar produtos ao pedido, visualizar um resumo e confirmar o pedido, retornando à tela inicial com o estoque atualizado.

## Funcionalidades



- Visualização de produtos disponíveis e seus preços

- Adição de produtos ao pedido com feedback visual

- Resumo do pedido mostrando itens e valor total

- Confirmação e finalização do pedido

- Atualização do estoque após confirmação

- Testes unitários para as principais regras de negócio



## Tecnologias Utilizadas



- Android (Kotlin)

- Android Studio

- JUnit (para testes unitários)



## Como Rodar o Projeto



1. Clone este repositório:

`git clone https://github.com/seuusuario/lanchonetedozeapp.git`

2. Abra o projeto no Android Studio.

3. Execute o app em um emulador Android ou dispositivo físico.

4. Para rodar os testes unitários:

- Via Android Studio: clique com o direito na pasta `test` e escolha "Run Tests"

- Ou via terminal:

&nbsp; ```

&nbsp; ./gradlew test

&nbsp; ```



## Estrutura do Projeto



app/

└─ src/

├─ main/

│ └─ java/com/example/lanchonetedozeapp

│ ├─ MainActivity.kt

│ ├─ PedidoAtual.kt

│ ├─ Produto.kt

│ └─ ...

└─ test/

└─ java/com/example/lanchonetedozeapp/

└─ PedidoAtualTest.kt

## Capturas de Tela
<img width="1080" height="2400" alt="image" src="https://github.com/user-attachments/assets/d5c2fd19-5a99-4b1b-866a-59710a92c5d8" />
<img width="1080" height="2400" alt="image" src="https://github.com/user-attachments/assets/be00e516-c9b5-4ba2-858f-d5a38bf93ef7" />
<img width="1080" height="2400" alt="image" src="https://github.com/user-attachments/assets/be76b886-2039-4ab2-a045-59e676e2303d" />
<img width="1080" height="2400" alt="image" src="https://github.com/user-attachments/assets/7822dd06-7b24-483e-90c3-0aaaad27f2bd" />

## Testes



O projeto contém testes unitários essenciais para a lógica de pedidos (`PedidoAtualTest.kt`). Para ampliar a cobertura, adicione mais testes para fluxos diferentes e validações.



## Autor

Desenvolvido por Leonardo.





