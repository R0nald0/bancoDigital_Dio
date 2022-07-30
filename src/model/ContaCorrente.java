package model;

public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public  void  imprimir(){
           System.out.println("Dados Conta Corrente");
           super.imprimirStatusConta();
    }


}
