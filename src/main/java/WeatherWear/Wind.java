/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WeatherWear;

/**
 *
 * @author Hao Zhang
 */
public class Wind { 

    protected double windSpeed;
    protected double windDirection;

    public Wind() {
    }

    public Wind(double windSpeed, double windDirection) {
        this.windSpeed = windSpeed;
        this.windDirection = windDirection;
    }

    public void setWindSpeed(double ws) {
        windSpeed = ws;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public double getWindSpeedMph() {
        return windSpeed * 2.23693629;
    }

    public void setWindDirection(double wd) {
        windDirection = wd;
    }

    public String getWindDirection() {
        String dir;
        if (windDirection > 22.5 && windDirection < 67.5) {
            dir = "NE";
        } else if (windDirection >= 67.5 && windDirection <= 112.5) {
            dir = "E";
        } else if (windDirection > 112.5 && windDirection < 157.5) {
            dir = "SE";
        } else if (windDirection >= 157.5 && windDirection <= 202.5) {
            dir = "S";
        } else if (windDirection > 202.5 && windDirection < 247.5) {
            dir = "SW";
        } else if (windDirection >= 247.5 && windDirection <= 292.5) {
            dir = "W";
        } else if (windDirection > 292.5 && windDirection < 337.5) {
            dir = "NW";
        } else if (windDirection >= 337.5 && windDirection <= 22.5) {
            dir = "N";
        } else {
            dir = "error";
        }
        return dir;
    }
}
