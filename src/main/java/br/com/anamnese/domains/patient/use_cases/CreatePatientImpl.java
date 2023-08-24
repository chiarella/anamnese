package br.com.anamnese.domains.patient.use_cases;

import org.springframework.stereotype.Service;

import br.com.anamnese.domains.patient.inputs.CreatePatientInput;
import br.com.anamnese.domains.patient.models.PatientModel;
import br.com.anamnese.domains.patient.ports.PatientPort;

@Service
public class CreatePatientImpl implements CreatePatient{
	
	private PatientPort patientPort;

	public CreatePatientImpl(PatientPort patientPort) {
		this.patientPort = patientPort;
	}


	@Override
	public PatientModel execute(CreatePatientInput input) {
		return patientPort.createPatient(input);
	}

}
