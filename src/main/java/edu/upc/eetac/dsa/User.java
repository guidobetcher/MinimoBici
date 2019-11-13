package edu.upc.eetac.dsa;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import sun.awt.image.ImageWatched;

import java.util.LinkedList;

public class User {
    //Attributes
    String idUser;
    String name;
    String surname;

    @JsonIgnore
    @ApiModelProperty(hidden = true)
    LinkedList<Bike> bikesused;

    //Empty constructor for json deserializer
    public User(){

    }

    //Constructor
    public User(String idUser, String name, String surname) {
        this.idUser = idUser;
        this.name = name;
        this.surname = surname;
        this.bikesused = new LinkedList();
    }

    //Getters and setters
    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void addBike(Bike bike){
        bikesused.add(bike);
    }

    public LinkedList<Bike> getBikesused() {
        return bikesused;
    }

    public void setBikesused(LinkedList<Bike> bikesused) {
        this.bikesused = bikesused;
    }
}
