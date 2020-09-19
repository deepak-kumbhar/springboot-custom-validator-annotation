package com.validation.demo.model;

import javax.validation.constraints.NotBlank;

import com.validation.demo.validator.ValidEmail;
import com.validation.demo.validator.ValidMobile;
import com.validation.demo.validator.ValidName;
import com.validation.demo.validator.ValidPassword;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
	
	@NotBlank
	@ValidEmail
	private String email;

	@NotBlank
	@ValidPassword
	private String password;
	
	@NotBlank
	@ValidName
	private String name;
	
	
	@NotBlank
	@ValidMobile
	private String contactNo;
}
