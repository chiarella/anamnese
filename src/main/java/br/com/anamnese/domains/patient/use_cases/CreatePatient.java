package br.com.anamnese.domains.patient.use_cases;

import br.com.anamnese.domains.patient.inputs.CreatePatientInput;
import br.com.anamnese.domains.patient.models.PatientModel;


public interface CreatePatient {

	PatientModel execute(CreatePatientInput input);

}
