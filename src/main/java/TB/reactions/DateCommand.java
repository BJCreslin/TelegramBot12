package TB.reactions;

import datetime.Dates;

import java.time.LocalDateTime;
import java.util.HashMap;

public class DateCommand implements Comandable {
    static private HashMap<String, String> mapMonth;

    static {
        mapMonth = new HashMap<>();
        mapMonth.put("january", "Января");
        mapMonth.put("february", "Февраля");
        mapMonth.put("march", "Марта");
        mapMonth.put("april", "Апреля");
        mapMonth.put("may", "Мая");
        mapMonth.put("june", "Июня");
        mapMonth.put("july", "Июля");
        mapMonth.put("august", "Августа");
        mapMonth.put("september", "Сентября");
        mapMonth.put("october", "Октября");
        mapMonth.put("november", "Ноября");
        mapMonth.put("december", "Декабря");


    }

    @Override
    public String execute() {
        Dates dates=new Dates();

        LocalDateTime timePoint = dates.getDate();
        String dateText = "Сегодня: \uD83D\uDCC6 \n";
        dateText += String.valueOf(timePoint.getDayOfMonth());
        dateText += " " + getRusMonthByEngName(timePoint.getMonth().name()) + " ";
        dateText += timePoint.getYear();
        return dateText;
    }

    private String getRusMonthByEngName(String engName) {
        return mapMonth.get(engName.toLowerCase());
    }


}
