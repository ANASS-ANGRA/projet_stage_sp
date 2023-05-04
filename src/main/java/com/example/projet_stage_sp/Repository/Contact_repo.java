package com.example.projet_stage_sp.Repository;

import com.example.projet_stage_sp.Model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Contact_repo extends JpaRepository<Contact ,Long> {
}
