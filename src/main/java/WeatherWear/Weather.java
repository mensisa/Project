/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WeatherWear;

/**
 *
 * @author sdzar
 */
public class Weather {
    protected int id;
    protected String main;
    protected String description;
    protected String icon;
    protected double temp;
    protected double pressure; //in hPa
    protected double humidity;
    protected double temp_min;
    protected double temp_max;
    protected Wind wind;

    public Weather() {
    }

    public Weather(int id, String main, String description, String icon, double temp, double pressure, double humidity, double temp_min, double temp_max, Wind wind) {
        this.id = id;
        this.main = main;
        this.description = description;
        this.icon = icon;
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        this.temp_min = temp_min;
        this.temp_max = temp_max;
        this.wind = wind;
    }

    public Weather(Weather w) {
        this.id = w.id;
        this.main = w.main;
        this.description = w.description;
        this.icon = w.icon;
        this.temp = w.temp;
        this.pressure = w.pressure;
        this.humidity = w.humidity;
        this.temp_min = w.temp_min;
        this.temp_max = w.temp_max;
        this.wind = w.wind;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(double temp_min) {
        this.temp_min = temp_min;
    }

    public double getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(double temp_max) {
        this.temp_max = temp_max;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

 
}
