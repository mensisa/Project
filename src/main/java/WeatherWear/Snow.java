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
public class Snow extends Precipitation{
    private String typeSnow;
    
    public Snow(){};

    public Snow(Precipitation p, Weather w) {
        super(p, w);
    }

    public String getTypeSnow() {
        return typeSnow = super.description;
    }

    public void setTypeSnow(String typeSnow) {
        this.typeSnow = typeSnow;
    }
}
