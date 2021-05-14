package com.employeedemo.repository;

/* AUTHOR: LILI MP
 * NC TRAINEE PROGRAM
 * PROJECT: CAR RENTAL SYSTEM TBW
 */

import com.employeedemo.model.UserGuest;
import com.employeedemo.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserGuestRepository extends JpaRepository<UserGuest, Integer> {
}
