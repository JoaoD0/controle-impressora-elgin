import com.sun.jna.Library;
import com.sun.jna.Native;
import java.util.Scanner;
import java.nio.file.*;

public class Main {

    // Interface que representa a DLL, usando JNA
    public interface ImpressoraDLL extends Library {
        ImpressoraDLL INSTANCE = (ImpressoraDLL) Native.load(
                Paths.get("E1_Impressora01.dll").toAbsolutePath().toString(), ImpressoraDLL.class); // DLL na raiz do projeto

        int AbreConexaoImpressora(int tipo, String modelo, String conexao, int param);

        int FechaConexaoImpressora();

        int ImpressaoTexto(String dados, int posicao, int estilo, int tamanho);

        int Corte(int avanco);

        int ImpressaoQRCode(String dados, int tamanho, int nivelCorrecao);

        int ImpressaoCodigoBarras(int tipo, String dados, int altura, int largura, int HRI);

        int AvancaPapel(int linhas);

        int StatusImpressora(int param);

        int AbreGavetaElgin(int pino, int ti, int tf);

        int AbreGaveta(int pino, int ti, int tf);

        int SinalSonoro(int qtd, int tempoInicio, int tempoFim);

        int ModoPagina();

        int LimpaBufferModoPagina();

        int ImprimeModoPagina();

        int ModoPadrao();

        int PosicaoImpressaoHorizontal(int posicao);

        int PosicaoImpressaoVertical(int posicao);

        int ImprimeXMLSAT(String dados, int param);

        int ImprimeXMLCancelamentoSAT(String dados, String assQRCode, int param);
    }

    // ===================== CONSTANTES =====================

    // Usuário e senha aceitos no login
    private static final String USUARIO = "admin";
    private static final String SENHA = "1234";

    // ===================== VARIÁVEIS DO PROGRAMA =====================

    // Guarda se a conexão com a impressora está aberta (true) ou fechada (false)
    private static boolean conexaoAberta = false;

    // Configurações da conexão (preenchidas na opção 1 do menu)
    private static int tipo;
    private static String modelo;
    private static String conexao;
    private static int parametro;

    private static final Scanner scanner = new Scanner(System.in); // Scanner estático e final

    // ===================== LEITURA DE DADOS =====================

    // Função para capturar entradas do usuário (lê uma linha de texto)
    private static String capturarEntrada(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    // Lê um número inteiro digitado pelo usuário.
    // Se ele digitar letras (ou nada), avisa e pergunta de novo.
    public static int lerInteiro(String mensagem) {
        while (true) {
            String texto = capturarEntrada(mensagem).trim();

            // Começa achando que é válido: precisa ter de 1 a 9 caracteres
            // (o limite de 9 evita números grandes demais para um int)
            boolean valido = texto.length() > 0 && texto.length() <= 9;

            // Confere caractere por caractere se todos são dígitos de 0 a 9
            for (int i = 0; i < texto.length(); i++) {
                char caractere = texto.charAt(i);
                if (caractere < '0' || caractere > '9') {
                    valido = false;
                }
            }

            if (valido) {
                return Integer.parseInt(texto); // converte o texto para número
            }

            System.out.println("Valor inválido! Digite apenas números.");
        }
    }

    // ===================== LOGIN =====================

    // Pede usuário e senha. O usuário tem 3 tentativas.
    // Devolve true se acertou, ou false se errou as 3 vezes.
    public static boolean fazerLogin() {
        int maximoTentativas = 3;

        System.out.println("========== LOGIN ==========");

        for (int tentativa = 1; tentativa <= maximoTentativas; tentativa++) {
            String usuarioDigitado = capturarEntrada("Usuário: ");
            String senhaDigitada = capturarEntrada("Senha: ");

            // Strings devem ser comparadas com equals (e não com ==)
            if (usuarioDigitado.equals(USUARIO) && senhaDigitada.equals(SENHA)) {
                System.out.println("Login realizado com sucesso!");
                return true;
            }

            int restantes = maximoTentativas - tentativa;
            if (restantes > 0) {
                System.out.println("Usuário ou senha incorretos. Tentativas restantes: " + restantes);
            }
        }

        System.out.println("Número máximo de tentativas atingido. Acesso bloqueado.");
        return false;
    }

    // Função para configurar conexão
    public static void configurarConexao() {

    }

    public static void abrirConexao() {
        // Função para abrir a conexão com a impressora
        if (!conexaoAberta) {
            int retorno = ImpressoraDLL.INSTANCE.AbreConexaoImpressora(tipo, modelo, conexao, parametro);
            if (retorno == 0) {
                conexaoAberta = true;
                System.out.println("Conexão aberta com sucesso.");
            } else {
                System.out.println("Erro ao abrir conexão. Código de erro: " + retorno);
            }
        } else {
            System.out.println("Conexão já está aberta.");
        }
    }

    public static void fecharConexao() {

    }



    // ===================== MENU =====================

    // Mostra as opções do menu na tela
    public static void exibirMenu() {
        System.out.println("\n*************************************************");
        System.out.println("**************** MENU IMPRESSORA ****************");
        System.out.println("*************************************************\n");

        // Vetor com o texto de cada opção do menu
        String[] opcoes = {
                "1  - Configurar conexão",
                "2  - Abrir conexão",
                "3  - Fechar conexão",
                "4  - Imprimir texto",
                "5  - Imprimir QR Code",
                "6  - Imprimir código de barras",
                "7  - Imprimir cupom XML SAT",
                "8  - Imprimir cancelamento XML SAT",
                "9  - Abrir gaveta",
                "10 - Sinal sonoro",
                "11 - Avançar papel",
                "0  - Sair"
        };

        // Percorre o vetor e mostra cada opção
        for (int i = 0; i < opcoes.length; i++) {
            System.out.println(opcoes[i]);
        }
    }

    // ===================== PROGRAMA PRINCIPAL =====================

    public static void main(String[] args) {
        // Se o login falhar, o programa termina aqui
        if (!fazerLogin()) {
            System.out.println("Programa encerrado.");
            scanner.close();
            return;
        }

        int opcao = -1; // começa com -1 só para entrar no while

        // Repete o menu até o usuário escolher 0 (Sair)
        while (opcao != 0) {
            exibirMenu();
            opcao = lerInteiro("\nDigite a opção desejada: ");

            if (opcao == 1) {
                configurarConexao();
            } else if (opcao == 2) {
                abrirConexao();
            } else if (opcao == 3) {
                fecharConexao();
            } else if (opcao == 0) {
                // Antes de sair, fecha a conexão se ela estiver aberta
                if (conexaoAberta) {
                    fecharConexao();
                }
                System.out.println("Programa encerrado.");
            } else {
                System.out.println("Opção inválida.");
            }
        }

        scanner.close(); // Fecha o scanner ao final do programa
    }
}
