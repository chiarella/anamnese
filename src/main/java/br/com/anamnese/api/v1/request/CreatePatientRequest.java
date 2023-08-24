package br.com.anamnese.api.v1.request;

import br.com.anamnese.domains.patient.inputs.CreatePatientInput;
import lombok.Data;

@Data
public class CreatePatientRequest {
	
	private String name;
	private String cpf;
	
	
    public CreatePatientInput toInput() {
        CreatePatientInput input = new CreatePatientInput();
        input.setName(name);
        input.setCpf(cpf);
        return input;
    }	

}
