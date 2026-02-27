# 🚚 Sistema de Cálculo de Frete 

Projeto desenvolvido em **Java** com o objetivo de simular diferentes formas de cálculo de frete utilizando boas práticas de programação orientada a objetos, interfaces e separação de responsabilidades.

O sistema permite calcular entregas utilizando diferentes tipos de transporte, como **Motoboy, Correios, Drone e Transportadora**, aplicando regras específicas para cada modalidade.

---

## 📌 Objetivo do Projeto

Este projeto foi criado para demonstrar:

* Programação Orientada a Objetos (POO)
* Uso de Interfaces
* Princípio de Polimorfismo
* Organização de código em responsabilidades separadas
* Simulação de cálculo logístico de entregas

---

## 🛠️ Tecnologias Utilizadas

* Java
* Programação Orientada a Objetos (POO)
* Interface Strategy Pattern (Estratégia de Frete)

---

## 📂 Estrutura do Projeto

```
MotoboyFrete
│
├── Main.java                  # Classe principal para execução do sistema
├── Pedido.java                # Representa um pedido
├── Produto.java               # Dados do produto
│
├── ITipoFrete.java            # Interface de cálculo de frete
├── CalculadoraFrete.java      # Classe responsável pelo cálculo
│
├── MotoboyFrete.java          # Frete via motoboy
├── CorreiosFrete.java         # Frete via correios
├── DroneFrete.java            # Frete via drone
└── TransportadoraFrete.java   # Frete via transportadora
```

---

## ⚙️ Como Executar o Projeto

### 1️⃣ Clone o repositório

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
```

### 2️⃣ Entre na pasta do projeto

```bash
cd MotoboyFrete
```

### 3️⃣ Compile os arquivos Java

```bash
javac *.java
```

### 4️⃣ Execute o programa

```bash
java Main
```

---

## 🚀 Funcionalidades

✅ Cadastro de produtos
✅ Criação de pedidos
✅ Diferentes tipos de entrega
✅ Cálculo de frete baseado na estratégia escolhida
✅ Código modular e reutilizável

---

## 💡 Conceitos Aplicados

O projeto utiliza o padrão semelhante ao **Strategy Pattern**, permitindo adicionar novos tipos de frete facilmente sem alterar o restante do sistema.

Exemplo:

```java
ITipoFrete frete = new MotoboyFrete();
```

Basta criar uma nova classe implementando a interface:

```java
ITipoFrete
```

---

## 📈 Possíveis Melhorias Futuras

* Interface gráfica (JavaFX ou Web)
* Integração com banco de dados
* API REST para pedidos
* Sistema de rastreamento de entrega

---

## 👨‍💻 Autor

Desenvolvido por **Leonardo Gomes Ferreira**

---

⭐ Se este projeto te ajudou ou foi útil para estudos, considere deixar uma estrela no repositório!
