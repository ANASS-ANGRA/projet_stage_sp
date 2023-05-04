package com.example.projet_stage_sp.Repository;

import com.example.projet_stage_sp.Model.Suivi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Suivi_repo extends JpaRepository<Suivi ,Long> {
}
