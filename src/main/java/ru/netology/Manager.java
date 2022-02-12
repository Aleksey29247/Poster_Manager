package ru.netology;

public class Manager {
    private Cinema[] cinema;
    private int idMax;
    private int id;

    public Manager() {
        this.cinema = new Cinema[10];
        this.idMax = 10;
        this.id = 0;
    }

    public Manager(int idMaxA) {
        this.idMax = idMaxA;
        this.cinema = new Cinema[this.idMax];
        this.id = 0;
    }

    public void addCinema(Cinema obj) {
        if (id < idMax) {
            cinema[id] = obj;
            id++;
        }
    }

    public Cinema[] getAll() {
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

    public Cinema[] getRevers(int ids) {
        Cinema[] tmp = new Cinema[id];
        for (int i = 0; i < ids; i++) {
            int index = cinema.length - i - 1;
            tmp[i] = cinema[index];
        }
        return tmp;
    }
}
