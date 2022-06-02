package ru.netology.statistic;

public class Radio {

    private int currentStation;

    public void setCurrentStation(int сurrentStation) {
        if (сurrentStation < 0) {
            return;
        }
        if (сurrentStation > 9) {
            return;
        }
        this.currentStation = сurrentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void increaseStation() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
            if (currentStation > 9) {
                int currentStation = 0;
                setCurrentStation(currentStation);
            }
        }
    }

    public void reduceStation() {
        if (currentStation < 9) {
            currentStation = currentStation - 1;
            if (currentStation <= -1) {
                int currentStation = 9;
                setCurrentStation(currentStation);
            }
        }
    }

    private int currentVolume;

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 10) {
            currentVolume = currentVolume - 1;
        }
    }
}
