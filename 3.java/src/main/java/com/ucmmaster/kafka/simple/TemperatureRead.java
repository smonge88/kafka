package com.ucmmaster.kafka.simple;

import java.util.Random;

public class TemperatureRead {

    private static final Random RANDOM = new Random();

    /**
     * Device id
     */
    private int id;
    /**
     * Temperature
     */
    private int temperature;

    public TemperatureRead(int id, int temperature) {
        this.id = id;
        this.temperature = temperature;
    }

    public int getId() {
        return id;
    }
    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return String.format("{\"id\":%d, \"temperature\":%d}", id, temperature);
    }

    public static TemperatureRead newRandomTemperatureRead(){
        int id = RANDOM.ints(1, 10).findFirst().getAsInt();
        int temperature = RANDOM.ints(15, 40).findFirst().getAsInt();
        return new TemperatureRead(id,temperature);
    }
}
