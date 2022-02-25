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

    public Manager(int idMax) {
        this.idMax = idMax;
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
        for (int i = 0; i < idMax; i++) {
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
        int lessMax = 0;
        if (idMax >= 10)
            lessMax = 10;
        else
            lessMax = idMax;
        Cinema[] tmp = new Cinema[id];
        for (int i = 0; i < id; i++) {
            int index = cinema.length - i - 1;
            if (i <= lessMax) {
                tmp[i] = cinema[index];

            } else {
                Cinema[] tmp1 = new Cinema[lessMax];
                for (int j = 0; j <= lessMax - 1; j++) {
                    tmp1[j] = tmp[j];
                }
                return tmp1;
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
