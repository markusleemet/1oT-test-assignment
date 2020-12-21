package ee.ut.weatherapp.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "forecasts")
public class Forecasts {
    ArrayList<Forecast> forecast;

    public ArrayList<Forecast> getForecast() {
        return forecast;
    }
}
