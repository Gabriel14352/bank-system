package br.com.seubanco.model;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente){
        super(cliente);
    }

    @Override
    public void exibirDados(){
        System.out.println("=== Conta Corrente ===");
        super.exibirDados();
    }
}
