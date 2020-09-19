package com.validation.demo.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.validation.demo.model.ResponseMaker;
import com.validation.demo.model.SuccessResponse;
import com.validation.demo.model.UserModel;


@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private ResponseMaker responseMaker;


	@PostMapping("/validate")
	public ResponseEntity<SuccessResponse<String>> validateObject(@RequestBody @Valid UserModel userModel) {
		return responseMaker.successResponse("User validated successfully", HttpStatus.OK);
	}

}
