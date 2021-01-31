package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NovoMenu {
    /* Crie um programa com um menu onde o usuário pode escolher entre adicionar um
     nome na lista de chamada ou sair do programa. Caso o usuário selecione adicionar
    um nome o programa deve permitir digitar o nome do aluno e salvar esse nome em uma lista.
    Caso ele selecione sair o programa deve exibir a lista com todos os nomes adicionados anteriormente.
     */
    public static void main(String[] args){
        List<String> nomes = new ArrayList<>();
        boolean modoSair = true;
        while(modoSair = false){
            System.out.println("Menu \nDigite 1 para adicionar um nome \nDigite 2 para sair");
            int resposta = new Scanner(System.in).nextInt();
            if(resposta == 1){
                System.out.println("Digite um nome para cadastrar");
                String nome = new Scanner(System.in).nextLine();
                nomes.add(nome);

            } else if(resposta == 2){
                System.out.println("Volte sempre \n" + "Lista de nomes" + nomes);
                modoSair = false;
            }
        }
    }
/*
*   List<String> nomes = new ArrayList<>();
        boolean continuar = true;

        while (continuar){
            System.out.println("Menu \nDigite 1 para adicionar um nome \nDigite 2 para sair");
            int resposta = new Scanner(System.in).nextInt();
            if (resposta == 1){
                System.out.println("Qual nome vai ser adiconado? ");
                String nome = new Scanner(System.in).nextLine();
                nomes.add(nome);
            }else if(resposta == 2){

            *
* */



}
