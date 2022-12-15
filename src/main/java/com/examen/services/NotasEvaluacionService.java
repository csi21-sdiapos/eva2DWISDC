package com.examen.services;

import java.util.List;

import com.examen.models.NotasEvaluacion;


public interface NotasEvaluacionService {

	public void insertarNota(NotasEvaluacion nota);
	
	public List<NotasEvaluacion> buscarTodasLasNotas();
}
