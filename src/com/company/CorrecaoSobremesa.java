package com.company;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CorrecaoSobremesa {

    public static Scanner criarScanner(){
        return new Scanner(System.in);
    }

    public static void main(String[] args) {
        Map<String, String> mapDeDoce = new HashMap<>();

        boolean continuar = true;
        while (continuar) {
            System.out.println("Digite 1 para cadastrar um nome e um doce \nDigite 2 para pesquisar um nome" +
                    " \nDigite 3 para sair");
            int resposta = criarScanner().nextInt();

            if (resposta == 1) {
                System.out.println("Digite um nome");
                String nome = criarScanner().nextLine();
                System.out.println("Digite o Doce que a pessoa gosta");
                String doce = criarScanner().nextLine();

                mapDeDoce.put(nome, doce);
            } else if (resposta == 2) {
                System.out.println("Digite um nome para fazer a busca: ");
                String nomePesquisar = criarScanner().nextLine();
                System.out.println("O doce favorito de " + nomePesquisar + " é " + mapDeDoce.get(nomePesquisar));
            } else if (resposta == 3) {
                System.out.println("Tchau volte sempre");
                continuar = false;
            }
        }
    }
}