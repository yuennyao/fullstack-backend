package com.loeyyuen.fullstackbackend.repository;

import com.loeyyuen.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    //"User" is the name of the Model class. "Long" is the data type of the PK
}
