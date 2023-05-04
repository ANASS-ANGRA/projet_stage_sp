package com.example.projet_stage_sp.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "Suivi")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Suivi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "offre_commerciel")
    private String offreCommerciale;

    @Column(name = "mantant")
    private Float montant;

    @ManyToOne
    @JoinColumn(name = "type_prsentation_id")
    private  Type_prsentations typePrsentations;

    @Column(name = "compte_rendu")
    private String compteRendu;

    @ManyToOne
    @JoinColumn(name = "pov_id")
    private Pov pov;

}
