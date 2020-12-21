package ee.ut.weatherapp.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "forecasts")
public class Forecasts {
    List<Forecast> forecast;

    public List<Forecast> getForecast() {
        return forecast;
    }
}
