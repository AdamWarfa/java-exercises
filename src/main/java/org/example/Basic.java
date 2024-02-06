package org.example;

import javax.swing.*;
import java.util.ArrayList;

public class Basic {

    public static void runBasic() {
        String name = "Nouhayla";
        System.out.println(name);

        name = "Troels";
        System.out.println(name);

        // 1 bit = 1 binær tal
        // 1 byte = 8 bit

        byte myByte = 10;

        int myInt = 10;

        long myLong = 1000000000;

        float myFloat = 15.6f;

        double myD = 10.5;

        boolean myBoo = true;

        char myChar = 'a';


        String[] myArray = {"Nouhayla", "Troels"};

        byte[] talArray = {1, 2, 9, 34};

        System.out.println(talArray[0]);

        talArray[0] = 5;

        System.out.println(talArray[0]);

        ArrayList<Integer> PussyDrop = new ArrayList<>();

        droptop(talArray, PussyDrop);
        counter();
    }

    public static ArrayList<Integer> droptop(byte[] array, ArrayList<Integer> list) {

        for (byte number : array) {
            list.add(Byte.toUnsignedInt(number));
            System.out.println(list);

        }
        return list;
    }

    //while loop
    public static void counter() {
        int count = 1;
        while (10 >= count) {
            if (count == 5) {
                count++;
                continue;
            } else if (count == 7) {
                break;
            }
            System.out.println("luk ryggen" + " " + count);
            count++;
        }
    }
}

// er true true ? true er altid true :) - Adam.W




