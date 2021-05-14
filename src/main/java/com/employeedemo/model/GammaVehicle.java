package com.employeedemo.model;

/* AUTHOR: LILI MP
 * NC TRAINEE PROGRAM
 * PROJECT: CAR RENTAL SYSTEM TBW
 */

import javax.persistence.*;

@Entity
@Table(name = "gamma_vehicles")

public class GammaVehicle {

    @Id
    @Column(name = "ID_GAMA_VEHICLES")
    private String idGammaVehicle;

    @Column(name = "DESCRIPTION")
    private String description;

    public String getIdGammaVehicle() {
        return idGammaVehicle;
    }

    public void setIdGammaVehicle(String idGammaVehicle) {
        this.idGammaVehicle = idGammaVehicle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}