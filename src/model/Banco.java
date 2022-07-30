package model;

import java.util.ArrayList;
import java.util.List;

public  class Banco {
    String nome;
    private  List<Conta> contas = new ArrayList<Conta>();



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

      public  void addConta(Conta conta){
          this.contas.add(conta);
      }
    public   void listarContas(){
        System.out.println(" Lista de clientes ");
        for (Conta c : this.contas) {
            System.out.println(" Nome: " +c.cliente.nome +" Conta " + c.numeroConta );
        }
    }




}
