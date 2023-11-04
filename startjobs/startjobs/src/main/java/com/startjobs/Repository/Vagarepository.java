package com.startjobs.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.startjobs.Model.Vaga;

@Repository
public interface Vagarepository extends JpaRepository<Vaga,Long>{
    
}
