package com.company;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinha {
    /* Faça um programa que gera um número aleatório e peça para o usuário tentar adivinhar qual é esse número.
    Se o usuário acertar o programa deve mostrar a mensagem “parabéns você acertou” e encerrar a execução.
    Se o usuário errar o programa deve exibir “Você errou, tente novamente” e continuar a execução até o usuária acertar.
     */

    public static void main(String[] args){
        Random numeroAleatorio = new Random();
        int numero = numeroAleatorio.nextInt(5);

        System.out.println("Adivinhe o número de 0 a 5");
        int tentativaUsuario = new Scanner(System.in).nextInt();

        while (numero != tentativaUsuario){
        System.out.println("Você errou, tente novamente.");
        tentativaUsuario = new Scanner(System.in).nextInt();
        }
        System.out.println("Parabéns, você acertou!");



    }
}
