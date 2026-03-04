package br.com.seubanco.main;

import br.com.seubanco.model.*;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Gabriel", "123456789000");

        Conta cc = new ContaCorrente(cliente1);
        Conta cp = new ContaPoupanca(cliente1);

        cc.depositar(1000);
        cc.transferir(300, cp);

        cc.exibirDados();
        System.out.println();
        cp.exibirDados();
    }
}
