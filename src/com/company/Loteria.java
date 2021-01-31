package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Loteria {

    public static void main(String[] args){
        List<Integer> listaNumero = new ArrayList<>();
        Random sorteio = new Random();
        int contRepeticao = 0;
        for(int contador = 0; contador <= 5; contador++){
            int numero = sorteio.nextInt(10);
            if (!listaNumero.contains(numero)) {
                listaNumero.add(numero);
            } else {
                contRepeticao++;
                contador--;
            }
        }

        System.out.println(listaNumero);
        System.out.println("Houve repetição de números " + contRepeticao + " vezes");
    }
}
