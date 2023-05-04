package com.example.projet_stage_sp.Service;

import com.example.projet_stage_sp.Repository.Seance_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Seance_service {
    @Autowired
    private Seance_repo seanceRepo;

}
