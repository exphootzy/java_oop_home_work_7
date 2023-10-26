package org.example.patterns.adapter;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class MeteoStore {

    boolean save(MeteoSensor meteoSensor){
        System.out.format("Saving data from sensor [%d] at %s\ntemperature - %f; humidity - %f; pressure - %f\n\r",
                meteoSensor.getId(),
                meteoSensor.getDateTime(),
                meteoSensor.getTemperature(),
                meteoSensor.getHumidity(),
                meteoSensor.getPressure());
        return true;
    }
}
