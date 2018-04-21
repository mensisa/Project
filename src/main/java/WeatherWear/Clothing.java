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
class Clothing {

    String top;
    String bottom;
    String accessory;

    public Clothing() {
    }

    public void setClothing(double temp) {
        if (260 < temp && temp < 273.15) {
            top = "Coat and sweater";
            bottom = "Heavy pants";
        } else if (temp < 283.15) {
            top = "Coat";
            bottom = "Pants";
        } else if (temp < 293.15) {
            top = "Sweater or shirt";
            bottom = "Pants or Jeans";
        } else if (temp < 303.15) {
            top = "Long/Short-sleeved shirt";
            bottom = "Jeans or Shorts";
        } else if (temp < 313.15) {
            top = "Short-sleeved shirt";
            bottom = "Shorts";
        } else if (temp > 325) {
            top = "Too hot!";
            bottom = "Stay inside!";
        } else {
            top = "Too cold!";
            bottom = "Stay inside!";
        }
    }

    public void setAccessory(boolean rain) {
        if (rain) {
            accessory = "Umbrella";
        } else {
            accessory = "";
        }
    }

    public String getClothing() {
        return "<html>" + top + "<br>"
                + bottom + "<br>"
                + accessory + "</html>";
    }
}
