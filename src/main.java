import model.*;

public  class main {
     public  static void main(String []args ){
          Banco banco = new Banco();
         Cliente cliente =new Cliente();
         cliente.setNome("miua");

         ContaCorrente cc = new ContaCorrente(cliente);
         ContaPoupance cp = new ContaPoupance(cliente);
          banco.addConta(cc);
          banco.addConta(cp);
         cc.depositar(100);

         cc.transferir(100,cp);

         cp.imprimir();
         cc.imprimir();

         banco.listarContas();

     }
}
