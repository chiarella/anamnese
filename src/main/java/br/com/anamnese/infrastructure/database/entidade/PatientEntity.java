package br.com.anamnese.infrastructure.database.entidade;

import java.util.UUID;

import br.com.anamnese.domains.calender.models.PatientCalenderModel;
import br.com.anamnese.domains.patient.inputs.CreatePatientInput;
import br.com.anamnese.domains.patient.models.PatientModel;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "tb_patient")
public class PatientEntity {
	
	@Id
	private String code;
	private String name;
	private String cpf;
	
	
	public PatientEntity(CreatePatientInput input) {
		this.code = UUID.randomUUID().toString();
		this.name = input.getName();
		this.cpf = input.getCpf();
	}
	
	public PatientModel toModel() {
		PatientModel patient = new PatientModel();
		patient.setCode(code);
		patient.setName(name);
		patient.setCpf(cpf);
		return patient;
	}
	
	public PatientCalenderModel toCalenderModel() {
		PatientCalenderModel patient = new PatientCalenderModel();
		patient.setCode(code);
		patient.setName(name);
		return patient;
	}
	

}
