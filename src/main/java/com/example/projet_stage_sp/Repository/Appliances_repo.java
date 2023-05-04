package com.example.projet_stage_sp.Repository;

import com.example.projet_stage_sp.Model.Appliances;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Appliances_repo extends JpaRepository<Appliances, Long> {
    Appliances findByLibelleAppliance(String libelle_appliance);
}
