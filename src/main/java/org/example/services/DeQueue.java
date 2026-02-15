package org.example.services;

public class DeQueue {
    Initialize ini;

    public DeQueue(Initialize ini) {
        this.ini = ini;
    }

    public int deQueue() {
        if(ini.front==-1) {
            throw new RuntimeException("Cant Remove Element Queue is Empty");
        }
        int remove = ini.arr[ini.front];
        ini.front=(ini.front+1) % ini.capacity;
        ini.size--;
        return remove;
    }
}
