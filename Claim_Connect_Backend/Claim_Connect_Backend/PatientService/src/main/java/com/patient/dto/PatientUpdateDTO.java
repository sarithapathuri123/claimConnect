package com.patient.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientUpdateDTO {
	
	@NotBlank(message = "Patient name is required")
	private String patientName;
	
	@NotBlank(message = "Patient password is required")
    private String patientPassword; // Password for patient login
	
	@NotNull(message = "Insurance company ID is required")
	private long insuranceCompId;

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientPassword() {
		return patientPassword;
	}

	public void setPatientPassword(String patientPassword) {
		this.patientPassword = patientPassword;
	}

	public long getInsuranceCompId() {
		return insuranceCompId;
	}

	public void setInsuranceCompId(long insuranceCompId) {
		this.insuranceCompId = insuranceCompId;
	}

	public PatientUpdateDTO(@NotBlank(message = "Patient name is required") String patientName,
			@NotBlank(message = "Patient password is required") String patientPassword,
			@NotNull(message = "Insurance company ID is required") long insuranceCompId) {
		super();
		this.patientName = patientName;
		this.patientPassword = patientPassword;
		this.insuranceCompId = insuranceCompId;
	}

	public PatientUpdateDTO() {
		super();
	}
	
	
}
