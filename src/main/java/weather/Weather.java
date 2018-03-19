package weather;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Weather {


    public static List<Forecast> getWeather() throws IOException, XMLStreamException {
        List<Forecast> forecastList = new ArrayList<Forecast>();
        Forecast forecast = new Forecast();

        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        String siteName = WeatherSiteName.getSiteName();
        URL url = new URL(siteName);
        InputStream input = url.openStream();
        XMLStreamReader r = xmlInputFactory.createXMLStreamReader(siteName, input);

        try {
            int event = r.getEventType();
            while (true) {
                switch (event) {
                    case XMLStreamConstants.START_DOCUMENT:
                        System.out.println("Start Document.");
                        break;
                    case XMLStreamConstants.START_ELEMENT:
                        System.out.println("Start Element: " + r.getName());
                        if (r.getName().getLocalPart().equals("FORECAST")) {
                            forecast = new Forecast();
                            //                           r.getAttributeValue
                        }
                        for (int i = 0, n = r.getAttributeCount(); i < n; ++i) {
                            System.out.println("Attribute: " + r.getAttributeName(i)
                                    + "=" + r.getAttributeValue(i));
                            if (r.getAttributeName(i).getLocalPart().equals("day")) {
                                forecast.setDay(Integer.parseInt(r.getAttributeValue(i)));
                            }
                            if (r.getAttributeName(i).getLocalPart().equals("month")) {
                                forecast.setMonth(Integer.parseInt(r.getAttributeValue(i)));
                            }
                            if (r.getAttributeName(i).getLocalPart().equals("year")) {
                                forecast.setYear(Integer.parseInt(r.getAttributeValue(i)));
                            }
                            if (r.getAttributeName(i).getLocalPart().equals("hour")) {
                                forecast.setHour(Integer.parseInt(r.getAttributeValue(i)));
                            }
                            if (r.getAttributeName(i).getLocalPart().equals("cloudiness")) {
                                forecast.setCloudiness(Integer.parseInt(r.getAttributeValue(i)));
                            }
                            if ((r.getAttributeName(i).getLocalPart().equals("max")) &
                                    (r.getName().getLocalPart().equals("PRESSURE"))) {
                                forecast.setMaxPressure(Integer.parseInt(r.getAttributeValue(i)));
                            }
                            if ((r.getAttributeName(i).getLocalPart().equals("min")) &
                                    (r.getName().getLocalPart().equals("PRESSURE"))) {
                                forecast.setMinPressure(Integer.parseInt(r.getAttributeValue(i)));
                            }
                            if ((r.getAttributeName(i).getLocalPart().equals("min")) &
                                    (r.getName().getLocalPart().equals("TEMPERATURE"))) {
                                forecast.setMinTemperature(Integer.parseInt(r.getAttributeValue(i)));
                            }
                            if ((r.getAttributeName(i).getLocalPart().equals("max")) &
                                    (r.getName().getLocalPart().equals("TEMPERATURE"))) {
                                forecast.setMaxTemperature(Integer.parseInt(r.getAttributeValue(i)));
                            }
                            if ((r.getAttributeName(i).getLocalPart().equals("max")) &
                                    (r.getName().getLocalPart().equals("WIND"))) {
                                forecast.setMaxWind(Integer.parseInt(r.getAttributeValue(i)));
                            }
                            if ((r.getAttributeName(i).getLocalPart().equals("min")) &
                                    (r.getName().getLocalPart().equals("WIND"))) {
                                forecast.setMinWind(Integer.parseInt(r.getAttributeValue(i)));
                            }
                            if ((r.getAttributeName(i).getLocalPart().equals("min")) &
                                    (r.getName().getLocalPart().equals("RELWET"))) {
                                forecast.setMinRelwet(Integer.parseInt(r.getAttributeValue(i)));
                            }
                            if ((r.getAttributeName(i).getLocalPart().equals("max")) &
                                    (r.getName().getLocalPart().equals("RELWET"))) {
                                forecast.setMaxRelwet(Integer.parseInt(r.getAttributeValue(i)));
                            }


                        }
                        break;
                    case XMLStreamConstants.CHARACTERS:
                        if (r.isWhiteSpace())
                            break;

                        System.out.println("Text: " + r.getText());
                        break;
                    case XMLStreamConstants.END_ELEMENT:
                        System.out.println("End Element:" + r.getName());
                        if (r.getName().getLocalPart().equals("FORECAST")) {
                            forecastList.add(forecast);
                            // forecast = new Forecast();
                            //                           r.getAttributeValue
                        }

                        break;
                    case XMLStreamConstants.END_DOCUMENT:
                        System.out.println("End Document.");
                        break;
                }


                // add cases for each event of interest
                // ...
                if (!r.hasNext())
                    break;

                event = r.next();
            }
        } finally {
            r.close();
        }


// process the stream
// ...
        r.close();
        input.close();
        return forecastList;

    }

}
