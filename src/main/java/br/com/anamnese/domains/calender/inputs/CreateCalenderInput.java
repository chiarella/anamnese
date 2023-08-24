package br.com.anamnese.domains.calender.inputs;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class CreateCalenderInput {
	
	private LocalDateTime dateStart;
	private LocalDateTime dateEnd;
	private String patientCode;
	
	

}
