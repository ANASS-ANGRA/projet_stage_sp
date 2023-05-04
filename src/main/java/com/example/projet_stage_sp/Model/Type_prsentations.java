package com.example.projet_stage_sp.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "Type_prsentations")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Type_prsentations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;

    private String libelle;

}
