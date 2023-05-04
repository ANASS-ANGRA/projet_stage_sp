package com.example.projet_stage_sp.Service;

import com.example.projet_stage_sp.Repository.Suivi_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Suivi_service {
    @Autowired
    private Suivi_repo suiviRepo;

}
