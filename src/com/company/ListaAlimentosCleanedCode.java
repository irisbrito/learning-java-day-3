package com.company;

import java.util.*;

public class ListaAlimentosCleanedCode {
    public static Scanner criarScanner(){
        return new Scanner(System.in);
    }

    public static String pegarLinha(){
        return criarScanner().nextLine();
    }

    public static int pegarNumero(){
        return criarScanner().nextInt();
    }

    public static List<String> criarListaDeComidas(){
        List<String> comidas = new ArrayList<>();

        String controle = "";
        do {
            System.out.println("Digite a comida ou sair para finalizar");
            String comida = pegarLinha();
            if(!comida.equalsIgnoreCase("sair")){
                comidas.add(comida);
            }else{
                controle = "sair";
            }
        }while (!controle.equalsIgnoreCase("sair"));

        return comidas;
    }

    public static void main(String[] args) {
        Map<Integer, List<String>> controleComidas = new HashMap<>();

        boolean continuar = true;
        while (continuar){
            System.out.println("Digite \n1 para cadastrar \n2 para pesquisar lista\n3 para sair");
            int resposta = pegarNumero();

            if(resposta == 1){
                System.out.println("Digite o dia");
                int dia = pegarNumero();
                controleComidas.put(dia, criarListaDeComidas());
            }else if(resposta == 2){
                System.out.println("Qual dia vc quer pesquisar? ");
                int dia = pegarNumero();
                System.out.println("No dia "+dia+" você comeu "+controleComidas.get(dia));
            }else if(resposta == 3){
                continuar = false;
                System.out.println("Adeus");
            }
        }

    }
}
