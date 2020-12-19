package ee.ut.weatherapp.entity;





import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="wind")
@XmlAccessorType(XmlAccessType.FIELD)
public class Wind {
    String name;
    String direction;
    @XmlElement(name="speedmin")
    int speedMin;
    @XmlElement(name="speedmax")
    int speedMax;
    int gust;

    public String getName() {
        return name;
    }

    public String getDirection() {
        return direction;
    }

    public int getSpeedMin() {
        return speedMin;
    }

    public int getSpeedMax() {
        return speedMax;
    }

    public int isGust() {
        return gust;
    }
}
