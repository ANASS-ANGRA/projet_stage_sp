package com.example.projet_stage_sp.Service;

import com.example.projet_stage_sp.Model.Appliances;
import com.example.projet_stage_sp.Repository.Appliances_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Appliance_service {
    @Autowired
    private Appliances_repo appliancesRepo ;

    public Appliances Save_appliance(Appliances request) {
        Appliances appliances=appliancesRepo.findByLibelleAppliance(request.getLibelle_appliance());
        if (appliances != null) {
            appliances.setType(request.getType());
            appliances.setDbid(request.getDbid());
            appliances.setReference(request.getReference());
        }else{
        // appliances = new Appliances(request.getLibelle_appliance(),request.getDbid() ,request.getType() ,request.getReference() );
         //   Appliances appliance = new Appliances(request.getLibelle_appliance(), request.getDbid(), request.getType(), request.getReference());
            appliances = new Appliances();
            appliances.setLibelle_appliance();
            appliances.setType(request.getType());
            appliances.setDbid(request.getDbid());
            appliances.setReference(request.getReference())
        }
        return  appliancesRepo.save(appliances);
    }
    public List<Appliances> get_appliances(){
        List<Appliances> appliancesList=appliancesRepo.findAll();
        return  appliancesList;
    }

}
