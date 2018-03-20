package TB.reactions;

import weather.Forecast;
import weather.Weather;

import java.util.List;

public class WeatherCommand implements Comandable {
    @Override
    public String execute() {
        try {
            List<Forecast> weatherList = Weather.getWeather();
            String textOut = "Погода в Томске на \n";
            textOut += weatherList.get(0).getMonth() + "." +
                    weatherList.get(0).getYear() + "  ";
            switch (weatherList.get(0).getHour()) {
                case 3:
                    textOut += " 3 часа ночи";
                    break;
                case 9:
                    textOut += " 9 часов утра";
                    break;
                case 15:
                    textOut += " 3 часа дня";
                    break;
                case 21:
                    textOut += " 9 часов вечера";
                    break;
                default:
                    textOut += weatherList.get(0).getHour();
            }
            textOut += "\n" + "Температура: " + (weatherList.get(0).getMaxTemperature() + weatherList.get(0).getMinTemperature()) / 2 +
                    " °C" + "\n";
            textOut += "Давление: " + (weatherList.get(0).getMaxPressure() + weatherList.get(0).getMinPressure()) / 2;
            textOut += "mm Hg";


            return textOut;
        } catch (Exception Ex) {
            return "Не могу получить погодные данные";
        }
    }
}
