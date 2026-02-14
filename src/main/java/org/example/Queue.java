package org.example;


import org.example.services.EnQueue;
import org.example.services.Initialize;

import java.util.Scanner;

public class Queue {
    Scanner sc = new Scanner(System.in);
    Initialize ini = new Initialize();
//
    void queueCalling() {

            IO.println("Enter The Size Of Array");
            int size = sc.nextInt();
        ini.initialize(size);
        EnQueue q = new EnQueue(ini);

        IO.println("Array Created Of Size : " + size);
    IO.println();
            int choice;
            do{
                IO.println("1.Enqueue");
                IO.println("2.Dequque");
                IO.println("3.Peek");
                IO.println("4.IsEmpty");
                IO.println("5.ISFull");
                IO.println();
                IO.println("Enter Your Choice : ");
                 choice = sc.nextInt();
                 switch (choice) {
                     case 1:
                         q.enQueue();
                 }
            }
            while(choice != 6);
        }
}
