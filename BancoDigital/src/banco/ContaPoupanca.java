package banco;

import banco.cliente.Cliente;

class ContaPoupanca extends Conta {
    
    public ContaPoupanca(Cliente cliente){
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\n\n------- Extrato Conta Poupança -------\n");
        infoConta();
    }

}
