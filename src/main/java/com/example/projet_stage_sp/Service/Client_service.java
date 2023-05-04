package com.example.projet_stage_sp.Service;

import com.example.projet_stage_sp.Repository.Client_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Client_service {
     @Autowired
    private Client_repo clientRepo;
}
