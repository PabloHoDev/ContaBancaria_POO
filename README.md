# 💳 Conta Bancária — CRUD em Java (POO)

## 🎯 Objetivo do Projeto

Este projeto tem como objetivo demonstrar, na prática, os **fundamentos da Programação Orientada a Objetos (POO)** em Java, por meio da simulação de uma **Conta Bancária**, aplicando conceitos como encapsulamento, métodos, construtores e regras de negócio.

O projeto também serve como base para evolução futura em um **CRUD completo**, podendo ser expandido para persistência de dados, interface gráfica ou API.

---

## 🧠 Conceitos Aplicados

* Programação Orientada a Objetos (POO)
* Encapsulamento
* Classes e Objetos
* Construtores
* Métodos
* Regras de negócio
* Controle de acesso (`private`, `public`)
* Boas práticas de modelagem

---

## 📌 Regras de Negócio

* O saldo **não pode ser acessado ou alterado diretamente**
* Depósitos só podem ser realizados com valores positivos
* Saques só podem ocorrer se houver saldo suficiente
* Toda alteração no saldo ocorre **exclusivamente através de métodos**

Essas regras garantem a **integridade do objeto** e simulam um cenário real de sistema bancário.

---

## ⚙️ Funcionalidades

* Criar uma conta bancária com titular e saldo inicial
* Depositar valores na conta
* Sacar valores da conta
* Exibir saldo atual e titular da conta

---

## 🏗️ Estrutura do Projeto

```
ContaBancaria/
│
├── ContaBancaria.java   # Classe principal do modelo
└── Main.java            # (Futuro) Menu e interação com usuário
```

> Atualmente o foco está na **classe de domínio (modelo)**, servindo como base para a construção de um CRUD completo.

---

## 🔍 O que está acontecendo no código?

* `ContaBancaria` → representa uma entidade do sistema
* `private` → protege os atributos (encapsulamento)
* `this.saldo` → o saldo pertence à instância do objeto
* `depositar()` e `sacar()` → únicos meios de alterar o saldo
* Cada objeto possui **estado próprio**, independente de outros

---

## 🚀 Possíveis Evoluções Futuras

* CRUD completo no terminal (Criar, Listar, Atualizar e Excluir contas)
* Histórico de transações
* Persistência de dados em arquivo (`.txt` ou `.csv`)
* Integração com banco de dados
* Interface gráfica (JavaFX ou Swing)
* API REST com Spring Boot

---

## 🧪 Público-Alvo

* Estudantes de Java
* Iniciantes em Programação Orientada a Objetos
* Desenvolvedores que desejam reforçar fundamentos
* Portfólio para GitHub

---

## 📚 Tecnologias Utilizadas

* Java (JDK 8+)
* Programação Orientada a Objetos

---

## 🧠 Aprendizado Principal

> Um bom sistema começa com **modelagem correta**, proteção de dados e regras bem definidas.

Este projeto reforça que **POO não é apenas sintaxe**, mas organização, responsabilidade e segurança do código.

---

## ✍️ Autor

Henrique Oliveira
📌 Projeto educacional para estudo e prática de Java e POO

ContaBancariaCRUD/
│
├── model/
│   └── ContaBancaria.java
│
├── service/
│   └── BancoService.java
│
└── Main.java
