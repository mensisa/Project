/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WeatherWear;

import java.util.List;
import net.aksingh.owmjapis.core.OWM;
import net.aksingh.owmjapis.api.APIException;
import net.aksingh.owmjapis.model.CurrentWeather;

public class WeatherWear {

    public static void main(String[] args)
            throws APIException {

        // declaring object of "OWM" class
        OWM owm = new OWM("156b77ca1f98f37be98062d7f5379f6b");

        // getting current weather data for the "London" city
        CurrentWeather cwd = owm.currentWeatherByCityId(4928096);

        //printing city name from the retrieved data
        System.out.println("City: " + cwd.getCityName());

        // printing the max./min. temperature
        System.out.println("Temperature: " + cwd.getMainData().getTempMax()
                            + "/" + cwd.getMainData().getTempMin() + "\'K" + cwd.getWeatherList().get(0).getConditionId());
    }
}