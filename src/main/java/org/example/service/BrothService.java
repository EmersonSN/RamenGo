package org.example.service;

import org.example.model.Broth;
import org.example.repository.BrothRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrothService {

    @Autowired
    private BrothRepository brothRepository;

    public List<Broth> getAllBroths() {
        return brothRepository.findAll();
    }
}