package org.example;


import org.example.services.*;

import java.util.Scanner;

public class Queue {
    Scanner sc = new Scanner(System.in);
    Initialize ini = new Initialize();

    void queueCalling() {

            IO.println("Enter The Size Of Array");
            int size = sc.nextInt();
        ini.initialize(size);
        EnQueue q = new EnQueue(ini);
        DeQueue dq = new DeQueue(ini);
        QueueCondition c = new QueueCondition(ini);
        Peek p = new Peek(ini);
        IO.println("Array Created Of Size : " + size);
    IO.println();
            int choice;
            do{
                IO.println("1.Enqueue");
                IO.println("2.Dequeue");
                IO.println("3.Peek");
                IO.println("4.IsEmpty");
                IO.println("5.ISFull");
                IO.println("6.Size");

                IO.println();

                IO.println("Enter Your Choice : ");

                 choice = sc.nextInt();
                 switch (choice) {
                     case 1:
                         IO.println("Enter The Element");
                         int data = sc.nextInt();
                         q.enQueue(data);
                        break;
                     case 2 :
                         IO.println("Removed Element :" +dq.deQueue());
                         break;
                     case 3 :
                        IO.println(p.peek());
                        break;
                     case 4 :
                         IO.println(c.isEmpty());
                         break;
                     case 5 :
                         IO.println(c.isFull());
                         break;
                     case 6:
                         IO.println(c.size());
                 }
            }

            while(choice != 7);
        }
}
