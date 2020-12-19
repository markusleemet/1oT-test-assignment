package ee.ut.weatherapp.controller;


import ee.ut.weatherapp.entity.Forecasts;
import ee.ut.weatherapp.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.JAXBException;
import java.io.IOException;

@CrossOrigin
@RestController
public class WeatherController {
    WeatherService weatherService;

    @Autowired
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/weather")
    public Forecasts forecast() throws IOException, InterruptedException, JAXBException {

        return weatherService.convertForecast();
    }
}
