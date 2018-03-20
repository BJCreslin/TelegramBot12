package TB.reactions;

import TB.exceptions.InvalidMonthException;
import TB.objects.Month;
import weather.Forecast;
import weather.Weather;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;

public class WeatherCommand implements Comandable {

    /***
     * Метод возвращает строку с погодой на ближайший час (3,9,15,21 час)
     * @return строка
     * в случае ошибки получения данных о погоде выводится "Не могу получить погодные данные"
     */

    @Override
    public String execute() {
        try {
            List<Forecast> weatherList = Weather.getWeather();
            String textOut = "Погода в Томске на \n";
            try {
                textOut+=weatherList.get(0).getDay()+" ";
                textOut += Month.getMonthByNumberWithDeclension(weatherList.get(0).getMonth()) + "." +
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
            } catch (InvalidMonthException Exx) {
                // textOut += " Нe могу получить дату";
                GregorianCalendar calendar = new GregorianCalendar();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("DD MMMM YYYY", Locale.getDefault());
                textOut += simpleDateFormat.format(calendar.getTime());
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
