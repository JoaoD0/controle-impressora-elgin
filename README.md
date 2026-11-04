# 🖨️ Projeto Cuiabano — Controle de Impressora Térmica Elgin

Trabalho da disciplina de **Lógica de Programação** em Java.

---

## 📘 O que o programa faz

É um programa de terminal que controla uma impressora térmica **Elgin i8/i9**
usando a biblioteca **JNA** e a DLL da Elgin (`E1_Impressora01.dll`).

Depois de fazer login, o usuário usa um menu para configurar e abrir a conexão
com a impressora, imprimir textos, QR Codes, códigos de barras e cupons do SAT
(a partir de arquivos XML), abrir a gaveta de dinheiro, emitir bips e avançar o papel.

---

## 📁 Arquivos do projeto

| Arquivo | Para que serve |
|---|---|
| `Main.java` | Código-fonte do programa |
| `E1_Impressora01.dll` | DLL da Elgin que conversa com a impressora |
| `libs/jna-5.15.0.jar` | Biblioteca JNA, que permite o Java usar a DLL |
| `XMLSAT.xml` | Exemplo de cupom SAT (opção 7) |
| `CANC_SAT.xml` | Exemplo de cancelamento SAT (opção 8) |

---

## ⚙️ Como executar (IntelliJ IDEA)

1. Instale o **JDK 21**.
2. Abra a pasta do projeto no IntelliJ (**File → Open**).
3. Confira o JDK em **File → Project Structure → Project → SDK → 21**.
4. Adicione a biblioteca JNA:
   **File → Project Structure → Libraries → + → Java** e escolha `libs/jna-5.15.0.jar`.
5. Deixe o arquivo `E1_Impressora01.dll` na **raiz do projeto** (mesma pasta do `Main.java`).
6. Em **Run → Edit Configurations...**, deixe o **Working directory** como a pasta do projeto.
   Isso é necessário para o programa achar a DLL e os arquivos XML.
7. Conecte a impressora no USB, abra o `Main.java` e clique em ▶️ **Run**.

---

## 🔑 Login de teste

| Usuário | Senha |
|---|---|
| `admin` | `1234` |

São permitidas 3 tentativas. Depois disso, o programa é encerrado.

---

## 📋 Opções do menu

| Opção | O que faz |
|---|---|
| 1 | Configurar conexão (tipo `1` = USB, modelo `i9`, conexão `USB`, parâmetro `0`) |
| 2 | Abrir conexão |
| 3 | Fechar conexão |
| 4 | Imprimir texto (com número de cópias) |
| 5 | Imprimir QR Code |
| 6 | Imprimir código de barras |
| 7 | Imprimir cupom XML SAT (ex: `XMLSAT.xml`) |
| 8 | Imprimir cancelamento XML SAT (ex: `CANC_SAT.xml`) |
| 9 | Abrir gaveta |
| 10 | Sinal sonoro |
| 11 | Avançar papel |
| 0 | Sair (fecha a conexão se estiver aberta) |

Ordem de uso: **1 → 2** e depois qualquer comando de 4 a 11.
As opções 4 a 11 só funcionam com a conexão aberta.

---

## 👥 Autores

Autores: preencher
