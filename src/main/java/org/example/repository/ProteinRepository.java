package org.example.repository;

import org.example.model.Protein;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProteinRepository extends JpaRepository<Protein, Long> {
}