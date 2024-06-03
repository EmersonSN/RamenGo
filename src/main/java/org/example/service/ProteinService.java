package org.example.service;

import org.example.model.Protein;
import org.example.repository.ProteinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProteinService {

    @Autowired
    private ProteinRepository proteinRepository;

    public List<Protein> getAllProteins() {
        return proteinRepository.findAll();
    }
}
