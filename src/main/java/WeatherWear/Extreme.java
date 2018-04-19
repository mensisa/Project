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
public class Extreme extends Weather{
    private String type;

    public Extreme() {
    }

    public Extreme(Weather w) {
        super(w);
    }

    public String getType() {
        return type = super.description;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
