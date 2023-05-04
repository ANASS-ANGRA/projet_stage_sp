package com.example.projet_stage_sp.Repository;

import com.example.projet_stage_sp.Model.Seance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Seance_repo extends JpaRepository<Seance ,Long> {
}
