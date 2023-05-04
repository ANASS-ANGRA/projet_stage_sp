package com.example.projet_stage_sp.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Table(name = "Seance")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Seance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;

    private Date date ;

    private String Resumer ;

    private String participant ;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pov_id", referencedColumnName = "id")
    private Pov pov;
}
