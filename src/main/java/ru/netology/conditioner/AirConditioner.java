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

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature > maxTemperature) {
            this.currentTemperature = maxTemperature;
            return;
        }
        if (currentTemperature < minTemperature) {
            this.currentTemperature = minTemperature;
            return;
        }
        this.currentTemperature = currentTemperature;

    }

    public void increaseCurrentTemperature() {
//        если текущая >= макс увеличить на 1
        if (currentTemperature >= maxTemperature)
            return;
        currentTemperature++;
    }

    public void decreaseCurrentTemperature() {
//        если текущая <= мин уменьшить на 1
        if (currentTemperature <= minTemperature)
            return;
        currentTemperature--;
    }
}

