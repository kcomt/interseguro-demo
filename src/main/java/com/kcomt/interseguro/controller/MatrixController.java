package com.kcomt.interseguro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kcomt.interseguro.model.MatrixRequest;
import com.kcomt.interseguro.model.MatrixResponse;
import com.kcomt.interseguro.serviceimpl.IMatrixService;

@RestController
public class MatrixController {

	@Autowired
	private IMatrixService matrixService;

	@PostMapping(value = "/rotate90", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public MatrixResponse rotate90(@RequestBody MatrixRequest matrixRequest) {
		return matrixService.rotateNinetyDegrees(matrixRequest);
	}

	@PostMapping(value = "/transpose", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public MatrixResponse transpose(@RequestBody MatrixRequest matrixRequest) {
		return null;
	}

	@PostMapping(value = "/rotate180", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public MatrixResponse rotate180(@RequestBody MatrixRequest matrixRequest) {
		return null;
	}

	@PostMapping(value = "/rotate270", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public MatrixResponse rotate270(@RequestBody MatrixRequest matrixRequest) {
		return null;
	}
}
