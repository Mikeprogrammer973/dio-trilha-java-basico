import banco.Banco;
import banco.Conta;
import banco.cliente.Cliente;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Maria Santana");

        Conta contaCorrente = Banco.abrirConta(0, cliente);
        Conta contaP = Banco.abrirConta(1, cliente);

        Conta joseConta = Banco.abrirConta(0, new Cliente("Jose"));

        contaCorrente.depositar(185);

        contaCorrente.transferir(10, contaP);

        contaCorrente.imprimirExtrato();
        contaP.imprimirExtrato();

        Banco.getContas().stream().forEach(conta -> {
            System.out.println(conta.getNumero());
        });
        
    }
}
