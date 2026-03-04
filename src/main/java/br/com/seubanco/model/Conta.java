package br.com.seubanco.model;

public abstract class Conta {

    private static int SEQUENCIAL = 1;

    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
        }
    }

    public void sacar(double valor){
        if(valor > 0 && saldo >= valor){
            saldo -= valor;
        }else{
            System.out.println("ERRO: Saldo insuficiente");
        }
    }

    public void transferir(double valor, Conta contaDestino){
        if (valor > 0 && saldo >= valor){
            this.sacar(valor);
            contaDestino.depositar(valor);
        }else{
            System.out.println("ERRO: Transferencia nao realizada");
        }
    }

    public void exibirDados(){
        System.out.println("Conta: " + numero);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Saldo: " + saldo);
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

}
