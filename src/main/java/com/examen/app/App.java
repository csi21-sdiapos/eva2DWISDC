package com.examen.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examen.controllers.EvaluacionController;
import com.examen.controllers.NotasEvaluacionController;
import com.examen.models.Evaluacion;
import com.examen.models.NotasEvaluacion;

public class App {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("contexto.xml");
		
		EvaluacionController evaluacionController = (EvaluacionController) applicationContext.getBean(EvaluacionController.class);
		evaluacionController.insertarEvaluacion(new Evaluacion("PR", "Primera Evaluación"));
		evaluacionController.insertarEvaluacion(new Evaluacion("SG", "Segunda Evaluación"));
		evaluacionController.insertarEvaluacion(new Evaluacion("TC", "Tercera Evaluación"));
		

		NotasEvaluacionController notasEvaluacionController = (NotasEvaluacionController) applicationContext.getBean(NotasEvaluacionController.class);
		notasEvaluacionController.insertarNota(new NotasEvaluacion("alumno-1", 5, "PR"));
		notasEvaluacionController.insertarNota(new NotasEvaluacion("alumno-2", 7, "SG"));
		notasEvaluacionController.insertarNota(new NotasEvaluacion("alumno-3", 9, "TC"));
		
		
		
		
		System.out.println("Lista evaluaciones: " + evaluacionController.buscarTodasLasEvaluaciones());
		System.out.println("Lista notas: " + notasEvaluacionController.buscarTodasLasNotas());
	}

}
