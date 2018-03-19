package weather;

public class Forecast {
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    //    Attribute: day=16
    private int day;
    //    Attribute: month=03
    private int month;
    //    Attribute: year=2018
    private int year;
    //    Attribute: hour=15
    private int hour;

    public int getCloudiness() {
        return cloudiness;
    }

    public void setCloudiness(int cloudiness) {
        this.cloudiness = cloudiness;
    }

    private int cloudiness;
    private int maxPressure;

    public int getMaxPressure() {
        return maxPressure;
    }

    public void setMaxPressure(int maxPressure) {
        this.maxPressure = maxPressure;
    }

    public int getMinPressure() {
        return minPressure;
    }

    public void setMinPressure(int minPressure) {
        this.minPressure = minPressure;
    }

    private int minPressure;
    private int minTemperature;

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    private int maxTemperature;
    private int maxWind;

    public int getMaxWind() {
        return maxWind;
    }

    public void setMaxWind(int maxWind) {
        this.maxWind = maxWind;
    }

    public int getMinWind() {
        return minWind;
    }

    public void setMinWind(int minWind) {
        this.minWind = minWind;
    }

    private int minWind;
    private int minRelwet;

    public int getMinRelwet() {
        return minRelwet;
    }

    public void setMinRelwet(int minRelwet) {
        this.minRelwet = minRelwet;
    }

    public int getMaxRelwet() {
        return maxRelwet;
    }

    public void setMaxRelwet(int maxRelwet) {
        this.maxRelwet = maxRelwet;
    }

    private int maxRelwet;

    @Override
    public String toString() {
        return "Forecast{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                ", hour=" + hour +
                ", cloudiness=" + cloudiness +
                ", maxPressure=" + maxPressure +
                ", minPressure=" + minPressure +
                ", minTemperature=" + minTemperature +
                ", maxTemperature=" + maxTemperature +
                ", maxWind=" + maxWind +
                ", minWind=" + minWind +
                ", minRelwet=" + minRelwet +
                ", maxRelwet=" + maxRelwet +
                '}';
    }

    //    Attribute: tod=2
//    Attribute: predict=0
//    Attribute: weekday=6
//    Start Element: PHENOMENA
//    Attribute: cloudiness=3
//    Attribute: precipitation=10
//    Attribute: rpower=0
//    Attribute: spower=0
//    End Element:PHENOMENA
//    Start Element: PRESSURE
//    Attribute: max=768
//    Attribute: min=767
//    End Element:PRESSURE
//    Start Element: TEMPERATURE
//    Attribute: max=-1
//    Attribute: min=-2
//    End Element:TEMPERATURE
//    Start Element: WIND
//    Attribute: min=8
//    Attribute: max=9
//    Attribute: direction=6
//    End Element:WIND
//    Start Element: RELWET
//    Attribute: max=86
//    Attribute: min=82
//    End Element:RELWET
//    Start Element: HEAT
//    Attribute: min=-11
//    Attribute: max=-11
//    End Element:HEAT
}
