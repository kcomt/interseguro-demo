package com.kcomt.interseguro.model;

import java.util.ArrayList;
import java.util.List;

public class MatrixResponse {

	private String idReponse;
	private String messageResponse;
	private List<List<Integer>> matrix = new ArrayList<List<Integer>>();
	
	public MatrixResponse() {
	}

	public List<List<Integer>> getMatrix() {
		return matrix;
	}

	public void setMatrix(List<List<Integer>> matrix) {
		this.matrix = matrix;
	}
	public String getMessageResponse() {
		return messageResponse;
	}

	public void setMessageResponse(String messageResponse) {
		this.messageResponse = messageResponse;
	}
	public String getIdReponse() {
		return idReponse;
	}

	public void setIdReponse(String idReponse) {
		this.idReponse = idReponse;
	}
}
