package main.com.meuBanco;

public class ContaPoupanca extends Conta {
    private double taxaJuros;

    public ContaPoupanca(Cliente cliente, double taxaJuros) {
        super(cliente);
        this.taxaJuros = taxaJuros;
    }

    // Método para aplicar juros
    public void aplicarJuros() {
        double juros = getSaldo() * (taxaJuros / 100);
        depositar(juros);
    }

    // Getters e Setters
    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
}