package br.com.anamnese.api.v1.resources;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.anamnese.api.v1.request.CreatePatientRequest;
import br.com.anamnese.api.v1.response.CreatePatientResponse;
import br.com.anamnese.domains.patient.use_cases.CreatePatient;

@RestController
@RequestMapping("/v1/patients")
public class PatientResources {

	private final CreatePatient createPatient;

	public PatientResources(CreatePatient createPatient) {
		this.createPatient = createPatient;
	}


	@PostMapping
	public CreatePatientResponse create(@RequestBody CreatePatientRequest request) {
		return new CreatePatientResponse(createPatient.execute(request.toInput()));
	}

}
