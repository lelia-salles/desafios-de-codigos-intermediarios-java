import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RegistroTransacoesComStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        int quantidadeTransacoes = scanner.nextInt();

        List<Transacao> transacoes = new ArrayList<>();

        for (int i = 1; i <= quantidadeTransacoes; i++) {
            char tipoTransacao = scanner.next().charAt(0);
            double valorTransacao = scanner.nextDouble();

            // TODO: Criar uma nova transação e adicioná-la à lista de transações
            // Criação correta da transação
            Transacao transacao = new Transacao(tipoTransacao, valorTransacao);
            transacoes.add(transacao);

            // Verifica e atualiza o saldo da conta com base no tipo de transação (case-insensitive)
            char tipoUpper = Character.toUpperCase(transacao.getTipo());
            if (tipoUpper == 'D') {
                saldo += valorTransacao;
            } else if (tipoUpper == 'S') {
                saldo -= valorTransacao;
            }
        }

        // Formatação do saldo com uma casa decimal
        System.out.printf("Saldo : %.1f%n", saldo);
        System.out.println("Transacoes:");

        // Formatação das transações conforme esperado nos testes
        transacoes.stream()
                .map(t -> String.format("%c de %.1f", t.getTipo(), t.getValor()))
                .forEach(System.out::println);

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}

class Transacao {
    private char tipo;
    private double valor;

    public Transacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public char getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }
}
