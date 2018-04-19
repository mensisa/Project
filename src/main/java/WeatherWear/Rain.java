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
public class Rain extends Precipitation{
    private String typeRain;
    
    public Rain(){};

    public Rain(Precipitation p, Weather w) {
        super(p, w);
    }

    public String getTypeRain() {
        return typeRain = super.description;
    }

    public void setTypeRain(String typeRain) {
        this.typeRain = typeRain;
    }
}

