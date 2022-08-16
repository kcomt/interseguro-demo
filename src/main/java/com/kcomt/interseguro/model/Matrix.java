package com.kcomt.interseguro.model;

import java.util.ArrayList;
import java.util.List;

public class Matrix {
	
	private List<List<Integer>> matrix = new ArrayList<List<Integer>>();
	
	public Matrix(List<List<Integer>> matrix) {
		this.matrix = matrix;
	}

	public List<List<Integer>> getMatrix() {
		return matrix;
	}

	public void setMatrix(List<List<Integer>> matrix) {
		this.matrix = matrix;
	}
}
