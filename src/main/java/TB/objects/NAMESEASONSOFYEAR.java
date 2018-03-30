package TB.objects;

public enum NAMESEASONSOFYEAR {
    /**
     * Сезоны года
     */
    WINTER, SPRING, SUMMER, FALL;

    /**
     * Возращает имя сезона по имени месяца
     *
     * @param monthName
     * @return
     */
    public static NAMESEASONSOFYEAR getSeasonByMonthName(String monthName) {
        NAMESEASONSOFYEAR nameSeason = NAMESEASONSOFYEAR.WINTER;
        switch (monthName.toLowerCase()) {
            case "декабря":
            case "января":
            case "февраля": {
                nameSeason = NAMESEASONSOFYEAR.WINTER;
                break;
            }
            case "марта":
            case "апреля":
            case "мая": {
                nameSeason = NAMESEASONSOFYEAR.SPRING;
                break;
            }
            case "июня":
            case "июля":
            case "августа": {
                nameSeason = NAMESEASONSOFYEAR.SUMMER;
                break;
            }
            case "сентября":
            case "октября":
            case "ноября": {
                nameSeason = NAMESEASONSOFYEAR.FALL;
                break;
            }
        }
        return nameSeason;
    }

    /**
     * Возвращает символ сезона по его имени.
     * @param nameseasonsofyear
     * @return
     */
    public static String getSeasonSymbol(NAMESEASONSOFYEAR nameseasonsofyear) {
        String resultSeasonSymbol = "";
        switch (nameseasonsofyear) {
            case WINTER:
                resultSeasonSymbol = "\uD83C\uDFBF";
                break;
            case FALL:
                resultSeasonSymbol = "\uD83C\uDF41";
                break;
            case SPRING:
                resultSeasonSymbol = "\uD83C\uDF31";
                break;
            case SUMMER:
                resultSeasonSymbol = "\uD83C\uDFD6";
                break;
        }
        return resultSeasonSymbol;
    }


    @Override
    public String toString() {
        return "NAMESEASONSOFYEAR{}";
    }
}
