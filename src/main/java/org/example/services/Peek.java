package org.example.services;

public class Peek {
    Initialize ini;
        public Peek(Initialize ini) {
            this.ini = ini;
        }
    public int peek() {
            if(ini.front == -1) {
                throw new RuntimeException("Queue is Empty");
            }
            return ini.arr[ini.front];
    }
}
