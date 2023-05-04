package com.example.projet_stage_sp.Repository;

import com.example.projet_stage_sp.Model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Client_repo extends JpaRepository<Client , Long> {
}
