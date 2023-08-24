package br.com.anamnese.domains.patient.ports;

import br.com.anamnese.domains.patient.inputs.CreatePatientInput;
import br.com.anamnese.domains.patient.models.PatientModel;

public interface PatientPort {

	PatientModel createPatient(CreatePatientInput input);

}
