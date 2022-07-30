package model;

public abstract class Conta implements  Iconta{

    private static int  SEQUENCIAL = 1;
    private static int  CCONTA_PADRAO = 1;
    protected int numeroConta;
    protected double saldo;
    protected double agencia ;

    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia= CCONTA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.cliente =cliente;
    }



    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getAgencia() {
        return agencia;
    }

    public void setAgencia(double agencia) {
        this.agencia = agencia;
    }


    protected void imprimirStatusConta(){
        System.out.println( "Titular :" + this.cliente.nome);
        System.out.println( "Agencia :" + this.agencia);
        System.out.println( "Conta : " + this.numeroConta);
        System.out.println( "Saldo : " + this.saldo);
    }

    @Override
    public double sacar(double valor) {
         return  this.saldo -=valor;
    }

    @Override
    public void transferir(double valor, Conta conta) {
          sacar(valor);
          conta.depositar(valor);

    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }
}
