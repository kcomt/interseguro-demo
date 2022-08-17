package com.kcomt.interseguro.serviceimpl;

import com.kcomt.interseguro.model.MatrixRequest;
import com.kcomt.interseguro.model.MatrixResponse;

public interface IMatrixService {
	public MatrixResponse rotateNinetyDegrees(MatrixRequest matrix);
}
