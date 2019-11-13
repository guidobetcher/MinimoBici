package edu.upc.eetac.dsa;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;

import java.util.LinkedList;

public class Station {
    //Attributes
    String idStation;
    String description;
    int max;
    double lat;
    double lon;

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    LinkedList<Bike> bikes;

    //Empty constructor for json deserializer
    public Station(){

    }

    //Constructor
    public Station(String idStation, String description, int max, double lat, double lon) {
        this.idStation = idStation;
        this.description = description;
        this.max = max;
        this.lat = lat;
        this.lon = lon;
        this.bikes = new LinkedList<>();
    }


    //Getters and setters
    public String getIdStation() {
        return idStation;
    }

    public void setIdStation(String idStation) {
        this.idStation = idStation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public LinkedList<Bike> getBikes() {
        return bikes;
    }

    public void setBikes(LinkedList<Bike> bikes) {
        this.bikes = bikes;
    }

    //Add a bike
    public void addBike(Bike bike){
        this.bikes.add(bike);
    }
    //Get the number of bikes of the station
    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public int getNumBikes() {
        return this.bikes.size();
    }
}
