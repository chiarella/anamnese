package br.com.anamnese.infrastructure.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.anamnese.infrastructure.database.entidade.PatientEntity;

public interface PatientRepository extends JpaRepository<PatientEntity, String>{

}
