package com.example.projet_stage_sp.Repository;

import com.example.projet_stage_sp.Model.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Type_repo extends JpaRepository<Type, Long> {
}
