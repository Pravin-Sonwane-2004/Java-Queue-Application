package org.example;

import java.util.Scanner;

public class Push {
    Scanner sc = new Scanner(System.in);
    Initialize ini;

    public Push(Initialize ini) {
        this.ini = ini;
    }


    void push(int n) {
        if(ini.tail == ini.capacity) {
            ini.arr[ini.tail++] = n;
            System.out.println("Inserted: " + n);
        }
    }
}
