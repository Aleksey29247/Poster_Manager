package ru.netology;

public class Manager {
    private Cinema[] cinema;
    private int limitedRecord;
    private int id;

    public Manager() {
        this.cinema = new Cinema[10];
        this.limitedRecord = 10;
        this.id = 0;
    }

    public Manager(int limitedRecord) {
        this.limitedRecord = limitedRecord;
        this.cinema = new Cinema[this.limitedRecord];
        this.id = 0;
    }

    public void addCinema(Cinema obj) {
        if (id < limitedRecord) {
            cinema[id] = obj;
            id++;
        }
    }

    public Cinema[] getAll() {
        for (int i = 0; i < limitedRecord; i++) {
            if (cinema[i] == null) {
                Cinema[] tmp = new Cinema[i];
                for (int count = 0; count < i; count++) {
                    tmp[count] = cinema[count];
                }
                return tmp;
            }
        }
        return cinema;
    }

    public Cinema[] getRevers() {
        Cinema[] tmp = new Cinema[id];
        for (int i = 0; i < id; i++) {
            int index = cinema.length - i - 1;
            tmp[i] = cinema[index];
        }
        return tmp;
    }

    public Cinema[] findLast() {
        int limitedMax = 0;
        if (id < limitedRecord) {
            limitedMax = cinema.length - (limitedRecord - id);
        } else {
            limitedMax = cinema.length;
        }
        Cinema[] tmp = new Cinema[limitedMax];
        for (int i = 0; i <= limitedRecord - 1; i++) {
            int index = limitedMax - i - 1;

            if (i <= id - 1) {
                tmp[i] = cinema[index];

            }
        }
        return tmp;
    }

    public Cinema[] getRevers(int ids) {
        Cinema[] tmp = new Cinema[id];
        for (int i = 0; i < ids; i++) {
            int index = cinema.length - i - 1;
            tmp[i] = cinema[index];
        }
        return tmp;
    }
}
