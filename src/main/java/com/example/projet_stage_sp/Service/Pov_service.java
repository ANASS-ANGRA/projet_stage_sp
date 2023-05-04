package com.example.projet_stage_sp.Service;

import com.example.projet_stage_sp.Repository.Pov_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Pov_service {
    @Autowired
    private Pov_repo povRepo ;
}
