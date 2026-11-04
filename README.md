# 🖨️ Controle de Impressora Térmica Elgin

Trabalho da disciplina de **Lógica de Programação** em Java.

---

## 📘 O que é este programa?

É um programa que controla uma **impressora térmica Elgin i8 ou i9** (aquelas
impressoras de cupom de loja) pelo computador.

Depois de entrar com usuário e senha, aparece um menu de opções. Com ele você pode:

- imprimir um texto;
- imprimir um QR Code ou um código de barras;
- imprimir um cupom fiscal do SAT a partir de um arquivo XML;
- abrir a gaveta de dinheiro;
- fazer a impressora apitar;
- avançar o papel.

---

## ✅ O que você precisa ter

- Um computador com **Windows**.
- A impressora **Elgin i8 ou i9** ligada na tomada e conectada no computador pelo **cabo USB**.
- Internet, para baixar os programas abaixo (só na primeira vez).

---

## 🪜 Passo a passo

### Passo 1 — Baixar o projeto

1. Nesta página do GitHub, clique no botão verde **`<> Code`**.
2. Clique em **Download ZIP**.
3. Vá até a pasta **Downloads** do seu computador.
4. Clique com o botão direito no arquivo baixado e escolha **Extrair Tudo...** → **Extrair**.
5. Vai aparecer uma pasta nova com os arquivos do projeto. Guarde onde ela está.

### Passo 2 — Instalar o Java (JDK 21)

O Java é necessário para o programa funcionar.

1. Acesse **https://adoptium.net/temurin/releases/?version=21**
2. Baixe a versão para **Windows x64** no formato **.msi**.
3. Abra o arquivo baixado e clique em **Next** até terminar a instalação.

### Passo 3 — Instalar o IntelliJ IDEA

O IntelliJ é o programa usado para abrir e rodar o projeto.

1. Acesse **https://www.jetbrains.com/idea/download/**
2. Baixe a versão gratuita (**Community Edition**).
3. Abra o arquivo baixado e clique em **Next** até terminar a instalação.

### Passo 4 — Abrir o projeto no IntelliJ

1. Abra o **IntelliJ IDEA**.
2. Clique em **Open** (ou **File → Open**).
3. Escolha a pasta do projeto que você extraiu no Passo 1 e clique em **OK**.
4. Se aparecer a pergunta **"Trust project?"**, clique em **Trust Project**.

### Passo 5 — Escolher o Java no projeto

1. No menu de cima, clique em **File → Project Structure...**
2. Na esquerda, clique em **Project**.
3. No campo **SDK**, escolha o **21** que você instalou no Passo 2.
4. Clique em **Apply**.

### Passo 6 — Adicionar a biblioteca JNA

A biblioteca JNA é o que deixa o Java "conversar" com a impressora.

1. Ainda na janela **Project Structure**, clique em **Libraries** na esquerda.
2. Clique no **+** e escolha **Java**.
3. Entre na pasta **libs** do projeto, escolha o arquivo **`jna-5.15.0.jar`** e clique em **OK**.
4. Se perguntar a qual módulo adicionar, clique em **OK**.
5. Clique em **OK** para fechar a janela.

### Passo 7 — Conferir a DLL da impressora

O arquivo **`E1_Impressora01.dll`** precisa estar na **pasta principal do projeto**,
junto com o `Main.java`. Ele já vem no lugar certo, então **não mova esse arquivo**.

### Passo 8 — Rodar o programa

1. Na lista de arquivos à esquerda, dê dois cliques em **`Main.java`**.
2. Clique no botão verde ▶️ ao lado de `public class Main` e escolha **Run 'Main.main()'**.
3. O programa vai aparecer na parte de baixo da tela.

> ⚠️ **Se aparecer erro dizendo que não achou a DLL ou o arquivo XML:**
> vá em **Run → Edit Configurations...**, procure o campo **Working directory**
> e escolha a pasta do projeto. Depois clique em **OK** e rode de novo.

---

## 🔑 Passo 9 — Entrar no programa

Digite na parte de baixo da tela (e aperte **Enter** depois de cada um):

| Usuário | Senha |
|---|---|
| `admin` | `1234` |

Você tem **3 tentativas**. Se errar as 3, o programa fecha.

---

## 🖨️ Passo 10 — Usar a impressora

Sempre que for usar, **faça primeiro a opção 1 e depois a opção 2**:

1. Digite **1** (Configurar conexão) e responda:
   - Tipo: **1**
   - Modelo: **i9** (ou **i8**, conforme a sua impressora)
   - Conexão: **USB**
   - Parâmetro: **0**
2. Digite **2** (Abrir conexão). Deve aparecer **"Conexão aberta com sucesso."**
3. Agora escolha o que quer fazer, por exemplo **4** para imprimir um texto.
4. Quando terminar, digite **0** para sair.

### Opções do menu

| Opção | O que faz |
|---|---|
| 1 | Configurar conexão |
| 2 | Abrir conexão |
| 3 | Fechar conexão |
| 4 | Imprimir texto (você escolhe o texto e quantas cópias) |
| 5 | Imprimir QR Code (você escolhe o conteúdo) |
| 6 | Imprimir código de barras de exemplo |
| 7 | Imprimir cupom XML SAT (digite `XMLSAT.xml`) |
| 8 | Imprimir cancelamento XML SAT (digite `CANC_SAT.xml`) |
| 9 | Abrir gaveta de dinheiro |
| 10 | Sinal sonoro (você escolhe quantos bips) |
| 11 | Avançar papel (você escolhe quantas linhas) |
| 0 | Sair |

---

## ❓ Problemas comuns

| O que aparece | O que fazer |
|---|---|
| `Conexão fechada. Abra a conexão antes (opção 2).` | Faça a opção 1 e depois a opção 2. |
| `Configure a conexão antes (opção 1).` | Faça a opção 1 primeiro. |
| `Erro ao abrir conexão. Código de erro: ...` | Confira se a impressora está ligada e com o cabo USB conectado. Confira também se digitou `i9`/`i8` e `USB` corretamente na opção 1. |
| `Não foi possível ler o arquivo` | Confira se digitou o nome do arquivo certo, com `.xml` no final (ex: `XMLSAT.xml`). |
| `Valor inválido! Digite apenas números.` | Digite só números, sem letras ou espaços. |

---

## 📁 Arquivos do projeto

| Arquivo | Para que serve |
|---|---|
| `Main.java` | O código do programa |
| `E1_Impressora01.dll` | Arquivo da Elgin que conversa com a impressora |
| `libs/jna-5.15.0.jar` | Biblioteca que permite o Java usar a DLL |
| `XMLSAT.xml` | Exemplo de cupom SAT (opção 7) |
| `CANC_SAT.xml` | Exemplo de cancelamento SAT (opção 8) |

---

## 👥 Autores

- João Vitor Delfino
- Nathan Feitosa
