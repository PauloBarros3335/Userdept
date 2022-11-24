package com.henry.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henry.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
