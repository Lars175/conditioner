package ru.netology.conditioner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionerTest {

    @Test
    void increaseCurrentTemperature() {

        AirConditioner conditioner = new AirConditioner();
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(23);
        conditioner.increaseCurrentTemperature();
        assertEquals(24, conditioner.getCurrentTemperature());

    }

    @Test
    void decreaseCurrentTemperature() {

        AirConditioner conditioner = new AirConditioner();
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(8);
        conditioner.decreaseCurrentTemperature();
        assertEquals(7, conditioner.getCurrentTemperature());
    }


    @Test
    void currentTemperatureMoreMaxTemperature() {

        AirConditioner conditioner = new AirConditioner();
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(34);
        conditioner.increaseCurrentTemperature();
        int actual = conditioner.getCurrentTemperature();
        assertEquals(conditioner.getMaxTemperature(), actual);
    }


    @Test
    public void currentTemperatureLessMinTemperature() {

        AirConditioner conditioner = new AirConditioner();
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(3);
        conditioner.decreaseCurrentTemperature();
        int actual = conditioner.getCurrentTemperature();
        assertEquals(conditioner.getMinTemperature(), actual);
    }

    @Test
    void currentTemperatureEqualMaxTemperature() {

        AirConditioner conditioner = new AirConditioner();
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(30);
        conditioner.increaseCurrentTemperature();
        int actual = conditioner.getCurrentTemperature();
        assertEquals(actual, conditioner.getMaxTemperature());
    }

    @Test
    void currentTemperatureEqualMinTemperature() {

        AirConditioner conditioner = new AirConditioner();
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(7);
        conditioner.decreaseCurrentTemperature();
        int actual = conditioner.getCurrentTemperature();
        assertEquals(actual, conditioner.getMinTemperature());
    }

    @Test
    void increaseCurrentTemperatureIsOff() {

        AirConditioner conditioner = new AirConditioner();
        conditioner.setOn(false);
        conditioner.setCurrentTemperature(23);
        conditioner.increaseCurrentTemperature();
        assertEquals(23, conditioner.getCurrentTemperature());
        assertEquals(false, conditioner.isOn());

    }

    @Test
    void decreaseCurrentTemperatureConditionerIsOFF() {
        AirConditioner conditioner = new AirConditioner();
        conditioner.setOn(false);
        conditioner.setCurrentTemperature(8);
        conditioner.decreaseCurrentTemperature();
        assertEquals(8, conditioner.getCurrentTemperature());
        assertEquals(false, conditioner.isOn());
    }

}