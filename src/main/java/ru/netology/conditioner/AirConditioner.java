package ru.netology.conditioner;

public class AirConditioner {

    private int maxTemperature = 30;
    private int minTemperature = 7;
    private int currentTemperature;
    private boolean on;

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }


    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
//        if (!isOn()) return;
//        если текущая выше макс
        if (currentTemperature > maxTemperature) {
            this.currentTemperature = maxTemperature;
            return;
        }
//        если текущая ниже мин
        if (currentTemperature < minTemperature) {
            this.currentTemperature = minTemperature;
            return;
        }
        this.currentTemperature = currentTemperature;

    }

    public void increaseCurrentTemperature() {
        if (!isOn()) return;
//        если текущая >= макс увеличить на 1
        if (currentTemperature >= maxTemperature)
            return;
        currentTemperature++;
    }

    public void decreaseCurrentTemperature() {
        if (!isOn()) return;
        if (currentTemperature <= minTemperature) {
            return;
        }
        currentTemperature--;
    }
}

