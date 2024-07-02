package banco;
import java.util.ArrayList;
import java.util.List;

import banco.cliente.Cliente;

public abstract class Banco {
    private static String nome = "DigitalBanc";
    private static List<Conta> contas = new ArrayList<>();;

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Banco.nome = nome;
    }

    public static List<Conta> getContas() {
        return contas;
    }

    public static Conta abrirConta(int tipoConta, Cliente titular)
    {
        Conta conta = (tipoConta == 0 ? new ContaCorrente(titular) : new ContaPoupanca(titular));

        contas.add(conta);

        return conta;
    }
}
