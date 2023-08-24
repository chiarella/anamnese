package br.com.anamnese.infrastructure.adapter;

import org.springframework.stereotype.Component;

import br.com.anamnese.domains.patient.inputs.CreatePatientInput;
import br.com.anamnese.domains.patient.models.PatientModel;
import br.com.anamnese.domains.patient.ports.PatientPort;
import br.com.anamnese.infrastructure.database.entidade.PatientEntity;
import br.com.anamnese.infrastructure.database.repository.PatientRepository;

@Component
public class PatientPortAdapter implements PatientPort{
	
	private PatientRepository patientRepository;
	
	public PatientPortAdapter(PatientRepository patientRepository) {
		this.patientRepository = patientRepository;
	}

	@Override
	public PatientModel createPatient(CreatePatientInput input) {
		return patientRepository.save(new PatientEntity(input)).toModel();
	}


}
