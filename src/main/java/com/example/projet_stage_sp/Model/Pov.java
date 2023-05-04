package com.example.projet_stage_sp.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Table(name = "Pov")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pov {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;

    private Date date_debut;

    private Date date_fin ;

    private  String description ;

    private  String compte_manager ;

    private  String ingenier_cybersecurite ;

    private String analyse_cybersecurite ;

    private String libelle_pov ;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id", referencedColumnName = "id")
    private Client client;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "appliance_id", referencedColumnName = "id")
    private Appliances appliances;

   /* @OneToMany(mappedBy = "pov_id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Seance> seances = new ArrayList<>();
    @OneToMany(mappedBy = "pov_id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Suivi> suivis = new ArrayList<>();
*/
}
