package main.com.meuBanco;

public class ContaCorrente extends Conta {
    private double taxaManutencao;

    public ContaCorrente(Cliente cliente, double taxaManutencao) {
        super(cliente);
        this.taxaManutencao = taxaManutencao;
    }

    // Método para cobrar taxa de manutenção
    public void cobrarTaxa() {
        sacar(taxaManutencao);
    }

    // Getters e Setters
    public double getTaxaManutencao() {
        return taxaManutencao;
    }

    public void setTaxaManutencao(double taxaManutencao) {
        this.taxaManutencao = taxaManutencao;
    }
}