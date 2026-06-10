package com.patient.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientDTO {
	
	private Long patientId;
	private String patientName;
	private String patientEmail;
	private long insuranceCompId;
	public Long getPatientId() {
		return patientId;
	}
	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientEmail() {
		return patientEmail;
	}
	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}
	public long getInsuranceCompId() {
		return insuranceCompId;
	}
	public void setInsuranceCompId(long insuranceCompId) {
		this.insuranceCompId = insuranceCompId;
	}
	public PatientDTO(Long patientId, String patientName, String patientEmail, long insuranceCompId) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientEmail = patientEmail;
		this.insuranceCompId = insuranceCompId;
	}
	public PatientDTO() {
		super();
	}
	
}
