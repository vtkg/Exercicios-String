package com.company;

import java.util.Locale;
import java.util.Scanner;

public class exc4 {
    public static void main(String[] args) {
        System.out.println("Digite seu nome");
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine().toUpperCase(Locale.ROOT);
        String[] letrasNome = nome.split("");

        for (int i=0; i<nome.length();i++){
            for (int j=0; j<(i+1);j++){
                System.out.print(letrasNome[j]);
            }
            System.out.println();
        }
    }
}
