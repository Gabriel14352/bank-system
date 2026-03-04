package br.com.seubanco.model;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente){
        super(cliente);
    }

    @Override
    public void exibirDados(){
        System.out.println(" === conta poupança ===");
        super.exibirDados();
    }
}
