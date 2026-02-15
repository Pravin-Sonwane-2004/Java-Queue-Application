package org.example.services;

import java.util.Scanner;

public class EnQueue {
    Initialize ini;

    public EnQueue(Initialize ini) {
        this.ini = ini;
    }
    Scanner sc = new Scanner(System.in);


    public void enQueue(int data) {
        if(ini.capacity-1 ==ini.tail) {
            throw new RuntimeException("Cant Add Element Queue Is Full");
        }
        ini.tail = (ini.tail+1) % ini.capacity;
        ini.arr[ini.tail]= data;
        ini.size++;
    }
}
