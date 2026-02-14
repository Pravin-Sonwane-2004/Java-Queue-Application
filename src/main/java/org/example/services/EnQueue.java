package org.example.services;

import java.util.Scanner;

public class EnQueue {
    Initialize ini;

    public EnQueue(Initialize ini) {
        this.ini = ini;
    }
    Scanner sc = new Scanner(System.in);


    public void enQueue() {
        if(ini.capacity-1 ==ini.tail) {
            throw new RuntimeException("Cant Add Element Queue Is Full");
        }
        IO.println("Enter The Element : ");
        int data = sc.nextInt();
        ini.tail++;
        ini.arr[ini.tail] = data;
    }
}
