package org.example;


import java.util.Scanner;

public class Queue {

    void queueImpl() {
        Scanner sc = new Scanner(System.in);

        Initialize ini = new Initialize();

        System.out.println("Enter size:");
        int size = sc.nextInt();

        ini.initialize(size);

        System.out.println("Queue initialized successfully");
    }
}
