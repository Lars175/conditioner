package ru.netology.conditioner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionerTest {

    @Test
    void setCurrentTemperature() {


    }

    @Test
    void increaseCurrentTemperature() {

        AirConditioner conditioner = new AirConditioner();

//        conditioner.setMaxTemperature(30);
//        conditioner.setMinTemperature(7);
        conditioner.setCurrentTemperature(23);
//        conditioner.setOn(true);
        conditioner.increaseCurrentTemperature();
        int expected = 24;
        int actual = conditioner.getCurrentTemperature();

        assertEquals(expected, actual);
    }

    @Test
    public void decreaseCurrentTemperature() {

        AirConditioner conditioner = new AirConditioner();

//        conditioner.setMaxTemperature(30);
//        conditioner.setMinTemperature(7);
        conditioner.setCurrentTemperature(10);
//        conditioner.setOn(true);
        conditioner.decreaseCurrentTemperature();
        int expected = 9;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);
    }
}