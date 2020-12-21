package ee.ut.weatherapp.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ForecastData {
    String phenomenon;
    @XmlElement(name = "tempmin")
    int tempMin;
    @XmlElement(name = "tempmax")
    int tempMax;
    String text;
    ArrayList<Place> place;
    ArrayList<Wind> wind;
    String sea;
    String peipsi;

    public List<Wind> getWind() {
        return wind;
    }

    public String getSea() {
        return sea;
    }

    public String getPeipsi() {
        return peipsi;
    }

    public String getPhenomenon() {
        return phenomenon;
    }

    public int getTempMin() {
        return tempMin;
    }

    public int getTempMax() {
        return tempMax;
    }

    public String getText() {
        return text;
    }

    public List<Place> getPlace() {
        return place;
    }
}
