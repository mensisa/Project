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
public class Clouds extends Weather{
    private double cloudiness;
    private String typeCloud;

    public Clouds() {
    }

    public Clouds(double cloudiness, Weather w) {
        super(w);
        this.cloudiness = cloudiness;
    }

    public double getCloudiness() {
        return cloudiness;
    }

    public void setCloudiness(double cloudiness) {
        this.cloudiness = cloudiness;
    }

    public String getTypeCloud() {
        return typeCloud = super.description;
    }

    public void setTypeCloud(String typeCloud) {
        this.typeCloud = typeCloud;
    }
    
}
