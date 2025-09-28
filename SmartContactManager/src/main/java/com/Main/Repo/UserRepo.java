package com.Main.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Main.Entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
