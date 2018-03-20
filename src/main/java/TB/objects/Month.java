package TB.objects;

import TB.exceptions.InvalidMonthException;

import java.util.ArrayList;

public class Month {
    /**
     * Класс для выдачи корректного значения месяца
     */

    private static ArrayList<String> monthList;

    static {
        monthList = new ArrayList<>();
        monthList.add("Января");
        monthList.add("Февраля");
        monthList.add("Марта");
        monthList.add("Апреля");
        monthList.add("Мая");
        monthList.add("Июня");
        monthList.add("Июля");
        monthList.add("Августа");
        monthList.add("Сентября");
        monthList.add("Октября");
        monthList.add("Ноября");
        monthList.add("Декабря");
    }

    public static String getMonthByNumberWithDeclension(int number) throws InvalidMonthException {
        if ((number < 1) || (number > 12)) {
            throw new InvalidMonthException();
        }
        return monthList.get(number - 1); /*Так январь первый месяц,а в листе хранятся с 0 элемента */

    }

}
