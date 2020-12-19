package ee.ut.weatherapp.entity;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="place")
@XmlAccessorType(XmlAccessType.FIELD)
public class Place {
    String name;
    String phenomenon;
    @XmlElement(name="tempmin")
    int tempMin;
    @XmlElement(name="tempmax")
    int tempMax;

    public String getName() {
        return name;
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
}
