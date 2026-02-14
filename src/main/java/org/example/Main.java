package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Queue q  = new Queue();
        Initialize ini = new Initialize();
        Push p = new Push(ini);
        q.queueImpl();
        int choice;
        IO.println("Enter the choice");
        choice = sc.nextInt();
        IO.println("1 . Push Operation");
        if(choice==1) {
            IO.println("Enter The Element");
            int ele = sc.nextInt();
            p.push(ele);

        }

    }
}
