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
public class City {
    protected String city;
    protected int ID;
    protected String zipCode;

    public City() {
    }
    
    public City(String city, int ID) {
        this.city = city;
        this.ID = ID;
    }

    public City(String city, int ID, String zipCode) {
        this.city = city;
        this.ID = ID;
        this.zipCode = zipCode;
    }
    
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    
}
