package TB.reactions;

import datetime.Dates;

import java.time.LocalDateTime;

public class DateCommand implements Comandable {
    @Override
    public String execute() {
        Dates dates=new Dates();

        LocalDateTime timePoint = dates.getDate();
        String dateText="Сегодня:";
        dateText += String.valueOf(timePoint.getDayOfMonth());
        dateText += " " + timePoint.getMonth().name() + " ";
        dateText += timePoint.getYear();
        return null;
    }
}
