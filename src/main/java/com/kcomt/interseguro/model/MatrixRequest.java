package com.kcomt.interseguro.model;

import java.util.ArrayList;
import java.util.List;

public class MatrixRequest {
	
	private List<List<Integer>> matrix = new ArrayList<List<Integer>>();
	
	public MatrixRequest() {
	}

	public List<List<Integer>> getMatrix() {
		return matrix;
	}

	public void setMatrix(List<List<Integer>> matrix) {
		this.matrix = matrix;
	}
}
