package com.examen.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.examen.implementations.NotasEvaluacionServiceImpl;
import com.examen.models.NotasEvaluacion;

@Component
public class NotasEvaluacionController {

	@Autowired
	private NotasEvaluacionServiceImpl notasEvaluacionServiceImpl;
	
	
	@Transactional
	public void insertarNota(NotasEvaluacion nota) {
		notasEvaluacionServiceImpl.insertarNota(nota);
	}
	
	@Transactional
	public List<NotasEvaluacion> buscarTodasLasNotas() {
		return notasEvaluacionServiceImpl.buscarTodasLasNotas();
	}
}
