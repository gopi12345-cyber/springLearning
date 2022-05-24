package com.bootbackend.springbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootbackend.springbackend.model.User;
@Repository
public interface UserRepo extends JpaRepository<User,Integer> {

}
