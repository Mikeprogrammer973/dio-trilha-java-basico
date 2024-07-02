package banco;

import banco.cliente.Cliente;

class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente){
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\n\n------- Extrato Conta Corrente -------\n");
        infoConta();
    }
    
}
