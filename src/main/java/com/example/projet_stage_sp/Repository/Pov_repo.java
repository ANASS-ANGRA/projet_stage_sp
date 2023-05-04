package com.example.projet_stage_sp.Repository;

import com.example.projet_stage_sp.Model.Pov;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Pov_repo extends JpaRepository<Pov ,Long> {
}
