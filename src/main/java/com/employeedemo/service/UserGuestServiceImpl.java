package com.employeedemo.service;

/* AUTHOR: LILI MP
 * NC TRAINEE PROGRAM
 * PROJECT: CAR RENTAL SYSTEM TBW
 */

import com.employeedemo.model.UserGuest;
import com.employeedemo.repository.UserGuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserGuestServiceImpl implements UserGuestService {

    @Autowired
    private UserGuestRepository userGuestRepository;

    @Override
    public List<UserGuest> findAllUserGuest() {
        return userGuestRepository.findAll();
    }

    @Override
    public void saveUserGuest(UserGuest userGuest) {
        userGuestRepository.save(userGuest);
    }

    @Override
    public UserGuest findUserGuestById(int idUserGuest) {
        return userGuestRepository.findById(idUserGuest).orElse(null);
    }
}
