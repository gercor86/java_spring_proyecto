package com.medic.org_medic.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medic.org_medic.modelos.Medico;

@Repository
public interface MedicoRepositorio extends JpaRepository<Medico, Long> {

}
