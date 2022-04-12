package com.company;

import com.company.linkedList.Lista;
import com.company.linkedList.No;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long  tamanho = 1500000000000000l;


        Lista lista = new Lista(tamanho);

//        lista.pushFrontNo(new No( "teste", 1));
//
//        lista.pushFrontNo(new No( "teste2", 2));
//
//        lista.pushFrontNo(new No( "teste3", 3));
//
//        lista.pushFrontNo(new No( "teste4", 3));
//
//        lista.pushFrontNo(new No( "teste5",4));
//
//        lista.pushFrontNo(new No( "teste6",5));
//
//       // lista.updatedNO("teste575757", 3);
//        lista.listarLista();

        String generatedString = null;
        for (int h = 0; h < 10000; h++) {
            int leftLimit = 48; // numeral '0'
            int rightLimit = 122; // letter 'z'
            int targetStringLength = 10;
            Random random = new Random();

            generatedString = random.ints(leftLimit, rightLimit + 1)
                    .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                    .limit(targetStringLength)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();

            if (h ==1) {
                lista.pushFrontNo(new No("bola", (int) (Math.random() * tamanho)));
            } else {
                lista.pushFrontNo(new No(generatedString, (int) (Math.random() * tamanho)));
            }
        }
        No buscaItem = lista.search(sc.next());
        if (buscaItem != null) {
            System.out.println(buscaItem.getInfo());
        } else {
            System.out.println("nao  encontrado");
        }


    }
}
