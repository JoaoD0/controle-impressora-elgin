# 🖨️ Integração Java com Impressora Elgin i9
### *Controle de Impressora Térmica Elgin*
---

## 📘 Sobre o Projeto

Este projeto foi desenvolvido por alunos com o objetivo de criar uma aplicação Java capaz de se comunicar com a impressora térmica **Elgin i8/i9**, usando a biblioteca **JNA** e a DLL da Elgin (**E1_Impressora01.dll**).
O trabalho faz parte da disciplina de **Lógica de Programação**.

Com o programa é possível:
- Imprimir textos
- Imprimir QR Code
- Imprimir código de barras
- Imprimir cupom fiscal do SAT (arquivo XML)
- Imprimir cancelamento do SAT (arquivo XML)
- Abrir a gaveta de dinheiro
- Fazer a impressora apitar (sinal sonoro)
- Avançar o papel

---

## 🧰 Tecnologias Utilizadas

- **Java 21 (JDK 21)**
- **IntelliJ IDEA**
- **Biblioteca JNA 5.15.0**
- **DLL da Elgin (E1_Impressora01.dll)**

---

## 📁 Estrutura do Projeto

```
Main.java             → Código-fonte do programa
E1_Impressora01.dll   → DLL da Elgin que conversa com a impressora
libs/jna-5.15.0.jar   → Biblioteca que permite o Java usar a DLL
XMLSAT.xml            → Exemplo de cupom SAT
CANC_SAT.xml          → Exemplo de cancelamento SAT
README.md             → Este arquivo de instruções
```

---

## ✅ Antes de Começar

Você vai precisar de:
- Um computador com **Windows**
- Internet (só para baixar os programas)
- A impressora **Elgin i8 ou i9**
- O **cabo USB** da impressora

---

## ⚙️ Instalação e Execução

### 🔽 1. Baixar o Projeto do GitHub
1. Acesse o repositório no GitHub.
2. Clique no botão verde **<> Code**.
3. Selecione **Download ZIP**.
4. Aguarde o download.

### 📦 2. Extrair o Arquivo ZIP
1. Abra a pasta **Downloads** do seu computador.
2. Procure o arquivo **controle-impressora-elgin-main.zip**.
3. Clique com o botão direito nele.
4. Clique em **Extrair Tudo...** (ou **Extrair aqui** / **Extract All**).
5. Clique em **Extrair**.
6. Será criada uma nova pasta com os arquivos do projeto.

### ☕ 3. Instalar o Java (JDK 21)
> Se você já tem o Java 21 instalado, pule para a etapa 4.

1. Abra o navegador.
2. Acesse: **https://adoptium.net/temurin/releases/?version=21**
3. Em **Operating System**, escolha **Windows**.
4. Em **Architecture**, escolha **x64**.
5. Clique no arquivo terminado em **.msi** para baixar.
6. Aguarde o download.
7. Abra o arquivo baixado.
8. Clique em **Next**.
9. Aceite os termos e clique em **Next**.
10. Clique em **Next** de novo.
11. Clique em **Install**.
12. Se o Windows perguntar se deseja permitir, clique em **Sim**.
13. Aguarde a instalação.
14. Clique em **Finish**.

### 💻 4. Instalar o IntelliJ IDEA
> Se você já tem o IntelliJ instalado, pule para a etapa 5.

1. Abra o navegador.
2. Acesse: **https://www.jetbrains.com/idea/download/**
3. Clique em **Download**.
4. Aguarde o download.
5. Abra o arquivo baixado.
6. Se o Windows perguntar se deseja permitir, clique em **Sim**.
7. Clique em **Next** em todas as telas.
8. Clique em **Install**.
9. Aguarde a instalação.
10. Clique em **Finish**.

### 🧭 5. Abrir o Projeto no IntelliJ IDEA
1. Abra o **IntelliJ IDEA**.
2. Clique em **Open**.
3. Procure a pasta que você extraiu na etapa 2.
4. Clique uma vez na pasta para selecionar.
5. Clique em **OK**.
6. Se aparecer a pergunta **Trust Project?**, clique em **Trust Project**.
7. Aguarde o carregamento (aparece uma barrinha no canto de baixo da tela).

### 🛠️ 6. Escolher o Java 21 no Projeto
1. No menu de cima, clique em **File**.
2. Clique em **Project Structure...**
3. Na coluna da esquerda, clique em **Project**.
4. No campo **SDK**, clique e escolha **21** (o Java instalado na etapa 3).
5. Clique em **Apply**.
6. **Não feche a janela ainda**, vamos usá-la na próxima etapa.

### 📚 7. Adicionar a Biblioteca JNA
1. Ainda na janela **Project Structure**, clique em **Libraries** na coluna da esquerda.
2. Clique no botão **+** (em cima da lista).
3. Clique em **Java**.
4. Abra a pasta do projeto.
5. Abra a pasta **libs**.
6. Clique no arquivo **jna-5.15.0.jar**.
7. Clique em **OK**.
8. Se aparecer uma janela perguntando o módulo, clique em **OK**.
9. Clique em **Apply**.
10. Clique em **OK** para fechar a janela.

### 📂 8. Conferir a DLL e a Pasta de Trabalho
1. Confira se o arquivo **E1_Impressora01.dll** está na pasta principal do projeto, junto com o **Main.java**.
2. **Não mova esse arquivo de lugar**, senão o programa não encontra a impressora.
3. No menu de cima, clique em **Run**.
4. Clique em **Edit Configurations...**
5. Se a lista estiver vazia, clique no **+** e escolha **Application**. Em **Main class**, digite **Main**.
6. Procure o campo **Working directory**.
7. Confira se ele mostra a pasta do projeto. Se não mostrar, clique no ícone de pasta ao lado e escolha a pasta do projeto.
8. Clique em **OK**.

### 🔌 9. Ligar a Impressora
1. Ligue a impressora na tomada.
2. Conecte o cabo USB na impressora.
3. Conecte a outra ponta do cabo USB no computador.
4. Ligue a impressora no botão.
5. Confira se tem papel dentro da impressora.

### ▶️ 10. Rodar o Programa
1. Na coluna da esquerda do IntelliJ, dê dois cliques em **Main.java**.
2. Clique no botão verde ▶️ que aparece ao lado de **public class Main**.
3. Clique em **Run 'Main.main()'**.
4. Aguarde. O programa vai aparecer na parte de baixo da tela.

---

## 🔑 Como Fazer o Login

1. Clique na parte de baixo da tela, onde o programa apareceu.
2. Onde aparece **Usuário:**, digite **admin** e aperte **Enter**.
3. Onde aparece **Senha:**, digite **1234** e aperte **Enter**.
4. Vai aparecer **Login realizado com sucesso!** e o menu.

> ⚠️ Você tem **3 tentativas**. Se errar as 3, o programa fecha e você precisa rodar de novo (etapa 10).

---

## 🖨️ Como Usar a Impressora

### 1. Configurar a conexão (sempre fazer primeiro)
1. Digite **1** e aperte **Enter**.
2. Em **Tipo de conexão**, digite **1** e aperte **Enter**.
3. Em **Modelo da impressora**, digite **i9** (ou **i8**) e aperte **Enter**.
4. Em **Conexão**, digite **USB** e aperte **Enter**.
5. Em **Parâmetro**, digite **0** e aperte **Enter**.

### 2. Abrir a conexão
1. Digite **2** e aperte **Enter**.
2. Deve aparecer **Conexão aberta com sucesso.**

### 3. Imprimir um texto (exemplo)
1. Digite **4** e aperte **Enter**.
2. Digite o texto que quer imprimir e aperte **Enter**.
3. Digite quantas cópias quer e aperte **Enter**.
4. A impressora vai imprimir e cortar o papel.

### 4. Imprimir o cupom SAT (exemplo)
1. Digite **7** e aperte **Enter**.
2. Digite **XMLSAT.xml** e aperte **Enter**.
3. A impressora vai imprimir o cupom.

### 5. Sair do programa
1. Digite **0** e aperte **Enter**.
2. A conexão é fechada sozinha e o programa termina.

---

## 📋 Opções do Menu

| Opção | O que faz |
|---|---|
| 1 | Configurar conexão |
| 2 | Abrir conexão |
| 3 | Fechar conexão |
| 4 | Imprimir texto |
| 5 | Imprimir QR Code |
| 6 | Imprimir código de barras |
| 7 | Imprimir cupom XML SAT (digite **XMLSAT.xml**) |
| 8 | Imprimir cancelamento XML SAT (digite **CANC_SAT.xml**) |
| 9 | Abrir gaveta |
| 10 | Sinal sonoro |
| 11 | Avançar papel |
| 0 | Sair |

---

## ❓ Problemas Comuns

- **Apareceu "Conexão fechada. Abra a conexão antes (opção 2)."**
  → Faça a opção **1** e depois a opção **2**.

- **Apareceu "Configure a conexão antes (opção 1)."**
  → Faça a opção **1** primeiro.

- **Apareceu "Erro ao abrir conexão. Código de erro: ..."**
  → Confira se a impressora está ligada e com o cabo USB conectado.
  → Faça a opção **1** de novo e confira se digitou **i9** e **USB** certinho.

- **Apareceu "Não foi possível ler o arquivo"**
  → Confira se digitou o nome certo, com **.xml** no final (ex: **XMLSAT.xml**).
  → Confira o **Working directory** (etapa 8).

- **Apareceu "Valor inválido! Digite apenas números."**
  → Digite só números, sem letras e sem espaço.

- **Apareceu erro em vermelho falando de "com.sun.jna"**
  → A biblioteca JNA não foi adicionada. Faça a etapa 7 de novo.

---

## 👥 Autores
*(em ordem alfabética)*

- João Vitor Delfino
- Nathan Feitosa
