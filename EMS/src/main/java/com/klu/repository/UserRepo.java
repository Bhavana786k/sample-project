package com.klu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klu.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
