package com.example.projet_stage_sp.Service;

import com.example.projet_stage_sp.Model.Type;
import com.example.projet_stage_sp.Repository.Type_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Type_service {
    @Autowired
    private Type_repo typeRepo;

    public List<Type> get_type(){
        return  typeRepo.findAll();
    }
}
