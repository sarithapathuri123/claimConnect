package com.insurancecompany.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InsuranceCompanyDTO {
	private Long insuranceCompId;
	private String insuranceCompName;
	private String insuranceCompEmail;
	public Long getInsuranceCompId() {
		return insuranceCompId;
	}
	public void setInsuranceCompId(Long insuranceCompId) {
		this.insuranceCompId = insuranceCompId;
	}
	public String getInsuranceCompName() {
		return insuranceCompName;
	}
	public void setInsuranceCompName(String insuranceCompName) {
		this.insuranceCompName = insuranceCompName;
	}
	public String getInsuranceCompEmail() {
		return insuranceCompEmail;
	}
	public void setInsuranceCompEmail(String insuranceCompEmail) {
		this.insuranceCompEmail = insuranceCompEmail;
	}
	public InsuranceCompanyDTO(Long insuranceCompId, String insuranceCompName, String insuranceCompEmail) {
		super();
		this.insuranceCompId = insuranceCompId;
		this.insuranceCompName = insuranceCompName;
		this.insuranceCompEmail = insuranceCompEmail;
	}
	public InsuranceCompanyDTO() {
		super();
	}
	
}
