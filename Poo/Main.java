package br.uft.edu.uft.Poo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> listaDeStrings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String nome;

        System.out.println("Digite os nomes:");
        do {
            nome = scanner.nextLine();
            if(nome.equals("fim")) {
                break;
            }
            listaDeStrings.add(nome);
        } while(true);

        Collections.sort(listaDeStrings);

        System.out.println("Lista ordenada:");
        System.out.println(listaDeStrings);
    }
}
