package com.employeedemo.service;

/* AUTHOR: LILI MP
 * NC TRAINEE PROGRAM
 * PROJECT: CAR RENTAL SYSTEM TBW
 */

import com.employeedemo.model.UserGuest;

import java.util.List;
import java.util.Optional;

public interface UserGuestService {

    List<UserGuest> findAllUserGuest();
    void saveUserGuest(UserGuest userGuest);
    UserGuest findUserGuestById(int idUserGuest);
}
