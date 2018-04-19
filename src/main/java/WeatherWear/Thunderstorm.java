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
public class Thunderstorm extends Precipitation{
    private String typeThunderstorm;
    
    public Thunderstorm(){};

    public Thunderstorm(Precipitation p, Weather w) {
        super(p, w);
    }

    public String getTypeThunderstorm() {
        return typeThunderstorm = super.description;
    }

    public void setTypeThunderstorm(String typeThunderstorm) {
        this.typeThunderstorm = typeThunderstorm;
    }
}
