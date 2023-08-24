package br.com.anamnese.api.v1.response;

import br.com.anamnese.domains.patient.models.PatientModel;
import lombok.Data;

@Data
public class CreatePatientResponse {

	private String code;
	private String name;
	private String cpf;

	public CreatePatientResponse(PatientModel patientModel) {
		this.code = patientModel.getCode();
		this.name = patientModel.getName();
		this.cpf = patientModel.getCpf();
	}

}
