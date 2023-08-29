package com.example.greetingapp.repository;

import com.example.greetingapp.model.GreetingApp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingAppRepository extends JpaRepository<GreetingApp, Integer> {
}
