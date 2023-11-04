package com.startjobs.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.startjobs.Model.Candidato;

@Repository
public interface Candidatorepository extends JpaRepository<Candidato, Long> {

}
