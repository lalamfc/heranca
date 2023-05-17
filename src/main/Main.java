package main;

import cliente.Cliente;
import cliente.Profissao;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Maria");

        Profissao profissao = new Profissao();
        profissao.setNomeDaProfissao("Professor");
    }
}
