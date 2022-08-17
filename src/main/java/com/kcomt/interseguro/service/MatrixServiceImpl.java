package com.kcomt.interseguro.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kcomt.interseguro.model.MatrixRequest;
import com.kcomt.interseguro.model.MatrixResponse;
import com.kcomt.interseguro.serviceimpl.IMatrixService;

@Service
public class MatrixServiceImpl implements IMatrixService {

	@Override
	public MatrixResponse rotateNinetyDegrees(MatrixRequest matrix) {

		MatrixResponse response = new MatrixResponse();

		try {
			if (matrixIsSquare(matrix.getMatrix())) {
				int N = matrix.getMatrix().size();
				int temp;

				for (int i = 0; i < N / 2; i++) {
					for (int j = i; j < N - i - 1; j++) {
						temp = matrix.getMatrix().get(i).get(j);

						matrix.getMatrix().get(i).set(j, matrix.getMatrix().get(j).get(N - 1 - i));

						matrix.getMatrix().get(j).set(N - 1 - i, matrix.getMatrix().get(N - 1 - i).get(N - 1 - j));

						matrix.getMatrix().get(N - 1 - i).set(N - 1 - j, matrix.getMatrix().get(N - 1 - j).get(i));

						matrix.getMatrix().get(N - 1 - j).set(i, temp);
					}
				}
				System.out.println(matrix.getMatrix());
				
				response.setMessageResponse("Ejecucion con exito");
				response.setIdReponse("0");
				response.setMatrix(matrix.getMatrix());
			} else {
				response.setMessageResponse("La matriz no es cuadrada (N!=M)");
				response.setIdReponse("1");
			}
		} catch (Exception e) {
			response.setMessageResponse("Ha occurido un error inesperado");
			response.setIdReponse("-1");
		}

		return response;
	}

	private Boolean matrixIsSquare(List<List<Integer>> matrix) {
		Boolean flagSquare = true;

		for (int i = 0; i < matrix.size(); i++) {
			if (matrix.size() != matrix.get(i).size()) {
				flagSquare = false;
			}
		}
		return flagSquare;
	}

}
