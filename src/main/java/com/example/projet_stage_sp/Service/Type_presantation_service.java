package com.example.projet_stage_sp.Service;

import com.example.projet_stage_sp.Repository.Type_presentation_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Type_presantation_service {
    @Autowired
    private Type_presentation_repo typePresentationRepo;
}
