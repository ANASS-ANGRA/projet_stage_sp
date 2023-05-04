package com.example.projet_stage_sp.Controller;

import com.example.projet_stage_sp.Model.Appliances;
import com.example.projet_stage_sp.Model.Type;
import com.example.projet_stage_sp.Service.Appliance_service;
import com.example.projet_stage_sp.Service.Type_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class Appliance_Controller {
    @Autowired
    private Appliance_service applianceService ;
    @Autowired
    private Type_service typeService;

    @GetMapping("/type_appliance")
    public List<Type> get_type(){
        return  typeService.get_type();
    }


    @PostMapping("/ajouter_appliance")
    public Appliances ajouter_appliance( @RequestBody Appliances request){
        return  applianceService.Save_appliance(request);
    }

    @GetMapping("appliances")
    public  List<Appliances> get_appliances(){
        return  applianceService.get_appliances();
    }


}
