package model;

public class ContaPoupance extends Conta {

    public ContaPoupance(Cliente cliente) {
        super(cliente);
    }

    public  void  imprimir(){
        System.out.println("Dados Conta Poupanca");
        super.imprimirStatusConta();
    }

}
