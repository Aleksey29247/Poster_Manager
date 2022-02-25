package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ManagerTest {
    Cinema cinema = new Cinema("", "", 2000, 10);
    Cinema cinema1 = new Cinema("", "", 2000, 10);
    Cinema cinema2 = new Cinema("", "", 2000, 10);
    Cinema cinema3 = new Cinema("", "", 2000, 10);
    Cinema cinema4 = new Cinema("", "", 2000, 10);
    Cinema cinema5 = new Cinema("", "", 2000, 10);
    Cinema cinema6 = new Cinema("", "", 2000, 10);
    Cinema cinema7 = new Cinema("", "", 2000, 10);
    Cinema cinema8 = new Cinema("", "", 2000, 10);
    Cinema cinema9 = new Cinema("", "", 2000, 10);
    Cinema cinema10 = new Cinema("", "", 2000, 10);
    Cinema cinema11 = new Cinema("", "", 2000, 10);
    Cinema cinema12 = new Cinema("", "", 2000, 10);

    @Test
    public void testShowAllCinema() {
        Manager manager = new Manager();
        manager.addCinema(cinema);
        manager.addCinema(cinema1);
        manager.addCinema(cinema2);
        manager.addCinema(cinema3);
        manager.addCinema(cinema4);
        manager.addCinema(cinema5);
        manager.addCinema(cinema6);
        manager.addCinema(cinema7);
        manager.addCinema(cinema8);
        manager.addCinema(cinema9);
        Cinema[] actual = manager.getAll();
        Cinema[] expected = new Cinema[]{cinema, cinema1, cinema2, cinema3, cinema4, cinema5, cinema6, cinema7, cinema8, cinema9};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testAddMaxIdCinema() {
        Manager manager = new Manager(3);
        manager.addCinema(cinema);
        manager.addCinema(cinema1);
        manager.addCinema(cinema2);
        Cinema[] actual = manager.getAll();
        Cinema[] expected = new Cinema[]{cinema, cinema1, cinema2};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testAddMoreMaxIdCinema() {
        Manager manager = new Manager(3);
        manager.addCinema(cinema);
        manager.addCinema(cinema1);
        manager.addCinema(cinema2);
        manager.addCinema(cinema9);
        Cinema[] actual = manager.getAll();
        Cinema[] expected = new Cinema[]{cinema, cinema1, cinema2};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testShowReversCinema() {
        Manager manager = new Manager();
        manager.addCinema(cinema);
        manager.addCinema(cinema1);
        manager.addCinema(cinema2);
        manager.addCinema(cinema3);
        manager.addCinema(cinema4);
        manager.addCinema(cinema5);
        manager.addCinema(cinema6);
        manager.addCinema(cinema7);
        manager.addCinema(cinema8);
        manager.addCinema(cinema9);
        Cinema[] actual = manager.getRevers();
        Cinema[] expected = new Cinema[]{cinema9, cinema8, cinema7, cinema6, cinema5, cinema4, cinema3, cinema2, cinema1, cinema};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testShowReversMaxIdCinema() {
        Manager manager = new Manager(4);
        manager.addCinema(cinema);
        manager.addCinema(cinema1);
        manager.addCinema(cinema2);
        manager.addCinema(cinema3);

        Cinema[] actual = manager.getRevers(4);
        Cinema[] expected = new Cinema[]{cinema3, cinema2, cinema1, cinema};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testShowLessMaxIdCinema() {
        Manager manager = new Manager(3);
        manager.addCinema(cinema);
        manager.addCinema(cinema1);
        Cinema[] actual = manager.getAll();
        Cinema[] expected = new Cinema[]{cinema, cinema1};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testShowFindLastMaxIdCinema() {
        Manager manager = new Manager(4);
        manager.addCinema(cinema);
        manager.addCinema(cinema1);
        manager.addCinema(cinema2);
        manager.addCinema(cinema3);

        Cinema[] actual = manager.findLast();
        Cinema[] expected = new Cinema[]{cinema3, cinema2, cinema1, cinema};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testShowFindLastMaxIdCinema1() {
        Manager manager = new Manager(13);
        manager.addCinema(cinema);
        manager.addCinema(cinema1);
        manager.addCinema(cinema2);
        manager.addCinema(cinema3);
        manager.addCinema(cinema4);
        manager.addCinema(cinema5);
        manager.addCinema(cinema6);
        manager.addCinema(cinema7);
        manager.addCinema(cinema8);
        manager.addCinema(cinema9);
        manager.addCinema(cinema10);
        manager.addCinema(cinema11);
        manager.addCinema(cinema12);
        Cinema[] actual = manager.findLast();
        Cinema[] expected = new Cinema[]{cinema12, cinema11, cinema10, cinema9, cinema8, cinema7, cinema6, cinema5, cinema4, cinema3};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testShowFindLastMaxIdCinema2() {
        Manager manager = new Manager(5);
        manager.addCinema(cinema);
        manager.addCinema(cinema1);
        manager.addCinema(cinema2);
        manager.addCinema(cinema3);
        manager.addCinema(cinema4);
        manager.addCinema(cinema5);
        manager.addCinema(cinema6);
        manager.addCinema(cinema7);
        manager.addCinema(cinema8);
        manager.addCinema(cinema9);
        manager.addCinema(cinema10);
        manager.addCinema(cinema11);
        manager.addCinema(cinema12);
        Cinema[] actual = manager.findLast();
        Cinema[] expected = new Cinema[]{cinema4, cinema3, cinema2, cinema1, cinema};
        assertArrayEquals(expected, actual);
    }

}

