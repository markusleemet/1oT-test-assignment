package ee.ut.weatherapp.entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="forecast")
public class Forecast {
    @XmlAttribute
    String date;

    @XmlElement(name="day")
    ForecastData day;

    @XmlElement(name="night")
    ForecastData night;

    public String getDate() {
        return date;
    }

    public ForecastData getDay() {
        return day;
    }

    public ForecastData getNight() {
        return night;
    }
}
