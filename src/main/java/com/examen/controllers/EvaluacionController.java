package com.examen.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.examen.implementations.EvaluacionServiceImpl;
import com.examen.models.Evaluacion;

@Component
public class EvaluacionController {

	@Autowired
	private EvaluacionServiceImpl evaluacionServiceImpl;
	
	
	@Transactional
	public void insertarEvaluacion(Evaluacion evaluacion) {
		evaluacionServiceImpl.insertarEvaluacion(evaluacion);
	}
	
	@Transactional
	public List<Evaluacion> buscarTodasLasEvaluaciones() {
		return evaluacionServiceImpl.buscarTodasLasEvaluaciones();
	}
}
