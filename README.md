# 📅 Projeto - Planner Pessoal

> Aplicação em Java para organizar e gerir tarefas pessoais através da consola.

---

## 1. Descrição do Projeto

O **Projeto - Planner Pessoal** é uma aplicação desenvolvida em **Java** que permite organizar e gerir tarefas pessoais.

A aplicação funciona através da consola e permite **adicionar**, **consultar**, **concluir** e **eliminar** tarefas.

---

## 2. Categorias de Tarefas

- Faculdade
- Projetos
- Pessoal
- Treino

---

## 3. Funcionalidades

- [x] Adicionar tarefas
- [x] Consultar todas as tarefas
- [x] Consultar tarefas por categoria
- [x] Marcar tarefas como concluídas
- [x] Eliminar tarefas
- [x] Guardar tarefas num ficheiro
- [x] Carregar tarefas guardadas

---

## 4. Conceitos de Java Utilizados

**Programação Orientada a Objetos**
- Encapsulamento
- Abstração
- Herança
- Polimorfismo
- Interfaces

**Estruturas e controlo de fluxo**
- `ArrayList`
- Estruturas condicionais
- Ciclos

**Outros**
- Tratamento de exceções
- Leitura e escrita de ficheiros

---

## 5. Estrutura da Aplicação

| Classe / Interface | Descrição |
|--------------------|-----------|
| `Tarefa` | Classe abstrata principal |
| `TarefaFaculdade` | Tarefas académicas |
| `TarefaProjetos` | Tarefas de projetos |
| `TarefaPessoal` | Tarefas pessoais |
| `TarefaTreino` | Tarefas de treino |
| `Concluivel` | Interface para concluir tarefas |
| `GestorTarefas` | Gestão das tarefas |
| `Main` | Menu principal da aplicação |

---

## 6. Armazenamento

Os dados são guardados no ficheiro `tarefas.txt`, utilizando objetos `File` e mecanismos de escrita e leitura de ficheiros.

---

## 7. Tecnologias

| Item | Tecnologia |
|------|------------|
| Linguagem | Java |
| Interface | Consola |
| Coleções | `ArrayList` |
| Armazenamento | Ficheiros de texto |

---

*Trabalho produzido por Bruna Leite para avaliação disciplinar de Desenvolvimento Java UC00619*

> Nota: Dentro da pasta src há um segundo readme de acompanhamento do trabalho.