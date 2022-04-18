package com.example.pdplearn.repository;

import com.example.pdplearn.entity.entityTraining.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {

}
