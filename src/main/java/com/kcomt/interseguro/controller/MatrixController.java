package com.kcomt.interseguro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kcomt.interseguro.model.Matrix;
import com.kcomt.interseguro.serviceimpl.IMatrixService;

@RestController
public class MatrixController {
	
	@Autowired
	private IMatrixService matrixService;
	
	@GetMapping("/rotate90")
	public String rotate() {
		return "Hello world";
	}
}
