package com.company;

import java.util.*;

public class MapExample {
    //estrutura de chave e valor

    public static void main(String[] args){
        Map<String, Integer> contas = new HashMap<>();
        contas.put("vinicius", 865);

        contas.put("camila", 134);
        contas.put("vinicius", 123);

        System.out.println(contas);

        System.out.println(contas.containsKey("xablai"));
        System.out.println(contas.get("vinicius"));
        System.out.println(contas.keySet());
        System.out.println("Pagou "+contas.remove("camila", 134));
        System.out.println("Foi removido e o valor era "+ contas.remove("vinicius"));

        Map<String, Integer> contasDois = new TreeMap<>();
        contasDois.put("vinicius", 856);
        contasDois.put("camila", 123);

        System.out.println(contasDois);
    }

}
