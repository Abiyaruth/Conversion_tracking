package com.cooksys.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cooksys.entity.Users;

public interface UserRepository extends JpaRepository<Users,Long>{

	List<Users> findByNum(Long num);

	Users findByUsername(String name);

	Users findUserByRole(String role);

}
