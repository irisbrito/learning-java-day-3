package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CadastroSobremesa {

    /*Faça um programa que permita cadastrar o nome de uma pessoa junto com a sobremesa favorita dela, esse programa
     deve permitir ao usuário digitar um nome e ver qual é a sobremesa favorita dele.
      É necessário ter a opção para sair também
     */


        public static Scanner criarScanner(){
            return new Scanner(System.in);
        }

        public static String pegarLinha(){
            return criarScanner().nextLine();
        }

        public static void main(String[] args) {
            Map<String, String> mapDeDoces = new HashMap<>();

            boolean continuar = true;
            while (continuar){
                String nome;
                System.out.println("Digite: \n1 para cadastrar\n2 para pesquisar\n3 para sair\n\n");
                int resposta = criarScanner().nextInt();

                if (resposta == 1){
                    String doce;
                    nome = pegarLinha();
                    doce = pegarLinha();
                    mapDeDoces.put(nome, doce);
                }else if(resposta == 2){
                    System.out.println("Digite o nome para pesquisa\n\n");
                    nome = pegarLinha();
                    System.out.println("O "+nome+" gosta de "+mapDeDoces.get(nome));
                }else if(resposta == 3){
                    System.out.println("Tchau e volte sempre");
                    continuar = false;
                }
            }

        }
    }
