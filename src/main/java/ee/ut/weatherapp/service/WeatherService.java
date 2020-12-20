package ee.ut.weatherapp.service;

import ee.ut.weatherapp.entity.Forecasts;
import org.apache.tomcat.util.digester.DocumentProperties;
import org.springframework.stereotype.Service;

import javax.sound.sampled.AudioFormat;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

@Service
public class WeatherService {

    public Forecasts convertForecast() throws IOException, InterruptedException, JAXBException {
        HttpClient httpClient = HttpClient.newHttpClient();

        HttpRequest httpRequest = HttpRequest.newBuilder()
                .GET()
                .header("Content-Type", "application/json")
                .header("User-Agent", "PostmanRuntime/7.26.8")
                .uri(URI.create("http://www.ilmateenistus.ee/ilma_andmed/xml/forecast.php?lang=eng"))
                .build();

        HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString(Charset.forName("iso-8859-1")));


        JAXBContext context = JAXBContext.newInstance(Forecasts.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();


        Forecasts forecasts = (Forecasts) unmarshaller.unmarshal(new StringReader(httpResponse.body()));
        return forecasts;
    }
}
