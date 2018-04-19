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
public class Precipitation extends Weather{
    private double precAmt;
    
    public Precipitation(){};

    public Precipitation(Precipitation p, Weather w) {
        super(w);
        this.precAmt = p.precAmt;
    }

    public Precipitation(Weather w) {
        super(w);
    }

    public Precipitation(double precAmt, Weather w) {
        super(w);
        this.precAmt = precAmt;
    }
    
    public Precipitation(double p){
        precAmt = p;
    }
    
    public void setPrecAmt(double p){
        precAmt = p;
    }
    
    public double getPrecAmt(){
        return precAmt;
    }
}

