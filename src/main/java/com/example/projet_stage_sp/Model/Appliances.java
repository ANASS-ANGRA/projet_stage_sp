package com.example.projet_stage_sp.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Table(name = "Appliance")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Appliances {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id ;

    @Column(name = "libelle_appliance")
    private  String libelle_appliance;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type_id", referencedColumnName = "id")
    private Type type;

    private String dbid;

    private boolean disponabilite = false;

    private String reference;

   /* @OneToMany(mappedBy = "appliance_id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Pov> povs = new ArrayList<>();*/

}
