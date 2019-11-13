package edu.upc.eetac.dsa;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;

public class Bike {
    //Attributes
    @JsonIgnore
    @ApiModelProperty(hidden = true)
    private int id;

    String idBike;
    String description;
    double kms;
    String idStation;

    //Empty constructor for json deserializer
    public Bike(){

    }

    //Constructor
    public Bike(String idBike, String description, double kms, String idStation) {
        this.idBike = idBike;
        this.description = description;
        this.kms = kms;
        this.idStation = idStation;
    }

    //Getters and setters

    public String getIdBike() {
        return idBike;
    }

    public void setIdBike(String idBike) {
        this.idBike = idBike;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getKms() {
        return kms;
    }

    public void setKms(double kms) {
        this.kms = kms;
    }

    public String getIdStation() {
        return idStation;
    }

    public void setIdStation(String idStation) {
        this.idStation = idStation;
    }

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    public String getBikeId() {
        return this.idBike;
    }
}
