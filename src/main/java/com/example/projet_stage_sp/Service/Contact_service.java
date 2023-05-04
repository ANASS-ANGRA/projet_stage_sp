package com.example.projet_stage_sp.Service;

import com.example.projet_stage_sp.Repository.Contact_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Contact_service {
    @Autowired
    private Contact_repo contactRepo;
}
