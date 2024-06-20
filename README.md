
## Classes

### Cliente
Representa um cliente do banco com os seguintes atributos:
- `nome`: Nome do cliente.
- `cpf`: CPF do cliente.

### Conta
Classe abstrata que representa uma conta bancária. Atributos e métodos:
- `numeroConta`: Número da conta.
- `saldo`: Saldo da conta.
- `cliente`: Cliente associado à conta.
- `depositar(double valor)`: Deposita um valor na conta.
- `sacar(double valor)`: Saca um valor da conta.
- `transferir(double valor, Conta contaDestino)`: Transfere um valor para outra conta.

### ContaCorrente
Herda de `Conta` e adiciona:
- `taxaManutencao`: Taxa de manutenção da conta.
- `cobrarTaxa()`: Método para cobrar a taxa de manutenção.

### ContaPoupanca
Herda de `Conta` e adiciona:
- `taxaJuros`: Taxa de juros da conta poupança.
- `aplicarJuros()`: Método para aplicar os juros sobre o saldo.

### Banco
Gerencia uma lista de contas. Métodos:
- `adicionarConta(Conta conta)`: Adiciona uma nova conta ao banco.
- `buscarConta(int numeroConta)`: Busca uma conta pelo número.
- `getContas()`: Retorna a lista de contas.

### Main
Classe principal para testar o funcionamento do banco.

## Como Executar

### Pré-requisitos
- Java JDK 8 ou superior
- Gradle 6 ou superior (opcional, para build e gerenciamento de dependências)

### Compilação e Execução

1. Clone o repositório:
   ```sh
   git clone https://github.com/daltonwitz/BancoDigital.git
   cd BancoDigital
