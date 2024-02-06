package org.example;

import org.w3c.dom.ls.LSOutput;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;

import static org.example.Basic.runBasic;

public class Main {
    public static void main(String[] args) {

        // testDataTypes();
        // testArrayLists();


        /* int[] list = {1, 3, 5};
        int[] list2 = {10, 43, 2};

        gangMedTo(list);
        gangMedTo(list2);
        System.out.println(gangMedTo(list));
        ArrayList<Integer> CheckList = gangMedTo(list2);
        System.out.println(CheckList);

         */

        runBasic();

    }

    public static void testDataTypes() {

        String name = "Yousra";
        System.out.println(name);
        name = "Adam";
        System.out.println(name);

        // tal under 128 (fylder 1 byte)
        byte myByte = 100;
        // hele tal (4 byte)
        int number = 10;

        //komma tal op til 6-7 decimal tal med "f" bag på. (4 bytes)
        float tal = 5.7f;

        long myLong = 100000000;

        // længere decimal tal (8 bytes)
        double nytTal = 2.1;

        //enkel bogstav (2 byte);
        char myChar = 'A';

        System.out.println(tal + number + nytTal);
    }

    public static void testArrayLists() {

        String[] stringArray = {"Adam", "Yousra"};

        ArrayList<String> list = new ArrayList<>();

        for (String name : stringArray) {
            list.add(name);
            System.out.println(list);


        }
        ;
        for (int i = 1; i <= 8; i++) {
            System.out.println(i);
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("dette tal er ulige");
        }
        int count = 0;
        while (count < 10) {
            System.out.println("while " + count + " er mindre end 10");
            count++;

        }

    }


    // Returner en ny liste med tallene fra "list" ganget med 2

    // første int[] er datatypen for returværdien for metoden. Anden int[] er datatypen for list.


    public static ArrayList<Integer> gangMedTo(int[] list) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < list.length; i++) {
            int currentNumber = list[i];
            int doubleNumber = currentNumber * 2;
            newList.add(doubleNumber);
        }
        return newList;
    }


};
