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
public class Clothing{
    protected boolean Waterproof;
    protected boolean Heated;
    protected boolean Thermal;
    protected String partofBody;
    protected String Season;

    public Clothing() {
    }    
    
    public boolean isWaterproof() {
        return Waterproof;
    }

    public void setWaterproof(boolean Waterproof) {
        this.Waterproof = Waterproof;
    }

    public boolean isHeated() {
        return Heated;
    }

    public void setHeated(boolean Heated) {
        this.Heated = Heated;
    }

    public boolean isThermal() {
        return Thermal;
    }

    public void setThermal(boolean Thermal) {
        this.Thermal = Thermal;
    }

    public String getPartofBody() {
        return partofBody;
    }

    public void setPartofBody(String partofBody) {
        this.partofBody = partofBody;
    }

    public String getSeason() {
        return Season;
    }

    public void setSeason(String Season) {
        this.Season = Season;
    }

}

