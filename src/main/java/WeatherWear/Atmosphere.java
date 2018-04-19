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
public class Atmosphere extends Weather{
    private String meaning;

    public Atmosphere() {
    }

    public Atmosphere(Weather w) {
        super(w);
    }

    public String getMeaning() {
        return meaning = super.description;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }
    
}
