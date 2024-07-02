package banco;

import banco.cliente.Cliente;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 729;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente)
    {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void depositar(double valor) {
        if(valor <= 0)
        {
            System.err.println("Valor deve ser maior do que 0!");
            return;
        }
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if(valor > this.saldo)
        {
            System.err.println("Saldo insuficiente!");
            return;
        }
        this.saldo -= valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void infoConta() {
        System.out.println("Banco: " + Banco.getNome());
        System.out.println("Titular: " + cliente.getNome());
        System.out.println(String.format("Agência: %d", agencia));
        System.out.println(String.format("Número: %d", numero));
        System.out.println(String.format("Número: %.2f", saldo));
    }
}
