package org.example;


import org.example.services.Initialize;

import java.util.Scanner;

public class Queue {
    Scanner sc = new Scanner(System.in);

        void queueCalling() {

            IO.println()


            int choice;
            do{
                IO.println("1.Enqueue");
                IO.println("2.Dequque");
                IO.println("3.Peek");
                IO.println("4.IsEmpty");
                IO.println("5.ISFull");
                IO.println();
                IO.println("Enter Your Choice");
                 choice = sc.nextInt();
                 switch (choice) {
                     case 1:

                 }
            }
            while(choice != 6);
        }
}
