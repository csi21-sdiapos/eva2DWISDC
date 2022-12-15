package com.examen.services;

import java.util.List;

import com.examen.models.Evaluacion;

public interface EvaluacionService {

	public void insertarEvaluacion(Evaluacion evaluacion);
	
	public List<Evaluacion> buscarTodasLasEvaluaciones();
}
