package br.com.anamnese.domains.calender.models;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class CalenderModel {
	
	private String code;
	private LocalDateTime dateStart;
	private LocalDateTime dateEnd;
	private PatientCalenderModel patient;

}
