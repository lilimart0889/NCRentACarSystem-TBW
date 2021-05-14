package com.employeedemo.model;

/* AUTHOR: LILI MP
 * NC TRAINEE PROGRAM
 * PROJECT: CAR RENTAL SYSTEM TBW
 */

import javax.persistence.*;

@Entity
@Table(name ="vehicles")

public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numberPlate;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_GAMA_VEHICLES")
    private GammaVehicle gammaVehicle;

    @Column(name ="BRAND")
    private String brand;

    @Column(name ="MODEL")
    private String model;

    @Column(name ="TRANSMISSION")
    private String transmission;

    @Column(name ="SEATS_CAPACITY")
    private String seatsCapacity;

    @Column(name ="PRICE")
    private float price;



    public int getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(int numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getSeatsCapacity() {
        return seatsCapacity;
    }

    public void setSeatsCapacity(String seatsCapacity) {
        this.seatsCapacity = seatsCapacity;
    }

    public GammaVehicle getGammaVehicle() {
        return gammaVehicle;
    }

    public void setGammaVehicle(GammaVehicle gammaVehicle) {
        this.gammaVehicle = gammaVehicle;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
