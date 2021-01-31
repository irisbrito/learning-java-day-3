package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {

    public static void main(String[] args){
        List<String> listaNomes = new ArrayList<>();
        listaNomes.add("Iris");
        listaNomes.addAll(Arrays.asList("Camila", "Marco", "Ronaldo"));

        System.out.println(listaNomes.get(2));
        System.out.println(listaNomes.contains("Camila"));
        System.out.println(listaNomes.contains("Xablau"));

        System.out.println(listaNomes.remove(0));
        System.out.println(listaNomes.remove("Ronaldo"));

    }
}
