# loja-virtual-anything
Trabalho 03 - Da disciplina Desenvolvimento com Frameworks e Componentes

### Tecnologias utilizadas

- Java 8
- Maven
- Spring Boot
- Spring Data Jpa
- TomCat
- MySql

### Urls

Todas as urls responderão no formato **JSON**.

#### Cliente

```
GET - http://localhost:8080/loja-virtual-anything/api/cliente/findAll
GET - http://localhost:8080/loja-virtual-anything/api/cliente/findById/{id}
PUT - http://localhost:8080/loja-virtual-anything/api/cliente/updateSaveCliente
PUT - http://localhost:8080/loja-virtual-anything/api/cliente/updateSaveCliente/{id}
DELETE - http://localhost:8080/loja-virtual-anything/api/cliente/deleteById/{id}
```

#### Estoque 

```
GET - http://localhost:8080/loja-virtual-anything/api/estoque/findAll
GET - http://localhost:8080/loja-virtual-anything/api/estoque/findById/{id}
PUT - http://localhost:8080/loja-virtual-anything/api/estoque/updateSaveEstoque
PUT - http://localhost:8080/loja-virtual-anything/api/estoque/updateSaveEstoque/{id}
DELETE - http://localhost:8080/loja-virtual-anything/api/estoque/deleteById/{id}
```

#### Pedido 

```
GET - http://localhost:8080/loja-virtual-anything/api/pedido/findAll
GET - http://localhost:8080/loja-virtual-anything/api/pedido/findById/{id}
PUT - http://localhost:8080/loja-virtual-anything/api/pedido/updateSavePedido
PUT - http://localhost:8080/loja-virtual-anything/api/pedido/updateSavePedido/{id}
DELETE - http://localhost:8080/loja-virtual-anything/api/pedido/deleteById/{id}
```

#### Produto 

```
GET - http://localhost:8080/loja-virtual-anything/api/produto/findAll
GET - http://localhost:8080/loja-virtual-anything/api/produto/findById/{id}
PUT - http://localhost:8080/loja-virtual-anything/api/produto/updateSaveProduto
PUT - http://localhost:8080/loja-virtual-anything/api/produto/updateSaveProduto/{id}
DELETE - http://localhost:8080/loja-virtual-anything/api/produto/deleteById/{id}
```

#### Reposicao 

```
GET - http://localhost:8080/loja-virtual-anything/api/reposicao/findAll
GET - http://localhost:8080/loja-virtual-anything/api/reposicao/findById/{id}
PUT - http://localhost:8080/loja-virtual-anything/api/reposicao/updateSaveReposicao
PUT - http://localhost:8080/loja-virtual-anything/api/reposicao/updateSaveReposicao/{id}
DELETE - http://localhost:8080/loja-virtual-anything/api/reposicao/deleteById/{id}
```