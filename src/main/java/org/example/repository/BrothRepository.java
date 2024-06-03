package org.example.repository;

import org.example.model.Broth;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BrothRepository extends JpaRepository<Broth, Long> {
}