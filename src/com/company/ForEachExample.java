package com.company;

import java.util.Locale;

public class ForEachExample {
    public static void main(String[] args) {
        String[] nomes = {"Vinicius", "Camila", "Eliseu", "Marco"};

        for(String nome: nomes){
            System.out.println(nome.toUpperCase()+ " está presente");
        }

    }

}
