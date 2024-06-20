package main.com.meuBanco;

public class Main {
        public static void main(String[] args) {
            Cliente cliente1 = new Cliente("João Silva", "123.456.789-00");
            Cliente cliente2 = new Cliente("Maria Souza", "987.654.321-00");

            ContaCorrente contaCorrente = new ContaCorrente(cliente1, 10.0);
            ContaPoupanca contaPoupanca = new ContaPoupanca(cliente2, 0.5);

            Banco banco = new Banco();
            banco.adicionarConta(contaCorrente);
            banco.adicionarConta(contaPoupanca);

            contaCorrente.depositar(1000.0);
            contaPoupanca.depositar(2000.0);

            contaCorrente.transferir(200.0, contaPoupanca);

            contaCorrente.cobrarTaxa();
            contaPoupanca.aplicarJuros();

            System.out.println("Saldo Conta Corrente: " + contaCorrente.getSaldo());
            System.out.println("Saldo Conta Poupança: " + contaPoupanca.getSaldo());
        }

}
