package org.example.services;

public class QueueCondition {
    Initialize ini;
    public QueueCondition(Initialize ini) {
        this.ini = ini;
    }
    public String isEmpty () {
        if(ini.tail==-1) {
            return "Queue Is Empty";
        }
        return "Not Empty";
    }

    public String isFull () {
        if(ini.size == ini.capacity) {
            return "Queue Is full";
        }
        return "Not Full";
    }
    public int size() {
        return ini.size;
    }


}
