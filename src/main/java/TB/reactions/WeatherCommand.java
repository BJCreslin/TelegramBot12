package TB.reactions;

import weather.Forecast;
import weather.Weather;

import java.util.List;

public class WeatherCommand implements Comandable {
    @Override
    public String execute() {
        try {
            List<Forecast> weatherList = Weather.getWeather();
            return "Погода в Томске на \n" +
                    weatherList.get(0).getDay() + "." +
                    weatherList.get(0).getMonth() + "." +
                    weatherList.get(0).getYear() + "  " +
                    weatherList.get(0).getHour() + " часов \n" +
                    "Температура: " + (weatherList.get(0).getMaxTemperature() + weatherList.get(0).getMinTemperature()) / 2 +
                    "\n" +
                    "Давление: " + (weatherList.get(0).getMaxPressure() + weatherList.get(0).getMinPressure()) / 2;
        } catch (Exception Ex) {
            return "Не могу получить погодные данные";
        }
    }
}
