package com.hospital.dto;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HospitalPasswordDTO {
	
	@Size(min = 8, message = "Old password must be at least 8 characters long")
    private String oldHospitalPwd; // Password for hospital login
	
	@Size(min = 8, message = "New password must be at least 8 characters long")
    private String newHospitalPwd; // Password for hospital login

	public String getOldHospitalPwd() {
		return oldHospitalPwd;
	}

	public void setOldHospitalPwd(String oldHospitalPwd) {
		this.oldHospitalPwd = oldHospitalPwd;
	}

	public String getNewHospitalPwd() {
		return newHospitalPwd;
	}

	public void setNewHospitalPwd(String newHospitalPwd) {
		this.newHospitalPwd = newHospitalPwd;
	}
	
	
}
