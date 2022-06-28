package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatisticServiceTest {

    Radio radio = new Radio();

    @Test
    void station() {
        radio.setCurrentStation(7);

        int actual = radio.getCurrentStation();
        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    void stationAboveMax() {
        radio.setCurrentStation(10);
        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void stationBelowMin() {
        radio.setCurrentStation(-1);
        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void increaseStation() {
        radio.setCurrentStation(7);
        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void increaseStationMax() {
        radio.setCurrentStation(9);
        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void increaseStationAboveMax() {
        radio.setCurrentStation(10);
        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void increaseStationBelowMin() {
        radio.setCurrentStation(-1);
        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void reduceStation() {
        radio.setCurrentStation(7);
        radio.prevStation();

        int actual = radio.getCurrentStation();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    void reduceStationMin() {
        radio.setCurrentStation(0);
        radio.prevStation();

        int actual = radio.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void reduceStationBelowMin() {
        radio.setCurrentStation(-1);
        radio.prevStation();

        int actual = radio.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void reduceStationAboveMax() {
        radio.setCurrentStation(10);
        radio.prevStation();

        int actual = radio.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }


    //  звук

    @Test
    void CurrentVolume() {
        radio.setCurrentVolume(-1);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume() {
        radio.setCurrentVolume(7);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeMax() {
        radio.setCurrentVolume(10);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeHighMax() {
        radio.setCurrentVolume(11);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void reduceVolume() {
        radio.setCurrentVolume(3);
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    void reduceVolumeMin() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }
}
